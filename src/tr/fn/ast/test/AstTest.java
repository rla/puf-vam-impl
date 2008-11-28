package tr.fn.ast.test;

import junit.framework.TestCase;

import org.antlr.runtime.tree.Tree;

import tr.fn.ast.AstBuilder;
import tr.fn.ast.LetRec;
import tr.fn.ast.VerifyException;
import tr.fn.util.TreeUtil;

public class AstTest extends TestCase {
	
	public void testProgram() throws VerifyException {
		Tree tree = TreeUtil.getTree("test/three.fn");
		System.out.println(tree.toStringTree());
		AstBuilder builder = new AstBuilder();
		LetRec program = builder.buildProgram(tree);
		assertNotNull(program);
		assertEquals(3, program.getDeclarations().size());
	}
}
