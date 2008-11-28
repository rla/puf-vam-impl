package tr.fn.gen;

import java.util.Collection;
import java.util.List;

import tr.fn.ast.Application;
import tr.fn.ast.Declaration;
import tr.fn.ast.Expression;
import tr.fn.ast.Identifier;
import tr.fn.ast.IfThenElse;
import tr.fn.ast.Integer;
import tr.fn.ast.Lambda;
import tr.fn.ast.LetRec;
import tr.fn.ast.op.BinaryOperator;
import tr.fn.debug.Debug;
import tr.fn.gen.instr.Alloc;
import tr.fn.gen.instr.Apply;
import tr.fn.gen.instr.BinaryOpInstruction;
import tr.fn.gen.instr.Eval;
import tr.fn.gen.instr.Jump;
import tr.fn.gen.instr.Jumpz;
import tr.fn.gen.instr.Label;
import tr.fn.gen.instr.LoadC;
import tr.fn.gen.instr.Mark;
import tr.fn.gen.instr.MkBasic;
import tr.fn.gen.instr.MkFunval;
import tr.fn.gen.instr.MkVec;
import tr.fn.gen.instr.Pushglob;
import tr.fn.gen.instr.Pushloc;
import tr.fn.gen.instr.Return;
import tr.fn.gen.instr.Rewrite;
import tr.fn.gen.instr.Slide;
import tr.fn.gen.instr.Targ;

/**
 * codeV implementation for generating instructions.
 */
public class CodeV {
	
	public static void codeV(Environment environment, GenerationContext context, Expression e, int sd) throws GenerateException {
		if (e instanceof Identifier) {
			codeVIdentifier(environment, context, (Identifier) e, sd);
		} else if (e instanceof Integer) {
			codeVInteger(environment, context, (Integer) e, sd);
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
		} else {
			throw new GenerateException("Unknown expression: " + e.getClass());
		}
	}

	/**
	 * Generates code for if-then-else expression.
	 * 
	 * @see MaMa slides page 13.
	 */
	private static void codeVIfThenElse(Environment environment, GenerationContext context, IfThenElse e, int sd) throws GenerateException {
		Label A = context.makeLabel();
		Label B = context.makeLabel();
		
		CodeB.codeB(environment, context, e.getCondition(), sd);
		context.addInstruction(new Jumpz(A));
		codeV(environment, context, e.getThenExpression(), sd);
		context.addInstruction(new Jump(B));
		context.addInstruction(A);
		codeV(environment, context, e.getElseExpression(), sd);
		context.addInstruction(B);
	}

	/**
	 * Generates code for function application.
	 * 
	 * @see MaMa slides page 34.
	 */
	private static void codeVApplication(Environment environment, GenerationContext context, Application e, int sd) throws GenerateException {
		Label A = context.makeLabel();
		context.addInstruction(new Mark(A));
		
		if (context.isDebug()) {
			System.out.println("Function application");
			System.out.println("Expression: " + e);
			System.out.println("Arguments: ");
			for (Expression arg : e.getArguments()) {
				System.out.println("  " + arg);
			}
			System.out.println();
		}
		
		int m = 0;
		for (int i = e.getArguments().size() - 1; i >= 0; i--) {
			CodeC.codeC(environment, context, e.getArguments().get(i), sd + 3 + m);
			m++;
		}
		
		codeV(environment, context, e.getFExpression(), sd + 3 + m);
		
		context.addInstruction(new Apply());
		context.addInstruction(A);
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
		List<Identifier> arguments = e.getArguments();
		System.out.println("codeV: " + e);
		Debug.printFreeVariables(e);
		
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
		codeV(environment1, context, e.getExpression(), 0);
		context.addInstruction(new Return(k));
		context.addInstruction(B);
	}

	/**
	 * Letrec expression.
	 * 
	 * @see MaMa slides page 53.
	 */
	private static void codeVLetRec(Environment environment, GenerationContext context, LetRec e, int sd) throws GenerateException {
		int n = e.getDeclarations().size();
		Environment environment1 = new Environment(environment);
		
		int i = 0;
		for (Declaration declaration : e.getDeclarations()) {
			environment1.addVariable(new Variable(declaration.getName(), sd + i + 1, VariableType.LOCAL));
			i++;
		}
		
		context.addInstruction(new Alloc(n));
		
		System.out.println("Environment1:\n" + environment1);
		
		i = 0;
		for (Declaration declaration : e.getDeclarations()) {
			CodeC.codeC(environment1, context, declaration.getExpression(), sd + n);
			context.addInstruction(new Rewrite(n - i));
			i++;
		}
		
		codeV(environment1, context, e.getInExpression(), sd + n);
		context.addInstruction(new Slide(n));
	}
	
	/**
	 * Simple expression (integer).
	 * 
	 * @see MaMa slides page 12.
	 */
	private static void codeVInteger(Environment environment, GenerationContext context, Integer e, int sd) {
		context.addInstruction(new LoadC(e.getValue()));
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
			throw new GenerateException("Unknown variable " + e + " at line " + e.getLine() + "\nEnvironment: \n" + environment.toString());
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
		CodeB.codeB(environment, context, e.getLeft(), sd);
		CodeB.codeB(environment, context, e.getRight(), sd + 1);
		
		context.addInstruction(new BinaryOpInstruction(binaryOperator));
		context.addInstruction(new MkBasic());
	}
	
}
