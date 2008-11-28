package tr.fn.gen.instr;

public class Slide extends Instruction {
	private final int n;
	
	public Slide(int n) {
		super("slide");
		this.n = n;
	}

	public int getN() {
		return n;
	}

	@Override
	public String toString() {
		return "slide " + n;
	}

}
