package tr.fn.opt;

import java.util.Map;

import tr.fn.ast.Declaration;
import tr.fn.ast.LetRec;

/**
 * Helper class to hold the ast (and additional information) at the stage of optimizations.
 */
public class OptimizationContext {
	private LetRec program;
	private final boolean debug;
	private Map<Declaration, BooleanTable> strictnessInfo;

	public OptimizationContext(LetRec program, boolean debug) {
		this.program = program;
		this.debug = debug;
	}

	public LetRec getProgram() {
		return program;
	}

	public void setProgram(LetRec program) {
		this.program = program;
	}

	public boolean isDebug() {
		return debug;
	}

	public Map<Declaration, BooleanTable> getStrictnessInfo() {
		return strictnessInfo;
	}

	public void setStrictnessInfo(Map<Declaration, BooleanTable> strictnessInfo) {
		this.strictnessInfo = strictnessInfo;
	}
	
	public void debug(String string) {
		if (debug) {
			System.out.println(string);
		}
	}
	
}
