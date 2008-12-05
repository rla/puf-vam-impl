package tr.fn.ast;

import java.util.HashSet;
import java.util.Set;

public class List extends Expression {
	private Expression head;
	private List tail;
	
	/**
	 * Creates empty list.
	 */
	public List(int line) {
		super(line);
		this.head = null;
		this.tail = null;
	}
	
	/**
	 * Creates new list with the given head and tail.
	 */
	public List(int line, Expression head, List tail) {
		super(line);
		this.head = head;
		this.tail = tail;
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> free = new HashSet<Identifier>();
		
		List list = this;
		while (!list.isEmpty()) {
			free.addAll(list.getHead().getFreeVariables());
			list = list.getTail();
		}
		
		return free;
	}

	@Override
	public Set<Identifier> getIdentifiers() {
		Set<Identifier> identifiers = new HashSet<Identifier>();
		
		List list = this;
		while (!list.isEmpty()) {
			identifiers.addAll(list.getHead().getIdentifiers());
			list = list.getTail();
		}
		
		return identifiers;
	}
	
	public boolean isEmpty() {
		return tail == null;
	}

	public Expression getHead() {
		return head;
	}

	public List getTail() {
		return tail;
	}

}
