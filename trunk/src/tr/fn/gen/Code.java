package tr.fn.gen;

import tr.fn.ast.Identifier;
import tr.fn.ast.LetRec;
import tr.fn.gen.instr.Pushglob;
import tr.fn.gen.instr.Pushloc;

public class Code {
	
	public static void code(LetRec program, GenerationContext context) throws GenerateException {
		program.markScopeExpression(null);
		CodeV.codeV(new Environment(), context, program, 0);
	}
	
	/**
	 * Generates code for variable access.
	 * 
	 * @see MaMa slides page 29.
	 */
	public static void getvar(Identifier identifier, Environment environment, GenerationContext context, int sd) throws GenerateException {
		Variable variable = environment.getVariable(identifier);
		if (variable == null) {
			throw new GenerateException("Unknown variable " + identifier + "\nEnvironment: \n" + environment.toString());
		}
		if (variable.isLocal()) {
			context.addInstruction(new Pushloc(sd - variable.getId()));
		} else {
			context.addInstruction(new Pushglob(variable.getId()));
		}
	}

}
