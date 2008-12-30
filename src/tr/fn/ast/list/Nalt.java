package tr.fn.ast.list;

import java.util.List;
import java.util.Set;

import tr.fn.ast.Declaration;
import tr.fn.ast.Expression;
import tr.fn.ast.Identifier;
import tr.fn.opt.AbsInterpretationContext;
import tr.fn.opt.NotAbsInterpretableException;
import tr.fn.opt.OptimizationContext;

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
	public void markScopeExpression(Expression scopeExpression) {
		this.scopeExpression = scopeExpression;
		expression.markScopeExpression(scopeExpression);
	}

	@Override
	public void collectDeclarations(List<Declaration> declarations) {
		expression.collectDeclarations(declarations);
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
	public void findApplicationDeclarations(List<Declaration> declarations) throws NotAbsInterpretableException {
		throw new NotAbsInterpretableException();
	}

	@Override
	public void markTailCall(boolean tail, int upperArgNum) {}

	@Override
	public void dumpTailCalls(OptimizationContext context) {}
		
}
