package tr.fn.ast;

import java.util.List;
import java.util.Set;

import tr.fn.opt.AbsInterpretationContext;
import tr.fn.opt.NotAbsInterpretableException;
import tr.fn.opt.OptimizationContext;

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
	public void markScopeExpression(Expression scopeExpression) {
		this.scopeExpression = scopeExpression;
		expression.markScopeExpression(scopeExpression);
		inExpression.markScopeExpression(this);
	}

	@Override
	public void collectDeclarations(List<Declaration> declarations) {
		expression.collectDeclarations(declarations);
		inExpression.collectDeclarations(declarations);
	}

	@Override
	public boolean interpretation(AbsInterpretationContext context) throws NotAbsInterpretableException {
		throw new NotAbsInterpretableException();
	}

	@Override
	public boolean isInterpretable(List<Identifier> localScope) {
		return false;
	}

	@Override
	public String toString() {
		return "let " + tuple + " = " + expression + " ; in " + inExpression;
	}

	@Override
	public void findApplicationDeclarations(List<Declaration> declarations) throws NotAbsInterpretableException {
		throw new NotAbsInterpretableException();
	}

	@Override
	public void markTailCall(boolean tail) {}

	@Override
	public void dumpTailCalls(OptimizationContext context) {}
	
}
