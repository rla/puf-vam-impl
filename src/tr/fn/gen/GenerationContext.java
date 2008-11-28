package tr.fn.gen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import tr.fn.gen.instr.Halt;
import tr.fn.gen.instr.Instruction;
import tr.fn.gen.instr.Label;

/**
 * Helper class for code generation.
 */
public class GenerationContext {
	private List<Instruction> instructions;
	private List<Instruction> instructionsAfterHalt;
	private LabelContext labelContext;
	
	private boolean debug = false;
	private boolean noSpaghetti = true;
	
	public GenerationContext() {
		instructions = new ArrayList<Instruction>();
		instructionsAfterHalt = new ArrayList<Instruction>();
		labelContext = new LabelContext();
	}
	
	/**
	 * Add normal instruction.
	 */
	public void addInstruction(Instruction instruction) {
		instructions.add(instruction);
		if (debug) {
			System.out.println("INSTR: " + instruction);
		}
	}
	
	/**
	 * Add instruction after halt statement.
	 */
	public void addInstructionAfterHalt(Instruction instruction) {
		instructionsAfterHalt.add(instruction);
		if (debug) {
			System.out.println("INSTR: " + instruction);
		}
	}
	
	/**
	 * Generates unique label for jump.
	 */
	public Label makeLabel() {
		return labelContext.makeLabel();
	}
	
	/**
	 * Dumps instructions into the given file.
	 */
	public void saveToFile(File file) throws IOException, GenerateException {
		if (!(instructions.get(instructions.size() - 1) instanceof Halt)) {
			throw new GenerateException("Last normal instruction must be halt");
		}
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, false));
		String newline = System.getProperty("line.separator");
		try {
			for (Instruction instruction : instructions) {
				writer.append(instruction.toString());
				writer.append(newline);
			}
			for (Instruction instruction : instructionsAfterHalt) {
				writer.append(instruction.toString());
				writer.append(newline);
			}
		} catch (IOException e) {
			System.err.println("Writing the instructions to file unsucceeded");
		} finally {
			writer.close();
		}
	}

	public boolean isDebug() {
		return debug;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public boolean isNoSpaghetti() {
		return noSpaghetti;
	}

	public void setNoSpaghetti(boolean noSpaghetti) {
		this.noSpaghetti = noSpaghetti;
	}
	
}
