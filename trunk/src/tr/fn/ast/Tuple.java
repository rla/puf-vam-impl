package tr.fn.ast;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tuple extends Expression {
	private List<Expression> expressions;

	public Tuple(int line, List<Expression> expressions) {
		super(line);
		this.expressions = expressions;
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> free = new HashSet<Identifier>();
		
		for (Expression e : expressions) {
			free.addAll(e.getFreeVariables());
		}
		
		return free;
	}

	@Override
	public Set<Identifier> getIdentifiers() {
		Set<Identifier> identifiers = new HashSet<Identifier>();
		
		for (Expression e : expressions) {
			identifiers.addAll(e.getIdentifiers());
		}
		
		return identifiers;
	}

	public List<Expression> getExpressions() {
		return expressions;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append('(');
		boolean first = true;
		for (Expression e : expressions) {
			if (first) {
				first = false;
			} else {
				builder.append(',');
			}
			builder.append(e);
		}
		builder.append(')');
		
		return builder.toString();
	}

}
