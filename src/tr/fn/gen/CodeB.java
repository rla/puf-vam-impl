package tr.fn.gen;

import tr.fn.ast.Expression;
import tr.fn.ast.Identifier;
import tr.fn.ast.IfThenElse;
import tr.fn.ast.Integer;
import tr.fn.ast.op.BinaryOperator;
import tr.fn.gen.instr.BinaryOpInstruction;
import tr.fn.gen.instr.GetBasic;
import tr.fn.gen.instr.LoadC;

public class CodeB {
	
	/**
	 * Generates code for basic values.
	 * 
	 * @see MaMa slides page 9.
	 */
	public static final void codeB(Environment environment, GenerationContext context, Expression e, int sd) throws GenerateException {
		// FIXME implement if then else!!!
		if (e instanceof Integer) {
			codeBInteger(environment, context, (Integer) e, sd);
		} else if (e instanceof BinaryOperator) {
			codeBBinaryOperator(environment, context, (BinaryOperator) e, sd);
		} else if (e instanceof Identifier) {
			codeBIdentifier(environment, context, (Identifier) e, sd);
		} else if (e instanceof IfThenElse) {
			throw new RuntimeException("unimplemented if-then");
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
		codeB(environment, context, e.getLeft(), sd);
		codeB(environment, context, e.getRight(), sd + 1);
		context.addInstruction(new BinaryOpInstruction(e));
	}

	private static void codeBInteger(Environment environment, GenerationContext context, Integer e, int sd) {
		context.addInstruction(new LoadC(e.getValue()));
	}
}
