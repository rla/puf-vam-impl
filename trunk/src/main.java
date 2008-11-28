
import java.io.File;
import java.io.IOException;

import tr.fn.gen.CodeV;
import tr.fn.gen.Environment;
import tr.fn.gen.GenerateException;
import tr.fn.gen.GenerationContext;
import tr.fn.gen.instr.Halt;
import tr.fn.grammar.test.*;
import tr.fn.ast.*;

public class main {

	/**
	 * @param args
	 * @throws GenerateException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws GenerateException, IOException {
		AstBuilder builder = new AstBuilder();
		LetRec program = builder.buildProgram(TestUtil.getTree("test/proov.fn"));
		GenerationContext context = new GenerationContext();
		context.setDebug(false);
		CodeV.codeV(new Environment(null), context, program, 0); 
		context.addInstruction(new Halt()); 
		context.saveToFile(new File("test/out/proov.f"));
	}

}
