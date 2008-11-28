package tr.fn.gen.instr;

/**
 * Loads given integer constant onto the stack.
 */
public class LoadC extends Instruction {
	private final int value;
	
	public LoadC(int value) {
		super("loadc");
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return getName() + " " + value;
	}
	
}
