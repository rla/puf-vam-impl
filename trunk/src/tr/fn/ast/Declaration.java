package tr.fn.ast;

import java.util.Set;

/**
 * (= name expression)
 */
public class Declaration extends Expression {
	private final Expression expression;
	private final Identifier name;

	public Declaration(int line, Identifier name, Expression expression) {
		super(line);
		this.name = name;
		this.expression = expression;
	}

	public Identifier getName() {
		return name;
	}

	public Expression getExpression() {
		return expression;
	}

	@Override
	public Set<Identifier> getFreeVariables() {		
		return expression.getFreeVariables();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(name);
		builder.append(" = ");
		builder.append(expression.toString());
		
		return builder.toString();
	}

}
