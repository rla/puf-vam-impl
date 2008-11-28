package tr.fn.gen.instr;

public class MkFunval extends Instruction {
	private final Label label;
	
	public MkFunval(Label label) {
		super("mkfunval");
		this.label = label;
	}

	@Override
	public String toString() {
		return "mkfunval " + label.getLabel();
	}

}
