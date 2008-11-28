package tr.fn.gen.instr;

public class Pushloc extends Instruction {
	private final int n;
	
	public Pushloc(int n) {
		super("pushloc");
		this.n = n;
	}

	public int getN() {
		return n;
	}

	@Override
	public String toString() {
		return "pushloc " + n;
	}

}
