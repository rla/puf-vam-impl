package tr.fn.ast.list;

import java.util.HashSet;
import java.util.Set;

import tr.fn.ast.Expression;
import tr.fn.ast.Identifier;
import tr.fn.ast.Lambda;
import tr.fn.ast.LetBase;

public class HeadTailList extends Expression {
	public final Expression head;
	public final Expression tail;
	
	public HeadTailList(Expression head, Expression tail) {
		this.head = head;
		this.tail = tail;
	}
	
	public HeadTailList() {
		this(null, null);
	}
	
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public String toString() {
		if (isEmpty()) {
			return "[]";
		}
		return head.toString() + " : " + tail.toString();
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> free = new HashSet<Identifier>(tail.getFreeVariables());
		free.addAll(head.getFreeVariables());
		
		return free;
	}

	@Override
	public boolean isSimpleStrict() {
		return false;
	}

	@Override
	public void markEnclosingLambda(Lambda lambda) {
		setEnclosingLambda(lambda);
		head.markEnclosingLambda(lambda);
		tail.markEnclosingLambda(lambda);
	}

	@Override
	public void markEnclosingLet(LetBase let) {
		setEnclosingLet(let);
		head.markEnclosingLet(let);
		tail.markEnclosingLet(let);
	}
	
}
