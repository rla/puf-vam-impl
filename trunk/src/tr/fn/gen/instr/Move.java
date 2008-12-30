package tr.fn.gen.instr;

public class Move extends Instruction {
	private final int r;
	private final int m;
	
	public Move(int r, int m) {
		super("move");
		this.r = r;
		this.m = m;
	}

	@Override
	public String toString() {
		return "move " + r + " " + m;
	}

}
