package tr.fn.ast;

import java.util.HashSet;
import java.util.Set;

public class IfThenElse extends Expression {
	private final Expression condition;
	private final Expression thenExpression;
	private final Expression elseExpression;

	public IfThenElse(int line, Expression condition, Expression elseExpression, Expression thenExpression) {
		super(line);
		this.condition = condition;
		this.elseExpression = elseExpression;
		this.thenExpression = thenExpression;
	}

	public Expression getCondition() {
		return condition;
	}

	public Expression getThenExpression() {
		return thenExpression;
	}

	public Expression getElseExpression() {
		return elseExpression;
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> free = new HashSet<Identifier>();
		free.addAll(condition.getFreeVariables());
		free.addAll(elseExpression.getFreeVariables());
		free.addAll(thenExpression.getFreeVariables());
		
		return free;
	}

	@Override
	public String toString() {
		return "(if " + condition + " then " + thenExpression + " else " + elseExpression + ")";
	}

}
