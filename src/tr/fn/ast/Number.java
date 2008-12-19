package tr.fn.ast;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import tr.fn.opt.InterpretationContext;
import tr.fn.opt.NotAbsInterpretableException;

public class Number extends Expression implements Simple {
	public final Integer value;

	public Number(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value.toString();
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		return new HashSet<Identifier>();
	}

	@Override
	public boolean isSimpleStrict() {
		return true;
	}

	@Override
	public void markScopeExpression(Expression scopeExpression) {
		this.scopeExpression = scopeExpression;
	}

	@Override
	public void collectDeclarations(List<Declaration> declarations) {}

	@Override
	public boolean interpretation(Map<Identifier, Boolean> localScope, InterpretationContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInterpretable(List<Identifier> localScope) {
		return true;
	}

	@Override
	public void findApplicationDeclarations(List<Declaration> declarations) throws NotAbsInterpretableException {}
	
}
