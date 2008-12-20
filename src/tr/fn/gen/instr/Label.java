package tr.fn.gen.instr;

public class Label extends Instruction {
	private final String label;
	
	public Label(String label) {
		super("Jump label");
		this.label = label;
	}

	@Override
	public String toString() {
		return label + ":";
	}

	public String getLabel() {
		return label;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Label && ((Label) obj).getLabel().equals(label);
	}

	@Override
	public int hashCode() {
		return label.hashCode();
	}
	
}
