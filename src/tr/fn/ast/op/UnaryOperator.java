package tr.fn.ast.op;

import java.util.Set;

import tr.fn.ast.Expression;
import tr.fn.ast.Identifier;

public class UnaryOperator extends Expression {

	public UnaryOperator(int line) {
		super(line);
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		// FIXME unimplemented
		return null;
	}
	
}
