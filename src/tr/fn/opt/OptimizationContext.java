package tr.fn.opt;

import tr.fn.ast.Expression;

/**
 * Helper class to hold the ast (and additional information) at the stage of optimizations.
 */
public class OptimizationContext {
	private Expression program;

	public OptimizationContext(Expression program) {
		this.program = program;
	}

	public Expression getProgram() {
		return program;
	}

	public void setProgram(Expression program) {
		this.program = program;
	}
	
}
