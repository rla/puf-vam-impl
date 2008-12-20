package tr.fn.opt;

import java.util.Collections;
import java.util.Map;

import tr.fn.ast.Declaration;


public class StrictnessAnalysis {
	private OptimizationContext context;

	public StrictnessAnalysis(OptimizationContext context) {
		this.context = context;
	}
	
	public void execute() throws OptimizationException {
		context.debug("Strictness analysis:");
		
		AbsInterpreter interpreter = new AbsInterpreter(context.getProgram(), context.isDebug());
		try {
			context.setStrictnessInfo(interpreter.run());
		} catch (AbsInterpretationFailedException e) {
			context.debug("Strictness analysis failed");
			Map<Declaration, BooleanTable> info = Collections.emptyMap();
			context.setStrictnessInfo(info);
		}
	}
}
