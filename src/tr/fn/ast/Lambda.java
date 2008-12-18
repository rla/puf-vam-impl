package tr.fn.ast;

import java.util.List;
import java.util.Set;


public class Lambda extends Expression {
	public final Expression expression;
	public final List<Identifier> arguments;
	
	public Lambda(List<Identifier> arguments, Expression expression) {
		this.arguments = arguments;
		this.expression = expression;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("fn" );

		for (Identifier arg : arguments) {
				builder.append(' ').append(arg);
		}
		builder.append(" -> ").append(expression);
		
		return builder.toString();
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> free = expression.getFreeVariables();
		free.removeAll(arguments);
		
		return free;
	}

	@Override
	public boolean isSimpleStrict() {
		return false;
	}

	@Override
	public void markEnclosingLambda(Lambda lambda) {
		setEnclosingLambda(lambda);
		expression.markEnclosingLambda(this);
	}

	@Override
	public void markEnclosingLet(LetBase let) {
		setEnclosingLet(let);
		expression.markEnclosingLet(let);
	}
	
}
