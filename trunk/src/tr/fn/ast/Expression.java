package tr.fn.ast;

import java.util.Set;


public abstract class Expression {
	
	private final int line;

	public Expression(int line) {
		this.line = line;
	}

	public int getLine() {
		return line;
	}

	/**
	 * Get the free variables of this expression.
	 */
	public abstract Set<Identifier> getFreeVariables();
}
