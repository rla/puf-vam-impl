package tr.fn.ast;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import tr.fn.opt.AmbiguousException;
import tr.fn.opt.InterpretationContext;
import tr.fn.opt.NotAbsInterpretableException;

public class Identifier extends Expression implements Simple {
	public static final String SELECT = "#";
	public static final String NOT = "not";
	public static final String NEG = "neg";	
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
		if (SELECT.equals(name) || NOT.equals(name) || NEG.equals(name)) {
			return free;
		}
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
	
	public Declaration findDeclaration() {
		Expression scopeExpression = this.scopeExpression;
		while (scopeExpression != null) {
			if (scopeExpression instanceof LetBase) {
				LetBase let = (LetBase) scopeExpression;
				try {
					Declaration declaration = let.getDeclaration(this);
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
	
}
