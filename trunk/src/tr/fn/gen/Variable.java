package tr.fn.gen;

import tr.fn.ast.Identifier;

public class Variable {
	private final Identifier identifier;
	private final int id;
	private final VariableType type;
	
	public Variable(Identifier identifier, int id, VariableType type) {
		this.identifier = identifier;
		this.id = id;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public VariableType getType() {
		return type;
	}

	public Identifier getIdentifier() {
		return identifier;
	}
	
	public boolean isLocal() {
		return type == VariableType.LOCAL;
	}

	@Override
	public String toString() {
		return identifier + "->(" + (isLocal() ? "L" : "G") + "," + id + ")";
	}
	
}
