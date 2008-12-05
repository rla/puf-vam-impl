package tr.fn.ast.test;

import junit.framework.TestCase;

import org.antlr.runtime.tree.Tree;

import tr.fn.ast.AstBuilder;
import tr.fn.ast.Declaration;
import tr.fn.ast.Identifier;
import tr.fn.ast.IfThenElse;
import tr.fn.ast.Integer;
import tr.fn.ast.Lambda;
import tr.fn.ast.LetRec;
import tr.fn.ast.Tuple;
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
	
	public void testLambda() throws VerifyException {
		Tree tree = TreeUtil.getTree("test/lambda.fn");
		System.out.println(tree.toStringTree());
		AstBuilder builder = new AstBuilder();
		LetRec program = builder.buildProgram(tree);
		assertNotNull(program);
		assertEquals(1, program.getDeclarations().size());
		Declaration main = program.getDeclarations().get(0);
		assertTrue(main.getExpression() instanceof Lambda);
		Lambda lambda = (Lambda) main.getExpression();
		assertEquals(2, lambda.getArguments().size());
		assertTrue(lambda.getFreeVariables().contains(new Identifier(0, "z")));
	}
	
	public void testTuple() throws VerifyException {
		Tree tree = TreeUtil.getTree("test/tuple.fn");
		System.out.println(tree.toStringTree());
		AstBuilder builder = new AstBuilder();
		LetRec program = builder.buildProgram(tree);
		assertNotNull(program);
		assertEquals(1, program.getDeclarations().size());
		Declaration main = program.getDeclarations().get(0);
		assertTrue(main.getExpression() instanceof Tuple);
		Tuple tuple = (Tuple) main.getExpression();
		assertEquals(2, tuple.getExpressions().size());
		assertTrue(tuple.getExpressions().get(0) instanceof Integer);
	}
	
	public void testTupleNoTuple() throws VerifyException {
		Tree tree = TreeUtil.getTree("test/tuplenotuple.fn");
		System.out.println(tree.toStringTree());
		AstBuilder builder = new AstBuilder();
		LetRec program = builder.buildProgram(tree);
		assertNotNull(program);
		assertEquals(1, program.getDeclarations().size());
		Declaration main = program.getDeclarations().get(0);
		assertTrue(main.getExpression() instanceof Integer);
	}
	
	public void testTupleEmpty() throws VerifyException {
		Tree tree = TreeUtil.getTree("test/tupleempty.fn");
		System.out.println(tree.toStringTree());
		AstBuilder builder = new AstBuilder();
		LetRec program = builder.buildProgram(tree);
		assertNotNull(program);
		assertEquals(1, program.getDeclarations().size());
		Declaration main = program.getDeclarations().get(0);
		assertTrue(main.getExpression() instanceof Tuple);
	}
	
	public void testIfThen() throws VerifyException {
		Tree tree = TreeUtil.getTree("test/mainifthen.fn");
		System.out.println(tree.toStringTree());
		AstBuilder builder = new AstBuilder();
		LetRec program = builder.buildProgram(tree);
		assertNotNull(program);
		assertEquals(1, program.getDeclarations().size());
		Declaration main = program.getDeclarations().get(0);
		assertTrue(main.getExpression() instanceof IfThenElse);
		IfThenElse ifThenElse = (IfThenElse) main.getExpression();
		Integer condition = (Integer) ifThenElse.getCondition();
		Integer thenExpr = (Integer) ifThenElse.getThenExpression();
		Integer elseExpr = (Integer) ifThenElse.getElseExpression();
		assertEquals(0, condition.getValue());
		assertEquals(2, thenExpr.getValue());
		assertEquals(5, elseExpr.getValue());
	}
}
