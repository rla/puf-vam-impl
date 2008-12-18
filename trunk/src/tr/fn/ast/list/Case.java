package tr.fn.ast.list;

import java.util.HashSet;
import java.util.Set;

import tr.fn.ast.Expression;
import tr.fn.ast.Identifier;
import tr.fn.ast.Lambda;
import tr.fn.ast.LetBase;

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
	public void markEnclosingLambda(Lambda lambda) {
		setEnclosingLambda(lambda);
		nalt.markEnclosingLambda(lambda);
		calt.markEnclosingLambda(lambda);
	}

	@Override
	public void markEnclosingLet(LetBase let) {
		setEnclosingLet(let);
		nalt.markEnclosingLet(let);
		calt.markEnclosingLet(let);
	}
	
}
