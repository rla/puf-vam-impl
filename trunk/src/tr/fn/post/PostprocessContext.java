package tr.fn.post;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import tr.fn.gen.GenerateException;
import tr.fn.gen.instr.Instruction;

public class PostprocessContext {
	private List<Instruction> instructions;

	public PostprocessContext(List<Instruction> instructions) {
		this.instructions = instructions;
	}

	public List<Instruction> getInstructions() {
		return instructions;
	}

	public void setInstructions(List<Instruction> instructions) {
		this.instructions = instructions;
	}
	
	/**
	 * Dumps instructions into the given file.
	 */
	public void saveToFile(File file) throws IOException, GenerateException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, false));
		String newline = System.getProperty("line.separator");
		try {
			for (Instruction instruction : instructions) {
				writer.append(instruction.toString());
				writer.append(newline);
			}
		} catch (IOException e) {
			System.err.println("Writing the instructions to file unsucceeded");
		} finally {
			writer.close();
		}
	}
	
}
