package tr.fn.gen.instr;

public class Jumpz extends Instruction {
	private final Label label;
	
	public Jumpz(Label label) {
		super("jumpz");
		this.label = label;
	}

	@Override
	public String toString() {
		return "jumpz " + label.getLabel();
	}
	
}
