package tr.fn.ast.list;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import tr.fn.ast.Declaration;
import tr.fn.ast.Expression;
import tr.fn.ast.Identifier;
import tr.fn.opt.AbsInterpretationContext;
import tr.fn.opt.NotAbsInterpretableException;
import tr.fn.opt.OptimizationContext;

public class Case extends Expression {
	public final Expression expression;
	public final Nalt nalt;
	public final Calt calt;
	
	public Case(Expression expression, Nalt nalt, Calt calt) {
		this.expression = expression;
		this.nalt = nalt;
		this.calt = calt;
	}

	@Override
	public String toString() {
		return "case of " + nalt + " ; " + calt;
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> free = new HashSet<Identifier>();
	    free.addAll(expression.getFreeVariables());
	    free.addAll(nalt.getFreeVariables());
	    free.addAll(calt.getFreeVariables());
		
		return free;
	}

	@Override
	public boolean isSimpleStrict() {
		return false;
	}

	@Override
	public void markScopeExpression(Expression scopeExpression) {
		this.scopeExpression = scopeExpression;
		expression.markScopeExpression(scopeExpression);
		nalt.markScopeExpression(scopeExpression);
		calt.markScopeExpression(scopeExpression);
	}

	@Override
	public void collectDeclarations(List<Declaration> declarations) {
		expression.collectDeclarations(declarations);
		nalt.collectDeclarations(declarations);
		calt.collectDeclarations(declarations);
	}

	@Override
	public boolean interpretation(AbsInterpretationContext context) throws NotAbsInterpretableException {
		throw new NotAbsInterpretableException();
	}

	@Override
	public boolean isInterpretable(List<Identifier> localScope) {
		return false;
	}

	@Override
	public void findApplicationDeclarations(List<Declaration> declarations) throws NotAbsInterpretableException {
		throw new NotAbsInterpretableException();
	}

	@Override
	public void markTailCall(boolean tail) {}

	@Override
	public void dumpTailCalls(OptimizationContext context) {}
	
}
