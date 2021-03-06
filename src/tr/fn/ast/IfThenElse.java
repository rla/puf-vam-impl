package tr.fn.ast;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import tr.fn.opt.AbsInterpretationContext;
import tr.fn.opt.NotAbsInterpretableException;
import tr.fn.opt.OptimizationContext;

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
	public void markScopeExpression(Expression scopeExpression) {
		this.scopeExpression = scopeExpression;
		condition.markScopeExpression(scopeExpression);
		thenExpression.markScopeExpression(scopeExpression);
		elseExpression.markScopeExpression(scopeExpression);
	}

	@Override
	public void collectDeclarations(List<Declaration> declarations) {
		condition.collectDeclarations(declarations);
		thenExpression.collectDeclarations(declarations);
		elseExpression.collectDeclarations(declarations);
	}

	@Override
	public boolean absInterpretation(AbsInterpretationContext context) throws NotAbsInterpretableException {
		return condition.absInterpretation(context) && (thenExpression.absInterpretation(context) || elseExpression.absInterpretation(context));
	}

	@Override
	public boolean isAbsInterpretable(List<Identifier> localScope) {
		return condition.isAbsInterpretable(localScope)
			&& thenExpression.isAbsInterpretable(localScope)
			&& elseExpression.isAbsInterpretable(localScope);
	}

	@Override
	public void findApplicationDeclarations(List<Declaration> declarations) throws NotAbsInterpretableException {
		condition.findApplicationDeclarations(declarations);
		thenExpression.findApplicationDeclarations(declarations);
		elseExpression.findApplicationDeclarations(declarations);
	}

	@Override
	public void markTailCall(boolean tail, int upperArgNum) {
		condition.markTailCall(false, upperArgNum);
		thenExpression.markTailCall(tail, upperArgNum);
		elseExpression.markTailCall(tail, upperArgNum);
	}

	@Override
	public void dumpTailCalls(OptimizationContext context) {
		condition.dumpTailCalls(context);
		thenExpression.dumpTailCalls(context);
		elseExpression.dumpTailCalls(context);
	}

}
