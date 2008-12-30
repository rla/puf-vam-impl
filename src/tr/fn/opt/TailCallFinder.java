package tr.fn.opt;

public class TailCallFinder {
	private final OptimizationContext context;

	public TailCallFinder(OptimizationContext context) {
		this.context = context;
	}
	
	public void execute() {
		context.debug("Marking tail calls");
		context.getProgram().markTailCall(false, 0);
		if (context.isDebug()) {
			context.getProgram().dumpTailCalls(context);
		}
	}

}
