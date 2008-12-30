package tr.fn.gen.instr;

public class Tlist extends Instruction {
	private final Label label;
	
	public Tlist(Label label) {
		super("tlist");
		this.label = label;
	}

	@Override
	public String toString() {
		return "tlist " + label.getLabel();
	}

	public Label getLabel() {
		return label;
	}

}
