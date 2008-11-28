package tr.fn.gen.instr;

public abstract class Instruction {
	private final String name;

	public Instruction(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
	
}
