package tr.fn.ast;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import tr.fn.opt.AbsInterpretationContext;
import tr.fn.opt.AmbiguousException;
import tr.fn.opt.NotAbsInterpretableException;
import tr.fn.opt.OptimizationContext;

public abstract class LetBase extends Expression {
	public final List<Declaration> declarations;
	public final Expression inExpression;
	
	public LetBase(List<Declaration> declarations, Expression inExpression) {
		this.declarations = declarations;
		this.inExpression = inExpression;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(getTypeName());
		for (Declaration declaration : declarations) {
			builder.append(' ').append(declaration).append(';');
		}
		
		builder.append(" in ").append(inExpression);
		
		return builder.toString();
	}
	
	protected abstract String getTypeName();
	
	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> nonFree = new HashSet<Identifier>();
		Set<Identifier> free = new HashSet<Identifier>(inExpression.getFreeVariables());
		
		for (Declaration declaration : declarations) {
			if (declaration instanceof Declaration) {
				nonFree.add(((Declaration) declaration).name);
			}
			
			free.addAll(declaration.expression.getFreeVariables());
		}
		
		free.removeAll(nonFree);
		
		return free;
	}

	@Override
	public boolean isSimpleStrict() {
		return false;
	}

	@Override
	public void markScopeExpression(Expression scopeExpression) {
		this.scopeExpression = scopeExpression;
		inExpression.markScopeExpression(this);
		for (Declaration declaration : declarations) {
			declaration.markScopeExpression(this);
		}
	}

	public Declaration getDeclaration(Identifier name) throws AmbiguousException {
		boolean found = false;
		Declaration ret = null;
		for (Declaration declaration : declarations) {
			if (declaration.name.equals(name)) {
				if (found) {
					throw new AmbiguousException();
				}
				found = true;
				ret = declaration;
			}
		}
		
		return ret;
	}

	@Override
	public void collectDeclarations(List<Declaration> declarations) {
		for (Declaration declaration : this.declarations) {
			declarations.add(declaration);
			declaration.collectDeclarations(declarations);
		}
	}

	@Override
	public void findApplicationDeclarations(List<Declaration> declarations) throws NotAbsInterpretableException {
		inExpression.findApplicationDeclarations(declarations);
	}

	@Override
	public boolean interpretation(AbsInterpretationContext context) throws NotAbsInterpretableException {
		return inExpression.interpretation(context);
	}

	@Override
	public boolean isInterpretable(List<Identifier> localScope) {
		return inExpression.isInterpretable(localScope);
	}

	@Override
	public void markTailCall(boolean tail) {
		inExpression.markTailCall(tail);
		for (Declaration decl : declarations) {
			decl.markTailCall(true);
		}
	}
	
	@Override
	public void dumpTailCalls(OptimizationContext context) {
		inExpression.dumpTailCalls(context);
		for (Declaration decl : declarations) {
			decl.dumpTailCalls(context);
		}
	}
	
}
