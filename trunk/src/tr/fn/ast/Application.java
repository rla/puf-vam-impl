package tr.fn.ast;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Application extends Expression {
	public final Expression functionExpression;
	public final List<Expression> argumentExpressions;
	
	public Application(Expression functionExpression, List<Expression> argumentExpressions) {
		this.functionExpression = functionExpression;
		this.argumentExpressions = argumentExpressions;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append('(').append(functionExpression);
		
		for (Expression arg : argumentExpressions) {
			builder.append(' ').append(arg);
		}
		builder.append(')');
		
		return builder.toString();
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> free = new HashSet<Identifier>();
		free.addAll(functionExpression.getFreeVariables());
		
		for (Expression expression : argumentExpressions) {
			free.addAll(expression.getFreeVariables());
		}
		
		return free;
	}

	@Override
	public boolean isSimpleStrict() {
		if (functionExpression.isSimpleStrict() || functionExpression instanceof Identifier) {
			for (Expression arg : argumentExpressions) {
				if (!arg.isSimpleStrict()) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	@Override
	public void markEnclosingLambda(Lambda lambda) {
		setEnclosingLambda(lambda);
		functionExpression.markEnclosingLambda(lambda);
		for (Expression e : argumentExpressions) {
			e.markEnclosingLambda(lambda);
		}
	}

	@Override
	public void markEnclosingLet(LetBase let) {
		setEnclosingLet(let);
		functionExpression.markEnclosingLet(let);
		for (Expression e : argumentExpressions) {
			e.markEnclosingLet(let);
		}
	}
	
}
