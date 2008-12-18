package tr.fn.gen.instr;

import tr.fn.ast.BinaryOperator;


public class BinaryOpInstruction extends Instruction {
	private final BinaryOperator binaryOperator;

	public BinaryOpInstruction(BinaryOperator operator) {
		super("Binary operator");
		this.binaryOperator = operator;
	}

	@Override
	public String toString() {
		return binaryOperator.type.getName();
	}

}
