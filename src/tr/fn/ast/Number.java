package tr.fn.ast;

import java.util.HashSet;
import java.util.Set;

public class Number extends Expression implements Simple {
	public final Integer value;

	public Number(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value.toString();
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		return new HashSet<Identifier>();
	}

	@Override
	public boolean isSimpleStrict() {
		return true;
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
