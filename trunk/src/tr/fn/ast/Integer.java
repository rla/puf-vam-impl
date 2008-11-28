package tr.fn.ast;

import java.util.HashSet;
import java.util.Set;

public class Integer extends Expression {
	
	private final int value;

	public Integer(int line, int value) {
		super(line);
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		return new HashSet<Identifier>();
	}

	@Override
	public Set<Identifier> getIdentifiers() {
		return new HashSet<Identifier>();
	}
	
}
