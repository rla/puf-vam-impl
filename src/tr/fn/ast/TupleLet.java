package tr.fn.ast;

import java.util.Set;

public class TupleLet extends Expression {
	public final Tuple tuple;
	public final Expression expression;
	public final Expression inExpression;

	public TupleLet(Tuple tuple, Expression expression, Expression inExpression) {
		this.tuple = tuple;
		this.expression = expression;
		this.inExpression = inExpression;
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> free = inExpression.getFreeVariables();
		free.addAll(expression.getFreeVariables());
		
		for (Expression e : tuple.arguments) {
			free.remove(e);
		}
		
		return free;
	}

	@Override
	public boolean isSimpleStrict() {
		return false;
	}

	@Override
	public void markEnclosingLambda(Lambda lambda) {
		
	}

	@Override
	public void markEnclosingLet(LetBase let) {
		// TODO Auto-generated method stub
	}

	@Override
	public String toString() {
		return "let " + tuple + " = " + expression + " ; in " + inExpression;
	}
	
	

}
