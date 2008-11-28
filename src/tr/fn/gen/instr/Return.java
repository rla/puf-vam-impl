package tr.fn.gen.instr;

public class Return extends Instruction {
	private final int k;
	
	public Return(int k) {
		super("return");
		this.k = k;
	}

	@Override
	public String toString() {
		return "return " + k;
	}

}
