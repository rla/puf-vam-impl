package tr.fn.gen;

import tr.fn.ast.BinaryOperator;
import tr.fn.ast.Expression;
import tr.fn.ast.Identifier;
import tr.fn.ast.IfThenElse;
import tr.fn.ast.Number;
import tr.fn.gen.instr.BinaryOpInstruction;
import tr.fn.gen.instr.GetBasic;
import tr.fn.gen.instr.Jump;
import tr.fn.gen.instr.Jumpz;
import tr.fn.gen.instr.Label;
import tr.fn.gen.instr.LoadC;

public class CodeB {
	
	/**
	 * Generates code for basic values.
	 * 
	 * @see MaMa slides page 9.
	 */
	public static final void codeB(Environment environment, GenerationContext context, Expression e, int sd) throws GenerateException {
		context.debug("codeB " + environment + " " + e);
		if (e instanceof Number) {
			codeBInteger(environment, context, (Number) e, sd);
		} else if (e instanceof BinaryOperator) {
			codeBBinaryOperator(environment, context, (BinaryOperator) e, sd);
		} else if (e instanceof Identifier) {
			codeBIdentifier(environment, context, (Identifier) e, sd);
		} else if (e instanceof IfThenElse) {
			codeBIfThenElse(environment, context, (IfThenElse) e, sd);
		} else {
			CodeV.codeV(environment, context, e, sd);
			context.addInstruction(new GetBasic());
		}
	}

	private static void codeBIdentifier(Environment environment, GenerationContext context, Identifier e, int sd) throws GenerateException {
		CodeV.codeV(environment, context, e, sd);
		context.addInstruction(new GetBasic());
	}

	private static void codeBBinaryOperator(Environment environment, GenerationContext context, BinaryOperator e, int sd) throws GenerateException {
		codeB(environment, context, e.left, sd);
		codeB(environment, context, e.right, sd + 1);
		context.addInstruction(new BinaryOpInstruction(e));
	}

	private static void codeBInteger(Environment environment, GenerationContext context, Number e, int sd) {
		context.addInstruction(new LoadC(e.value));
	}
	
	private static void codeBIfThenElse (Environment environment, GenerationContext context, IfThenElse e, int sd) throws GenerateException {
		Label A = context.makeLabel();
		Label B = context.makeLabel();
		
		codeB(environment, context, e.condition, sd);
		context.addInstruction(new Jumpz(A));
		codeB(environment, context, e.thenExpression, sd);
		context.addInstruction(new Jump(B));
		context.addInstruction(A);
		codeB(environment, context, e.elseExpression, sd);
		context.addInstruction(B);
	}
}
