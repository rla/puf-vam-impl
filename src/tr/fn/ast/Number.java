package tr.fn.ast;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import tr.fn.opt.AbsInterpretationContext;
import tr.fn.opt.NotAbsInterpretableException;
import tr.fn.opt.OptimizationContext;

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
	public boolean interpretation(AbsInterpretationContext context) {
		return true;
	}

	@Override
	public boolean isInterpretable(List<Identifier> localScope) {
		return true;
	}

	@Override
	public void findApplicationDeclarations(List<Declaration> declarations) throws NotAbsInterpretableException {}

	@Override
	public void markTailCall(boolean tail, int upperArgNum) {}

	@Override
	public void dumpTailCalls(OptimizationContext context) {}
	
}
