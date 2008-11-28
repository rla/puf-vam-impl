package tr.fn.ast;

import java.util.List;
import java.util.Set;

public class Lambda extends Expression {
	private final Expression expression;
	private final List<Identifier> arguments;

	public Lambda(int line, List<Identifier> arguments, Expression expression) {
		super(line);
		this.arguments = arguments;
		this.expression = expression;
	}

	public Expression getExpression() {
		return expression;
	}

	public List<Identifier> getArguments() {
		return arguments;
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> free = expression.getFreeVariables();
		free.removeAll(arguments);
		
		return free;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("fn");
		
		if (!arguments.isEmpty()) {
			builder.append(" ");
			boolean first = true;
			for (Identifier argument : arguments) {
				if (first) {
					first = false;
				} else {
					builder.append(' ');
				}
				builder.append(argument);
			}
		}
		
		builder.append(" -> ");
		builder.append(expression.toString());
		
		return builder.toString();
	}

}
