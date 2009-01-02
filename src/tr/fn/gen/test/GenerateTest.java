package tr.fn.gen.test;

import java.io.File;

import junit.framework.TestCase;
import tr.fn.ast.AstUtil;
import tr.fn.ast.LetRec;
import tr.fn.gen.Code;
import tr.fn.gen.GenerationContext;
import tr.fn.gen.instr.Halt;
import tr.fn.opt.OptimizationContext;
import tr.fn.opt.StrictnessAnalysis;
import tr.fn.post.PostprocessContext;
import tr.fn.post.SpaghettiRemover;

public class GenerateTest extends TestCase {
	
	public void testCaseList() throws Exception {
		LetRec program = AstUtil.getAst(new File("test/list/singeltonlist.fn"));
		System.out.println(program);
		
		program.markScopeExpression(null);
		OptimizationContext optimizationContext = new OptimizationContext(program, true);
		new StrictnessAnalysis(optimizationContext).execute();

		GenerationContext context = new GenerationContext();
		context.setDebug(true);
		context.setDebugInstr(true);
		context.setTryToEliminateClosures(true);
		context.setStrictness(optimizationContext.getStrictnessInfo());
		Code.code(program, context);
		context.addInstruction(new Halt());
		
		PostprocessContext postProcessContext = new PostprocessContext(context.getInstructions());
		new SpaghettiRemover(postProcessContext).execute();
		
		postProcessContext.saveToFile(new File("test/list/out/listcase.f"));
	}
}
