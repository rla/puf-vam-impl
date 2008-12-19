package tr.fn.ast;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import tr.fn.opt.InterpretationContext;
import tr.fn.opt.NotAbsInterpretableException;

public class Declaration extends Expression {
	public static final String MAIN_NAME = "main";
	
	public final Expression expression;
	public final Identifier name;
	
	public Declaration(Identifier name, Expression expression) {
		this.expression = expression;
		this.name = name;
	}

	@Override
	public String toString() {
		return name + " = " + expression;
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
		name.markScopeExpression(scopeExpression);
		expression.markScopeExpression(scopeExpression);
	}

	@Override
	public void collectDeclarations(List<Declaration> declarations) {
		expression.collectDeclarations(declarations);
	}

	@Override
	public boolean interpretation(Map<Identifier, Boolean> localScope, InterpretationContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInterpretable(List<Identifier> localScope) {
		return false;
	}
	
	public boolean definesInterpretable() {
		if (expression instanceof Lambda) {
			Lambda lambda = (Lambda) expression;
			return lambda.expression.isInterpretable(lambda.arguments);
		} else {
			List<Identifier> args = Collections.emptyList();
			return expression.isInterpretable(args);
		}
	}

	@Override
	public void findApplicationDeclarations(List<Declaration> declarations) throws NotAbsInterpretableException {
		throw new NotAbsInterpretableException();
	}

}
