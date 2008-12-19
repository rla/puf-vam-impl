package tr.fn.ast;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import tr.fn.opt.AmbiguousException;
import tr.fn.opt.InterpretationContext;
import tr.fn.opt.NotAbsInterpretableException;


public class Application extends Expression {
	public final Expression functionExpression;
	public final List<Expression> argumentExpressions;
	
	public Application(Expression functionExpression, List<Expression> argumentExpressions) {
		this.functionExpression = functionExpression;
		this.argumentExpressions = argumentExpressions;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append('(').append(functionExpression);
		
		for (Expression arg : argumentExpressions) {
			builder.append(' ').append(arg);
		}
		builder.append(')');
		
		return builder.toString();
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> free = new HashSet<Identifier>();
		free.addAll(functionExpression.getFreeVariables());
		
		for (Expression expression : argumentExpressions) {
			free.addAll(expression.getFreeVariables());
		}
		
		return free;
	}

	@Override
	public boolean isSimpleStrict() {
		if (functionExpression.isSimpleStrict() || functionExpression instanceof Identifier) {
			for (Expression arg : argumentExpressions) {
				if (!arg.isSimpleStrict()) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	@Override
	public void markScopeExpression(Expression scopeExpression) {
		this.scopeExpression = scopeExpression;
		functionExpression.markScopeExpression(scopeExpression);
		
		for (Expression arg : argumentExpressions) {
			arg.markScopeExpression(scopeExpression);
		}
	}
	
	public Declaration findDeclaration() {
		if (!(functionExpression instanceof Identifier)) {
			return null;
		}
		Identifier name = (Identifier) functionExpression;
		Expression scopeExpression = this.scopeExpression;
		while (scopeExpression != null) {
			if (scopeExpression instanceof LetBase) {
				LetBase let = (LetBase) scopeExpression;
				try {
					Declaration declaration = let.getDeclaration(name);
					if (declaration != null) {
						return declaration;
					}
				} catch (AmbiguousException e) {
					return null;
				}
			} else if (scopeExpression instanceof Lambda) {
				Lambda lambda = (Lambda) scopeExpression;
				if (lambda.arguments.contains(name)) {
					return null;
				}
			}
			scopeExpression = scopeExpression.scopeExpression;
		}
		
		return null;
	}

	@Override
	public void collectDeclarations(List<Declaration> declarations) {
		functionExpression.collectDeclarations(declarations);
		for (Expression arg : argumentExpressions) {
			arg.collectDeclarations(declarations);
		}
	}

	@Override
	public boolean interpretation(Map<Identifier, Boolean> localScope, InterpretationContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInterpretable(List<Identifier> localScope) {
		if (functionExpression instanceof Identifier) {
			if (localScope.contains(functionExpression)) {
				// Function passed as a declaration argument.
				return false;
			}
			// Function might be declared somewhere
			return true;
		}
		return false;
	}

	@Override
	public void findApplicationDeclarations(List<Declaration> declarations) throws NotAbsInterpretableException {
		Declaration declaration = findDeclaration();
		if (declaration == null) {
			throw new NotAbsInterpretableException();
		}
		
		declarations.add(declaration);
	}
	
}
