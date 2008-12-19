package tr.fn.gen.instr;

public class GetVec extends Instruction {
	private final int size;
	
	public GetVec(int size) {
		super("getvec");
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "getvec " + size;
	}
}
