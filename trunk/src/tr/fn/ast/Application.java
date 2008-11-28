package tr.fn.ast;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application extends Expression {
	private final Expression fExpression;
	private final List<Expression> arguments;
	
	public Application(int line, Expression fExpression, List<Expression> arguments) {
		super(line);
		this.fExpression = fExpression;
		this.arguments = arguments;
	}

	public List<Expression> getArguments() {
		return arguments;
	}

	public Expression getFExpression() {
		return fExpression;
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> free = new HashSet<Identifier>();
		free.addAll(fExpression.getFreeVariables());
		
		for (Expression expression : arguments) {
			free.addAll(expression.getFreeVariables());
		}
		
		return free;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("(apply " + fExpression);
		
		if (!arguments.isEmpty()) {
			builder.append(" ");
			boolean first = true;
			for (Expression argument : arguments) {
				if (first) {
					first = false;
				} else {
					builder.append(' ');
				}
				builder.append("(" + argument + ")");
			}
		}
		
		return builder.toString() + ")";
	}

	@Override
	public Set<Identifier> getIdentifiers() {
		Set<Identifier> identifiers = new HashSet<Identifier>();
		identifiers.addAll(fExpression.getIdentifiers());
		
		for (Expression expression : arguments) {
			identifiers.addAll(expression.getIdentifiers());
		}
		
		return identifiers;
	}

}
