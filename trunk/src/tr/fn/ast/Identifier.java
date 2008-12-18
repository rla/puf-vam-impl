package tr.fn.ast;

import java.util.HashSet;
import java.util.Set;

public class Identifier extends Expression implements Simple {
	public final String name;

	public Identifier(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Identifier && ((Identifier) obj).name.equals(name);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> free = new HashSet<Identifier>();
		free.add(this);
		
		return free;
	}

	@Override
	public boolean isSimpleStrict() {
		return false;
	}

	@Override
	public void markEnclosingLambda(Lambda lambda) {
		setEnclosingLambda(lambda);
	}

	@Override
	public void markEnclosingLet(LetBase let) {
		setEnclosingLet(let);
	}
	
}
