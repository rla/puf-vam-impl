package tr.fn.grammar.test;

import junit.framework.TestCase;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import tr.fn.util.TreeUtil;

public class ConstructsTest extends TestCase {
	
	public void testConstant() {
		Tree tree = TreeUtil.getTree("test/constant.fn");
		assertEquals("(= f 3) (= g (+ (+ 4 a) f) f d) null", tree.toStringTree());
	}
	
	public void testConstantCaptital() {
		Tree tree = TreeUtil.getTree("test/constantc.fn");
		assertEquals("(= I x x) (= main (APP I x)) null", tree.toStringTree());
	}
	
	public void testAdd() {
		CommonTree tree = (CommonTree) TreeUtil.getTree("test/add.fn");
		assertEquals("(= f (+ x 3) x) null", tree.toStringTree());
	}
	
	public void testIfElse() {
		Tree tree = TreeUtil.getTree("test/ifelse.fn");
		assertEquals("(= f (if (== x 2) 1 (if (> x 4) 2 4)) x) null", tree.toStringTree());
	}
	
	public void testIfElseIntBool() {
		Tree tree = TreeUtil.getTree("test/intbool.fn");
		assertEquals("(= f (if (- 1 x) 1 0) x) null", tree.toStringTree());
	}
	
	public void testLambda() {
		Tree tree = TreeUtil.getTree("test/lambda.fn");
		assertEquals("(= add (fn (+ (+ x y) z) x y)) null", tree.toStringTree());
	}
	
	public void testLet() {
		Tree tree = TreeUtil.getTree("test/let.fn");
		assertEquals("(= f (let (+ b s) (= s (+ x 1)) (= b 2)) x) null", tree.toStringTree());
	}
	
	public void testLetRec() {
		Tree tree = TreeUtil.getTree("test/letrec.fn");
		assertEquals("(= fact (letrec (APP fact n) (= factt (if (== n 0) 1 (* n (APP factt (- n 1)))) n)) n) null", tree.toStringTree());
	}
	
	public void testFapp() {
		Tree tree = TreeUtil.getTree("test/fapp.fn");
		assertEquals("(= main (+ (APP f 2 3 4) (* 1 5))) null", tree.toStringTree());
	}
	
	public void testFappParentheses() {
		Tree tree = TreeUtil.getTree("test/fappp.fn");
		assertEquals("(= main (APP f (+ 2 3))) null", tree.toStringTree());
	}
	
	public void testFappParentheses2() {
		Tree tree = TreeUtil.getTree("test/fappp2.fn");
		assertEquals("(= main (APP f (+ 2 3) 3 (- 1 3))) null", tree.toStringTree());
	}
	
	public void testFappF() {
		Tree tree = TreeUtil.getTree("test/fappf.fn");
		assertEquals("(= main (+ (APP f g 2 2) 3)) null", tree.toStringTree());
	}
	
	public void testComments() {
		Tree tree = TreeUtil.getTree("test/comments.fn");
		assertEquals("(= main 2) null", tree.toStringTree());
	}
}
