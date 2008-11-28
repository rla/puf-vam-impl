package tr.fn.gen.instr;

public class Mark extends Instruction {
	private final Label label;
	
	public Mark(Label label) {
		super("mark");
		this.label = label;
	}

	@Override
	public String toString() {
		return "mark " + label.getLabel();
	}

}
