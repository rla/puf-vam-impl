package tr.fn.ast;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import tr.fn.opt.AbsInterpretationContext;
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
	public boolean interpretation(AbsInterpretationContext context) throws NotAbsInterpretableException {
		if (expression instanceof Lambda) {
			Lambda lambda = (Lambda) expression;
			return lambda.expression.interpretation(context);
		} else {
			return expression.interpretation(context);
		}
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
		if (expression instanceof Lambda) {
			Lambda lambda = (Lambda) expression;
			lambda.expression.findApplicationDeclarations(declarations);
		} else {
			expression.findApplicationDeclarations(declarations);
		}
	}
	
	public boolean isFunctionWithNArgs(int n) {
		return getNumberOfArguments() == n;
	}
	
	public int getNumberOfArguments() {
		if (expression instanceof Lambda) {
			Lambda lambda = (Lambda) expression;
			return lambda.arguments.size();
		} else {
			return 0;
		}
	}
	
	public List<Identifier> getArguments() {
		if (expression instanceof Lambda) {
			Lambda lambda = (Lambda) expression;
			return lambda.arguments;
		} else {
			return Collections.emptyList();
		}
	}

}
