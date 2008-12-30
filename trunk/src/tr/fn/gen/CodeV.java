package tr.fn.gen;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import tr.fn.ast.Application;
import tr.fn.ast.BinaryOperator;
import tr.fn.ast.Declaration;
import tr.fn.ast.Expression;
import tr.fn.ast.Identifier;
import tr.fn.ast.IfThenElse;
import tr.fn.ast.Lambda;
import tr.fn.ast.Let;
import tr.fn.ast.LetRec;
import tr.fn.ast.Number;
import tr.fn.ast.Tuple;
import tr.fn.ast.TupleLet;
import tr.fn.ast.list.Calt;
import tr.fn.ast.list.Case;
import tr.fn.ast.list.HeadTailList;
import tr.fn.gen.instr.Alloc;
import tr.fn.gen.instr.Apply;
import tr.fn.gen.instr.BinaryOpInstruction;
import tr.fn.gen.instr.Cons;
import tr.fn.gen.instr.Eval;
import tr.fn.gen.instr.Jump;
import tr.fn.gen.instr.Jumpz;
import tr.fn.gen.instr.Label;
import tr.fn.gen.instr.LoadC;
import tr.fn.gen.instr.Mark;
import tr.fn.gen.instr.MkBasic;
import tr.fn.gen.instr.MkFunval;
import tr.fn.gen.instr.MkVec;
import tr.fn.gen.instr.GetVec;
import tr.fn.gen.instr.Get;
import tr.fn.gen.instr.Move;
import tr.fn.gen.instr.Neg;
import tr.fn.gen.instr.Nil;
import tr.fn.gen.instr.Not;
import tr.fn.gen.instr.Pushglob;
import tr.fn.gen.instr.Pushloc;
import tr.fn.gen.instr.Return;
import tr.fn.gen.instr.Rewrite;
import tr.fn.gen.instr.Slide;
import tr.fn.gen.instr.Targ;
import tr.fn.gen.instr.Tlist;

/**
 * codeV implementation for generating instructions.
 */
public class CodeV {
	
	public static void codeV(Environment environment, GenerationContext context, Expression e, int sd) throws GenerateException {
		context.debug("codeV " + environment + " " + e + " " + sd);

		if (e instanceof Identifier) {
			codeVIdentifier(environment, context, (Identifier) e, sd);
		} else if (e instanceof Number) {
			codeVInteger(environment, context, (Number) e, sd);
		} else if (e instanceof Lambda) {
			codeVLambda(environment, context, (Lambda) e, sd);
		} else if (e instanceof LetRec) {
			codeVLetRec(environment, context, (LetRec) e, sd);
		} else if (e instanceof BinaryOperator) {
			codeVBinaryOperator(environment, context, (BinaryOperator) e, sd);
		} else if (e instanceof Application) {
			codeVApplication(environment, context, (Application) e, sd);
		} else if (e instanceof IfThenElse) {
			codeVIfThenElse(environment, context, (IfThenElse) e, sd);
		} else if (e instanceof Let) {
			codeVLet(environment, context, (Let) e, sd);
		} else if (e instanceof Tuple) {
			codeVTuple(environment, context, (Tuple) e, sd);
		} else if (e instanceof TupleLet) {
			codeVTupleLet(environment, context, (TupleLet) e, sd);
		} else if (e instanceof HeadTailList) {
			codeVHeadTailList(environment, context, (HeadTailList) e, sd);	
		} else if (e instanceof Case) {
			codeVCase(environment, context, (Case) e, sd);	
		} else {
			throw new GenerateException("Unknown expression: " + e.getClass());
		}
	}

