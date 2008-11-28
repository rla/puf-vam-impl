package tr.fn.gen.instr;

public class Rewrite extends Instruction {
	private final int n;

	public Rewrite(int n) {
		super("rewrite");
		this.n = n;
	}

	public int getN() {
		return n;
	}

	@Override
	public String toString() {
		return "rewrite " + n;
	}

}
