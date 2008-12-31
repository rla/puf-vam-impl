package tr.fn.ast;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import tr.fn.opt.AbsInterpretationContext;
import tr.fn.opt.NotAbsInterpretableException;
import tr.fn.opt.OptimizationContext;

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
	public boolean absInterpretation(AbsInterpretationContext context) throws NotAbsInterpretableException {
		if (expression instanceof Lambda) {
			Lambda lambda = (Lambda) expression;
			return lambda.expression.absInterpretation(context);
		} else {
			return expression.absInterpretation(context);
		}
	}

	@Override
	public boolean isAbsInterpretable(List<Identifier> localScope) {
		return false;
	}
	
	public boolean definesInterpretable() {
		if (expression instanceof Lambda) {
			Lambda lambda = (Lambda) expression;
			return lambda.expression.isAbsInterpretable(lambda.arguments);
		} else {
			List<Identifier> args = Collections.emptyList();
			return expression.isAbsInterpretable(args);
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
			return ((Lambda) expression).arguments;
		} else {
			return Collections.emptyList();
		}
	}

	@Override
	public void markTailCall(boolean tail, int upperArgNum) {
		expression.markTailCall(tail, getNumberOfArguments());
	}

	@Override
	public void dumpTailCalls(OptimizationContext context) {
		expression.dumpTailCalls(context);
	}

}
