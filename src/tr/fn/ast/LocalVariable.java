package tr.fn.ast;

public class LocalVariable extends Identifier {
	private final int index;

	public LocalVariable(Identifier identifier, int index) {
		super(identifier.getLine(), identifier.getName());
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

}
