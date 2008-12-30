package tr.fn.ast;

import java.util.List;
import java.util.Set;

import tr.fn.opt.AbsInterpretationContext;
import tr.fn.opt.NotAbsInterpretableException;
import tr.fn.opt.OptimizationContext;


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
	public void markScopeExpression(Expression scopeExpression) {
		this.scopeExpression = scopeExpression;
		expression.markScopeExpression(this);
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
	public void markTailCall(boolean tail) {
		expression.markTailCall(true);
	}

	@Override
	public void dumpTailCalls(OptimizationContext context) {
		expression.dumpTailCalls(context);
	}
	
}
