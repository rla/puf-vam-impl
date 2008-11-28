package tr.fn.gen.instr;

public class Targ extends Instruction {
	private final int k;

	public Targ(int k) {
		super("targ");
		this.k = k;
	}

	@Override
	public String toString() {
		return "targ " + k;
	}
	
}
