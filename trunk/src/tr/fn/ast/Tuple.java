package tr.fn.ast;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import tr.fn.opt.InterpretationContext;
import tr.fn.opt.NotAbsInterpretableException;

public class Tuple extends Expression {
	public final List<? extends Expression> arguments;

	public Tuple(List<? extends Expression> arguments) {
		this.arguments = arguments;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append('(');
		boolean first = true;
		for (Expression arg : arguments) {
			if (first) {
				first = false;
			} else {
				builder.append(',');
			}
			builder.append(arg);
		}
		builder.append(')');
		
		return builder.toString();
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> free = new HashSet<Identifier>();
		
		for (Expression argument : arguments) {
			free.addAll(argument.getFreeVariables());
		}
		
		return free;
	}

	@Override
	public boolean isSimpleStrict() {
		for (Expression argument : arguments) {
			if (!argument.isSimpleStrict()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void markScopeExpression(Expression scopeExpression) {
		for (Expression expression : arguments) {
			expression.markScopeExpression(scopeExpression);
		}
	}

	@Override
	public void collectDeclarations(List<Declaration> declarations) {
		for (Expression arg :arguments) {
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
		for (Expression arg : arguments) {
			if (!arg.isInterpretable(localScope)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void findApplicationDeclarations(List<Declaration> declarations) throws NotAbsInterpretableException {
		for (Expression arg : arguments) {
			arg.findApplicationDeclarations(declarations);
		}
	}
	
	
	
}
