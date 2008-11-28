package tr.fn.gen.instr;

public class MkVec extends Instruction {
	private final int size;
	
	public MkVec(int size) {
		super("mkvec");
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "mkvec " + size;
	}

}
