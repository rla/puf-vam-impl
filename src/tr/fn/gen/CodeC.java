package tr.fn.gen;

import java.util.Collection;

import tr.fn.ast.Expression;
import tr.fn.ast.Identifier;
import tr.fn.ast.Lambda;
import tr.fn.gen.instr.CopyGlob;
import tr.fn.gen.instr.Jump;
import tr.fn.gen.instr.Label;
import tr.fn.gen.instr.MkClos;
import tr.fn.gen.instr.MkVec;
import tr.fn.gen.instr.Update;

public class CodeC {
	
	/**
	 * Generates closure of expression e.
	 * 
	 * @see MaMa slides page 62.
	 */
	public static void codeC(Environment environment, GenerationContext context, Expression e, int sd) throws GenerateException {
		context.debug("codeC " + environment + " " + e);
		if (context.isTryToEliminateClosures() && (e.isSimpleStrict() || e instanceof Lambda)) {
			context.debug("CodeC will not create a closure");
			CodeV.codeV(environment, context, e, sd);
		} else {
			Label A = context.makeLabel();
			Label B = context.makeLabel();
			
			Collection<Identifier> free = e.getFreeVariables();
			Environment environment1 = new Environment(environment);
			
			int i = 0;
			for (Identifier identifier : free) {
				Code.getvar(identifier, environment, context, sd + i);
				environment1.addVariable(new Variable(identifier, i, VariableType.GLOBAL));
				i++;
			}
			
			int g = free.size();
			
			context.addInstruction(new MkVec(g));
			context.addInstruction(new MkClos(A));
			context.addInstruction(new Jump(B));
			context.addInstruction(A);
			CodeV.codeV(environment1, context, e, 0);
			context.addInstruction(new Update());
			context.addInstruction(B);
		}
	}
	
	/**
	 * Generates closure of expression e with reuse of global vector.
	 */
	public static void codeCReuse(Environment environment, Environment globals, GenerationContext context, Expression e, int sd, boolean first) throws GenerateException {
		context.debug("codeC " + environment + " " + e);

		Label A = context.makeLabel();
		Label B = context.makeLabel();
		
		Collection<Identifier> free = e.getFreeVariables();
		
		int i = 0;
		for (Identifier identifier : free) {
			Code.getvar(identifier, environment, context, sd + i);
			i++;
		}
		
		if (first) {
			context.addInstruction(new MkVec(globals.size()));
		} else {
			context.addInstruction(new CopyGlob());
		}
		context.addInstruction(new MkClos(A));
		context.addInstruction(new Jump(B));
		context.addInstruction(A);
		CodeV.codeV(environment, context, e, 0);
		context.addInstruction(new Update());
		context.addInstruction(B);
	}
}
