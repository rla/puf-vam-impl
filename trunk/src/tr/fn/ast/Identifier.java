package tr.fn.ast;

import java.util.HashSet;
import java.util.Set;


public class Identifier extends Expression {
	private final String name;

	public Identifier(int line, String name) {
		super(line);
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Identifier && ((Identifier) obj).getName().equals(name);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> free = new HashSet<Identifier>();
		free.add(this);
		
		return free;
	}

	@Override
	public Set<Identifier> getIdentifiers() {
		Set<Identifier> identifiers = new HashSet<Identifier>();
		identifiers.add(this);
		
		return identifiers;
	}
	
}
