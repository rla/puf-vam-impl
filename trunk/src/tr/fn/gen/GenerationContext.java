package tr.fn.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import tr.fn.ast.Declaration;
import tr.fn.gen.instr.Instruction;
import tr.fn.gen.instr.Label;
import tr.fn.opt.BooleanTable;

/**
 * Helper class for code generation.
 */
public class GenerationContext {
	private List<Instruction> instructions;
	private LabelContext labelContext;
	private Map<Declaration, BooleanTable> strictness;
	
	private boolean debug = false;
	private boolean debugInstr = false;
	private boolean tryToEliminateClosures = true;
	private boolean tailcalls = true;
	
	public GenerationContext() {
		instructions = new ArrayList<Instruction>();
		labelContext = new LabelContext();
	}
	
	/**
	 * Add normal instruction.
	 */
	public void addInstruction(Instruction instruction) {
		instructions.add(instruction);
		if (debug && debugInstr) {
			System.out.println("INSTR: " + instruction);
		}
	}
	
	/**
	 * Generates unique label for jump.
	 */
	public Label makeLabel() {
		return labelContext.makeLabel();
	}
	


	public boolean isDebug() {
		return debug;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public boolean isStrict(Declaration e, int argument) {
		if (!strictness.containsKey(e)) {
			return false;
		}
		
		BooleanTable table = strictness.get(e);
		
		return argument < table.getNumberOfColumns() && !table.isTrueWithNthArgumentFalse(argument);
	}

	public boolean isTryToEliminateClosures() {
		return tryToEliminateClosures;
	}

	public void setTryToEliminateClosures(boolean tryToEliminateClosures) {
		this.tryToEliminateClosures = tryToEliminateClosures;
	}
	
	public void debug(String string) {
		if (debug) {
			System.out.println(string);
		}
	}
	
	public boolean hasStrictnessInformation(Declaration declaration) {
		return strictness.containsKey(declaration);
	}

	public void setStrictness(Map<Declaration, BooleanTable> strictness) {
		this.strictness = strictness;
	}

	public void setDebugInstr(boolean debugInstr) {
		this.debugInstr = debugInstr;
	}

	public List<Instruction> getInstructions() {
		return instructions;
	}

	public boolean isTailcalls() {
		return tailcalls;
	}

	public void setTailcalls(boolean tailcalls) {
		this.tailcalls = tailcalls;
	}
	
}
