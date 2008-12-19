package tr.fn.gen.instr;

public class Get extends Instruction {
	private final int n;
	
	public Get(int n) {
		super("get");
		this.n = n;
	}

	public int getN() {
		return n;
	}

	@Override
	public String toString() {
		return "get " + n;
	}

}