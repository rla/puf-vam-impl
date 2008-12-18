package tr.fn.opt;

import java.util.Map;

import tr.fn.ast.Expression;

/**
 * Helper class to hold the ast (and additional information) at the stage of optimizations.
 */
public class OptimizationContext {
	private Expression program;
	private boolean debug;
	private Map<Expression, StrictnessInfo> strictness;

	public OptimizationContext(Expression program, boolean debug) {
		this.program = program;
		this.debug = debug;
	}

	public Expression getProgram() {
		return program;
	}

	public void setProgram(Expression program) {
		this.program = program;
	}

	public boolean isDebug() {
		return debug;
	}

	public Map<Expression, StrictnessInfo> getStrictness() {
		return strictness;
	}

	public void setStrictness(Map<Expression, StrictnessInfo> strictness) {
		this.strictness = strictness;
	}
	
}
