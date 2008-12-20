package tr.fn.opt.test;

import java.io.File;

import junit.framework.TestCase;
import tr.fn.ast.AstUtil;
import tr.fn.ast.LetRec;
import tr.fn.opt.AbsInterpreter;

public class AbstractInterpretationTest extends TestCase {
	/*
	public void testFact() throws Exception {
		//LetRec program = AstUtil.getAst("main = f 2; f x = x; g x = x 2;");
		LetRec program = AstUtil.getAst(new File("test/fact.fn"));
		program.markScopeExpression(null);
		AbsInterpreter interpreter = new AbsInterpreter(program, true);
		interpreter.run();
	}*/
	
	public void testInflist() throws Exception {
		LetRec program = AstUtil.getAst(
			"infinite x = cons x (infinite x);" +
			"main = hd (tl (infinite 4));" +
			"cons x xs = fn cc cn -> cc x xs;" +
			"hd xs     = xs K loop;" +
			"loop      = loop;" +
			"K x y   = x;"
		);
		program.markScopeExpression(null);
		AbsInterpreter interpreter = new AbsInterpreter(program, true);
		interpreter.run();
	}
}
