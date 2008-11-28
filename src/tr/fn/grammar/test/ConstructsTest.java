package tr.fn.grammar.test;

import junit.framework.TestCase;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

public class ConstructsTest extends TestCase {
	
	public void testConstant() {
		Tree tree = TestUtil.getTree("test/constant.fn");
		assertEquals("(= f 3) (= g (+ (+ 4 a) f) f d)", tree.toStringTree());
	}
	
	public void testConstantCaptital() {
		Tree tree = TestUtil.getTree("test/constantc.fn");
		assertEquals("(= I x x) (= main (APP I x))", tree.toStringTree());
	}
	
	public void testAdd() {
		CommonTree tree = (CommonTree) TestUtil.getTree("test/add.fn");
		assertEquals("(= f (+ x 3) x)", tree.toStringTree());
	}
	
	public void testIfElse() {
		Tree tree = TestUtil.getTree("test/ifelse.fn");
		assertEquals("(= f (if (== x 2) 1 (if (> x 4) 2 4)) x)", tree.toStringTree());
	}
	
	public void testIfElseIntBool() {
		Tree tree = TestUtil.getTree("test/intbool.fn");
		assertEquals("(= f (if (- 1 x) 1 0) x)", tree.toStringTree());
	}
	
	public void testLambda() {
		Tree tree = TestUtil.getTree("test/lambda.fn");
		assertEquals("(= add (fn (+ (+ x y) z) x y))", tree.toStringTree());
	}
	
	public void testLet() {
		Tree tree = TestUtil.getTree("test/let.fn");
		assertEquals("(= f (let (+ b s) (= s (+ x 1)) (= b 2)) x)", tree.toStringTree());
	}
	
	public void testLetRec() {
		Tree tree = TestUtil.getTree("test/letrec.fn");
		assertEquals("(= fact (letrec (APP fact n) (= factt (if (== n 0) 1 (* n (APP factt (- n 1)))) n)) n)", tree.toStringTree());
	}
	
	public void testFapp() {
		Tree tree = TestUtil.getTree("test/fapp.fn");
		assertEquals("(= main (+ (APP f 2 3 4) (* 1 5)))", tree.toStringTree());
	}
	
	public void testFappParentheses() {
		Tree tree = TestUtil.getTree("test/fappp.fn");
		assertEquals("(= main (APP f (+ 2 3)))", tree.toStringTree());
	}
	
	public void testFappParentheses2() {
		Tree tree = TestUtil.getTree("test/fappp2.fn");
		assertEquals("(= main (APP f (+ 2 3) 3 (- 1 3)))", tree.toStringTree());
	}
	
	public void testFappF() {
		Tree tree = TestUtil.getTree("test/fappf.fn");
		assertEquals("(= main (+ (APP f g 2 2) 3))", tree.toStringTree());
	}
	
	public void testComments() {
		Tree tree = TestUtil.getTree("test/comments.fn");
		assertEquals("(= main 2)", tree.toStringTree());
	}
}
