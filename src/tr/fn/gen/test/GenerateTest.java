package tr.fn.gen.test;

import java.io.File;
import java.io.IOException;

import junit.framework.TestCase;

import org.antlr.runtime.tree.Tree;

import tr.fn.PuFException;
import tr.fn.ast.AstBuilder;
import tr.fn.ast.LetRec;
import tr.fn.gen.CodeV;
import tr.fn.gen.Environment;
import tr.fn.gen.GenerateException;
import tr.fn.gen.GenerationContext;
import tr.fn.gen.instr.Halt;
import tr.fn.util.TreeUtil;

public class GenerateTest extends TestCase {
	
	public void testMainFArgCall() throws PuFException, IOException {
		Tree tree = TreeUtil.getTree("test/fmainfarg.fn");
		System.out.println(tree.toStringTree());
		AstBuilder builder = new AstBuilder();
		LetRec program = builder.buildProgram(tree);

		GenerationContext context = new GenerationContext();
		CodeV.codeV(new Environment(null), context, program, 0);
		context.addInstruction(new Halt());
		
		context.saveToFile(new File("test/out/fmain.f"));
	}
	
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
	
}
