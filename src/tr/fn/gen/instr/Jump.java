package tr.fn.gen.instr;

public class Jump extends Instruction {
	private final Label label;
	
	public Jump(Label label) {
		super("jump");
		this.label = label;
	}

	@Override
	public String toString() {
		return "jump " + label.getLabel();
	}

	public Label getLabel() {
		return label;
	}

}