	/**
	 * Generates code for let expression.
	 * 
	 * @see MaMa slides page 51.
	 */
	private static void codeVLet(Environment environment, GenerationContext context, Let e, int sd) throws GenerateException {
		int n = e.declarations.size();
		
		Environment environment1 = null;
		int j = 0;
		for (Declaration declaration : e.declarations) {
			environment1 = environment.getCopy();
			for (int i = 0; i < j; i++) {
				environment1.addVariable(new Variable(e.declarations.get(i).name, sd + i + 1, VariableType.LOCAL));
			}
			
			Expression dExp = declaration.expression;
			CodeC.codeC(environment1, context, dExp, sd + j);
			
			j++;
		}
		
		environment1 = environment.getCopy();
		for (int i = 0; i < n; i++) {
			environment1.addVariable(new Variable(e.declarations.get(i).name, sd + i + 1, VariableType.LOCAL));
		}
		
		codeV(environment1, context, e.inExpression, sd + n);
		context.addInstruction(new Slide(n));
	}

	/**
	 * Generates code for if-then-else expression.
	 * 
	 * @see MaMa slides page 13.
	 */
	private static void codeVIfThenElse(Environment environment, GenerationContext context, IfThenElse e, int sd) throws GenerateException {
		Label A = context.makeLabel();
		Label B = context.makeLabel();
		
		CodeB.codeB(environment, context, e.condition, sd);
		context.addInstruction(new Jumpz(A));
		codeV(environment, context, e.thenExpression, sd);
		context.addInstruction(new Jump(B));
		context.addInstruction(A);
		codeV(environment, context, e.elseExpression, sd);
		context.addInstruction(B);
	}

	/**
	 * Generates code for function application.
	 * 
	 * @see MaMa slides page 34.
	 */
	private static void codeVApplication(Environment environment, GenerationContext context, Application e, int sd) throws GenerateException {	
		if (e.functionExpression instanceof Identifier){
			Identifier id = (Identifier) e.functionExpression;
			if (id.name.equals(Identifier.SELECT)){
				codeVSelect(environment, context, e, sd);
				return;
			}
			else if (id.name.equals(Identifier.NOT)){
				codeVNot(environment, context, e, sd);
				return;
			}
			else if (id.name.equals(Identifier.NEG)){
				codeVNeg(environment, context, e, sd);
				return;
			}
		}
		
		Declaration declaration = e.findDeclaration();
		
		if (declaration != null && e.isTailCall()) {
			context.debug("Tail call");
			codeVTailApplication(environment, context, e, sd, declaration);
			return;
		}
		
		Label A = context.makeLabel();
		context.addInstruction(new Mark(A));
		
		int m = 0;
		int n = e.argumentExpressions.size();
		for (int i = n - 1; i >= 0; i--) {
			
			if (context.isTryToEliminateClosures()
				&& declaration != null
				&& context.hasStrictnessInformation(declaration)
				&& context.isStrict(declaration, i)) {
				
				context.debug("Passing argument " + i + " strictly");
				codeV(environment, context, e.argumentExpressions.get(i), sd + 3 + m);
			} else {
				CodeC.codeC(environment, context, e.argumentExpressions.get(i), sd + 3 + m);
			}
			m++;
		}
		
		codeV(environment, context, e.functionExpression, sd + 3 + m);
		
		context.addInstruction(new Apply());
		context.addInstruction(A);
	}
	
	/**
	 * Generates code for function application in tail position.
	 * 
	 * @see Other slides page 222.
	 */
	private static void codeVTailApplication(Environment environment, GenerationContext context, Application e, int sd, Declaration declaration) throws GenerateException {
		int k = e.getUpperArgNum();
		int n = e.argumentExpressions.size();
		int m = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (context.isTryToEliminateClosures()
				&& declaration != null
				&& context.hasStrictnessInformation(declaration)
				&& context.isStrict(declaration, i)) {
				
				context.debug("Passing argument " + i + " strictly");
				codeV(environment, context, e.argumentExpressions.get(i), sd + m);
			} else {
				CodeC.codeC(environment, context, e.argumentExpressions.get(i), sd + m);
			}
			m++;
		}
		
		codeV(environment, context, e.functionExpression, sd + m);
		
