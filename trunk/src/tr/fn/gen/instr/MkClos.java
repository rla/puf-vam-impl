package tr.fn.gen.instr;

public class MkClos extends Instruction {
	private final Label label;
	
	public MkClos(Label label) {
		super("mkclos");
		this.label = label;
	}

	public Label getLabel() {
		return label;
	}

	@Override
	public String toString() {
		return "mkclos " + label.getLabel();
	}

}
