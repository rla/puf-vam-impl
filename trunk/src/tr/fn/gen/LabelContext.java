package tr.fn.gen;

import java.util.concurrent.atomic.AtomicInteger;

import tr.fn.gen.instr.Label;

/**
 * Helper class to generate jump labels.
 */
public class LabelContext {
	private final AtomicInteger id;
	
	public LabelContext() {
		id = new AtomicInteger(0);
	}
	
	public Label makeLabel() {
		return new Label("L" + id.incrementAndGet());
	}
}