		context.addInstruction(new Move(sd + k, m + 1));
		context.addInstruction(new Apply());
	}

	/**
	 * Generates code for function declaration.
	 * 
	 * @see MaMa slides page 29.
	 */
	private static void codeVLambda(Environment environment, GenerationContext context, Lambda e, int sd) throws GenerateException {
		Label A = context.makeLabel();
		Label B = context.makeLabel();
		
		Collection<Identifier> free = e.getFreeVariables();
		List<Identifier> arguments = e.arguments;
		
		Environment environment1 = new Environment(environment);
		
		int i = 0;
		for (Identifier identifier : arguments) {
			environment1.addVariable(new Variable(identifier, -i, VariableType.LOCAL));
			i++;
		}
		
		i = 0;
		for (Identifier identifier : free) {
			Code.getvar(identifier, environment, context, sd + i);
			environment1.addVariable(new Variable(identifier, i, VariableType.GLOBAL));
			i++;
		}
		
		int g = free.size();
		int k = arguments.size();
		context.addInstruction(new MkVec(g));
		context.addInstruction(new MkFunval(A));
		
		context.addInstruction(new Jump(B));
		context.addInstruction(A);
		context.addInstruction(new Targ(k));
		codeV(environment1, context, e.expression, 0);
		context.addInstruction(new Return(k));
		context.addInstruction(B);
	}

	/**
	 * Letrec expression.
	 * 
	 * @see MaMa slides page 53.
	 */
	private static void codeVLetRec(Environment environment, GenerationContext context, LetRec e, int sd) throws GenerateException {
		int n = e.declarations.size();
		Environment environment1 = environment.getCopy();
		
		int i = 0;
		for (Declaration declaration : e.declarations) {
			environment1.addVariable(new Variable(declaration.name, sd + i + 1, VariableType.LOCAL));
			i++;
		}
		
		context.addInstruction(new Alloc(n));
		
		i = 0;
		for (Declaration declaration : e.declarations) {
			Expression dExp = declaration.expression;
			CodeC.codeC(environment1, context, dExp, sd + n);
			context.addInstruction(new Rewrite(n - i));
			i++;
		}
		
		codeV(environment1, context, e.inExpression, sd + n);
		context.addInstruction(new Slide(n));
	}
	
	/**
	 * Simple expression (integer).
	 * 
	 * @see MaMa slides page 12.
	 */
	private static void codeVInteger(Environment environment, GenerationContext context, Number e, int sd) {
		context.addInstruction(new LoadC(e.value));
		context.addInstruction(new MkBasic());
	}
	
	/**
	 * Variable expression.
	 * 
	 * @see MaMa slides page 24.
	 */
	private static void codeVIdentifier(Environment environment, GenerationContext context, Identifier e, int sd) throws GenerateException {
		Variable variable = environment.getVariable(e);
		if (variable == null) {
			throw new GenerateException("Unknown variable " + e + "\nEnvironment: \n" + environment.toString());
		}
		
		if (variable.isLocal()) {
			context.addInstruction(new Pushloc(sd - variable.getId()));
			context.addInstruction(new Eval());
		} else {
			context.addInstruction(new Pushglob(variable.getId()));
			context.addInstruction(new Eval());
		}
	}
	
	/**
	 * Creates code for the binary operator.
	 * 
	 * @see MaMa slides page 12.
	 */
	private static void codeVBinaryOperator(Environment environment, GenerationContext context, BinaryOperator e, int sd) throws GenerateException {
		BinaryOperator binaryOperator = (BinaryOperator) e;
		CodeB.codeB(environment, context, e.left, sd);
		CodeB.codeB(environment, context, e.right, sd + 1);
		
		context.addInstruction(new BinaryOpInstruction(binaryOperator));
		context.addInstruction(new MkBasic());
	}
	
	/**
	 * Creates code for tuple
	 * 
	 * @see MaMa slides page 86.
	 */
	private static void codeVTuple(Environment environment, GenerationContext context, Tuple e, int sd) throws GenerateException {
		int n = e.arguments.size();
		for (int i = 0; i < n; i++) {
			CodeC.codeC(environment, context, e.arguments.get(i), sd + i);
		}
		context.addInstruction(new MkVec(n));
	}
	
	/**
	 * Creates code for let expression with tuple
	 * 
	 * @see MaMa slides page 88.
	 */
	private static void codeVTupleLet(Environment environment, GenerationContext context, TupleLet e, int sd) throws GenerateException {
		int n = e.tuple.arguments.size();
		
		codeV(environment, context, e.expression, sd);
		context.addInstruction(new GetVec(n));
		
		Environment environment1 = environment.getCopy();
		int i = 0;
		for (Expression expression : e.tuple.arguments) {
			Identifier id = (Identifier) expression;
			environment1.addVariable(new Variable(id, sd + i, VariableType.LOCAL));
			i++;
		}
		codeV(environment1, context, e.inExpression, sd + n - 1);
		context.addInstruction(new Slide(n));
	}
	
	/**
	 * Creates code for the select operator
	 * 
	 * @see MaMa slides page 86.
	 */
	private static void codeVSelect(Environment environment, GenerationContext context, Application e, int sd) throws GenerateException {
			Expression n = e.argumentExpressions.get(0);
			if (n instanceof Number){
				List<Expression> list = Collections.emptyList();
				Expression arg = e.argumentExpressions.get(1);
				if (arg instanceof Identifier){
					Identifier id = (Identifier) arg;
					if (id.findDeclaration() != null){
						arg = new Application(arg, list);
					}					
				}
				codeV(environment, context, arg, sd);
				context.addInstruction(new Get(((Number) n).value));
				context.addInstruction(new Eval());
			}
	}
	
	/**
	 * Unary operation NOT
	 * 
	 * @see MaMa slides page 12.
	 */
	private static void codeVNot(Environment environment, GenerationContext context, Application e, int sd) throws GenerateException {
		List<Expression> list = Collections.emptyList();
		Expression arg = e.argumentExpressions.get(0);
		if (arg instanceof Identifier){
			Identifier id = (Identifier) arg;
			if (id.findDeclaration() != null){
				arg = new Application(arg, list);
			}					
		}
		CodeB.codeB(environment, context, arg, sd);
		context.addInstruction(new Not());
		context.addInstruction(new MkBasic());
	}
	
	/**
	 * Unary operation NEG
	 * 
	 * @see MaMa slides page 12.
	 */
	private static void codeVNeg(Environment environment, GenerationContext context, Application e, int sd) throws GenerateException {
		List<Expression> list = Collections.emptyList();
		Expression arg = e.argumentExpressions.get(0);
		if (arg instanceof Identifier){
			Identifier id = (Identifier) arg;
			if (id.findDeclaration() != null){
				arg = new Application(arg, list);
			}					
		}
		CodeB.codeB(environment, context, arg, sd);
		context.addInstruction(new Neg());
		context.addInstruction(new MkBasic());
	}
	
	/**
	 * List operation for lists without the case operator
	 * 
	 * @see MaMa slides page 91.
	 */
	private static void codeVHeadTailList(Environment environment, GenerationContext context, HeadTailList e, int sd) throws GenerateException {
		if (e.isEmpty()){
			context.addInstruction(new Nil());
		} else {
			CodeC.codeC(environment, context, e.head, sd);	
			CodeC.codeC(environment, context, e.tail, sd + 1);
			context.addInstruction(new Cons());
		}
	}
	
	/**
	 * List making with case operator
	 * 
	 * @see MaMa slides page 94.
	 */
	private static void codeVCase(Environment environment, GenerationContext context, Case e, int sd) throws GenerateException {
		Label A = context.makeLabel();
		Label B = context.makeLabel();
		
		codeV(environment, context, e.expression, sd);
		context.addInstruction(new Tlist(A));
		codeV(environment, context, e.nalt, sd);
		context.addInstruction(new Jump(B));
		context.addInstruction(A);
		
		Environment environment1 = environment.getCopy();
		Calt ht = (Calt) e.calt;
		environment1.addVariable(new Variable(ht.head, sd + 1, VariableType.LOCAL));
		environment1.addVariable(new Variable(ht.tail, sd + 2, VariableType.LOCAL));

		codeV(environment1, context, e.calt, sd + 2);
		context.addInstruction(new Slide(2));
		context.addInstruction(B);
	}
}
