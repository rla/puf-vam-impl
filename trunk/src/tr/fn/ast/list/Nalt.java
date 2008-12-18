package tr.fn.ast.list;

import java.util.Set;

import tr.fn.ast.Expression;
import tr.fn.ast.Identifier;
import tr.fn.ast.Lambda;
import tr.fn.ast.LetBase;

public class Nalt extends Expression {
	public final Expression expression;

	public Nalt(Expression expression) {
		this.expression = expression;
	}

	@Override
	public String toString() {
		return "[] -> " + expression;
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		return expression.getFreeVariables();
	}

	@Override
	public boolean isSimpleStrict() {
		return false;
	}

	@Override
	public void markEnclosingLet(LetBase let) {
		setEnclosingLet(let);
		expression.markEnclosingLet(let);
	}

	@Override
	public void markEnclosingLambda(Lambda lambda) {
		setEnclosingLambda(lambda);
		expression.markEnclosingLambda(lambda);
	}
		
}
