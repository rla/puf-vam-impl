package tr.fn.gen;

import tr.fn.ast.Identifier;
import tr.fn.gen.instr.Pushglob;
import tr.fn.gen.instr.Pushloc;

public class Code {
	
	/**
	 * Generates code for variable access.
	 * 
	 * @see MaMa slides page 29.
	 */
	public static void getvar(Identifier identifier, Environment environment, GenerationContext context, int sd) throws GenerateException {
		Variable variable = environment.getVariable(identifier);
		if (variable == null) {
			throw new GenerateException("Unknown variable " + identifier + " at line " + identifier.getLine() + "\nEnvironment: \n" + environment.toString());
		}
		if (variable.isLocal()) {
			context.addInstruction(new Pushloc(sd - variable.getId()));
		} else {
			context.addInstruction(new Pushglob(variable.getId()));
		}
	}

}
