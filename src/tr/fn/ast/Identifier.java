package tr.fn.ast;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import tr.fn.opt.InterpretationContext;
import tr.fn.opt.NotAbsInterpretableException;

public class Identifier extends Expression implements Simple {
	public final String name;

	public Identifier(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Identifier && ((Identifier) obj).name.equals(name);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> free = new HashSet<Identifier>();
		free.add(this);
		
		return free;
	}

	@Override
	public boolean isSimpleStrict() {
		return false;
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
		return localScope.contains(this);
	}

	@Override
	public void findApplicationDeclarations(List<Declaration> declarations) throws NotAbsInterpretableException {}
	
}
