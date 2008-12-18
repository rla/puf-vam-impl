package tr.fn.ast.list;

import java.util.HashSet;
import java.util.Set;

import tr.fn.ast.Expression;
import tr.fn.ast.Identifier;
import tr.fn.ast.Lambda;
import tr.fn.ast.LetBase;

public class Calt extends Expression {
	public final Identifier head;
	public final Identifier tail;
	public final Expression expression;
	
	public Calt(Identifier head, Identifier tail, Expression expression) {
		this.head = head;
		this.tail = tail;
		this.expression = expression;
	}

	@Override
	public String toString() {
		return head + " : " + tail + " -> " + expression;
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> free = new HashSet<Identifier>(expression.getFreeVariables());
		free.remove(head);
		free.remove(tail);
		
		return free;
	}

	@Override
	public boolean isSimpleStrict() {
		return false;
	}

	@Override
	public void markEnclosingLambda(Lambda lambda) {
		setEnclosingLambda(lambda);
		expression.markEnclosingLambda(lambda);
	}

	@Override
	public void markEnclosingLet(LetBase let) {
		setEnclosingLet(let);
		expression.markEnclosingLet(let);
	}
	
}
