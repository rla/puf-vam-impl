package tr.fn.opt;

import tr.fn.PuFException;

public class OptimizationException extends PuFException {
	private static final long serialVersionUID = 1L;

	public OptimizationException(String message) {
		super(message);
	}

	public OptimizationException(Throwable cause) {
		super(cause);
	}

}
