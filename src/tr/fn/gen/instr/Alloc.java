package tr.fn.gen.instr;

public class Alloc extends Instruction {
	private final int size;
	
	public Alloc(int size) {
		super("alloc");
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "alloc " + size;
	}

}
