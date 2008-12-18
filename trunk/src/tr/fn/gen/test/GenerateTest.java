package tr.fn.gen.test;

import java.io.File;

import junit.framework.TestCase;
import tr.fn.ast.AstUtil;
import tr.fn.ast.LetRec;
import tr.fn.gen.Code;
import tr.fn.gen.GenerationContext;
import tr.fn.gen.instr.Halt;

public class GenerateTest extends TestCase {
	
	public void testMainFArgCall() throws Exception {
		LetRec program = AstUtil.getAst(new File("test/fmainfarg.fn"));
		System.out.println(program);

		GenerationContext context = new GenerationContext();
		Code.code(program, context);
		context.addInstruction(new Halt());
		
		context.saveToFile(new File("test/out/fmain.f"));

	}
	
	public void testTuple() throws Exception {
		LetRec program = AstUtil.getAst(new File("test/tuplelet.fn"));
		System.out.println(program);

		GenerationContext context = new GenerationContext();
		Code.code(program, context);
		context.addInstruction(new Halt());
		
		context.saveToFile(new File("test/out/tuplelet.cbn"));
	}
	
	/*
	public void testMain2FArgCall() throws PuFException, IOException {
		Tree tree = TreeUtil.getTree("test/fmain2farg.fn");
		System.out.println(tree.toStringTree());
		AstBuilder builder = new AstBuilder();
		LetRec program = builder.buildProgram(tree);

		GenerationContext context = new GenerationContext();
		context.setDebug(false);
		
		CodeV.codeV(new Environment(null), context, program, 0);
		context.addInstruction(new Halt());
		
		context.saveToFile(new File("test/out/2fmain.f"));
	}
	
	
	public void testIfThenElse() throws GenerateException, IOException {
		Tree tree = TreeUtil.getTree("test/mainifthen.fn");
		System.out.println(tree.toStringTree());
		AstBuilder builder = new AstBuilder();
		LetRec program = builder.buildProgram(tree);

		GenerationContext context = new GenerationContext();
		context.setDebug(false);
		
		CodeV.codeV(new Environment(null), context, program, 0);
		context.addInstruction(new Halt());
		
		context.saveToFile(new File("test/out/mainifthen.f"));
	}
	
	public void testIfThenElseF() throws GenerateException, IOException {
		Tree tree = TreeUtil.getTree("test/mainifthenf.fn");
		System.out.println(tree.toStringTree());
		AstBuilder builder = new AstBuilder();
		LetRec program = builder.buildProgram(tree);

		GenerationContext context = new GenerationContext();
		context.setDebug(false);
		
		CodeV.codeV(new Environment(null), context, program, 0);
		context.addInstruction(new Halt());
		
		context.saveToFile(new File("test/out/mainifthenf.f"));
	}
	
	public void testIfThenElseFR() throws GenerateException, IOException {
		Tree tree = TreeUtil.getTree("test/mainifthenfr.fn");
		System.out.println(tree.toStringTree());
		AstBuilder builder = new AstBuilder();
		LetRec program = builder.buildProgram(tree);

		GenerationContext context = new GenerationContext();
		context.setDebug(false);
		
		CodeV.codeV(new Environment(null), context, program, 0);
		context.addInstruction(new Halt());
		
		context.saveToFile(new File("test/out/mainifthenfr.f"));
	}
	*/
}
