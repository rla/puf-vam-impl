package tr.fn.gen.instr;

public class Pushglob extends Instruction {
	private final int n;
	
	public Pushglob(int n) {
		super("pushglob");
		this.n = n;
	}

	@Override
	public String toString() {
		return "pushglob " + n;
	}
	
}
