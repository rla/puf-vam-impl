package tr.fn.ast;

import java.util.List;
import java.util.Map;
import java.util.Set;

import tr.fn.opt.InterpretationContext;
import tr.fn.opt.NotAbsInterpretableException;


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
	public boolean interpretation(Map<Identifier, Boolean> localScope, InterpretationContext context) {
		return false;
	}

	@Override
	public boolean isInterpretable(List<Identifier> localScope) {
		return false;
	}

	@Override
	public void findApplicationDeclarations(List<Declaration> declarations) throws NotAbsInterpretableException {
		throw new NotAbsInterpretableException();
	}
	
}
