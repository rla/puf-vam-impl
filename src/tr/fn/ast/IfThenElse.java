package tr.fn.ast;

import java.util.HashSet;
import java.util.Set;

public class IfThenElse extends Expression {
	public final Expression condition;
	public final Expression thenExpression;
	public final Expression elseExpression;
	
	public IfThenElse(Expression condition, Expression thenExpression, Expression elseExpression) {
		this.condition = condition;
		this.thenExpression = thenExpression;
		this.elseExpression = elseExpression;
	}

	@Override
	public String toString() {
		return "if " + condition + " then " + thenExpression + " else " + elseExpression;
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
	public boolean isSimpleStrict() {
		return false;
	}

	@Override
	public void markEnclosingLambda(Lambda lambda) {
		setEnclosingLambda(lambda);
		condition.markEnclosingLambda(lambda);
		thenExpression.markEnclosingLambda(lambda);
		elseExpression.markEnclosingLambda(lambda);
	}

	@Override
	public void markEnclosingLet(LetBase let) {
		setEnclosingLet(let);
		condition.markEnclosingLet(let);
		thenExpression.markEnclosingLet(let);
		elseExpression.markEnclosingLet(let);
	}

}
