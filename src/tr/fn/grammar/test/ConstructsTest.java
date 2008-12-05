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
	
	public void testList() {
		Tree tree = TreeUtil.getTree("test/list.fn");
		assertEquals("(= main (: 1 (: 2 (: 3 [])))) null", tree.toStringTree());
	}
	
	public void testListArithm() {
		Tree tree = TreeUtil.getTree("test/listarithm.fn");
		assertEquals("(= main (: (+ 1 2) (: (- 2 5) []))) null", tree.toStringTree());
	}
	
	public void testTuple() {
		Tree tree = TreeUtil.getTree("test/tuple.fn");
		assertEquals("(= main (TUPLE 1 2 ))) null", tree.toStringTree());
	}
	
	public void testTupleNoTuple() {
		Tree tree = TreeUtil.getTree("test/tuplenotuple.fn");
		assertEquals("(= main (TUPLE 1 ))) null", tree.toStringTree());
	}
	
	public void testTupleEmpty() {
		Tree tree = TreeUtil.getTree("test/tupleempty.fn");
		assertEquals("(= main ()) null", tree.toStringTree());
	}
	
	public void testListSugar() {
		Tree tree = TreeUtil.getTree("test/listsugar.fn");
		assertEquals("(= main (LIST 1 2 a b ])) null", tree.toStringTree());
	}
	
	public void testListEmpty() {
		Tree tree = TreeUtil.getTree("test/listempty.fn");
		assertEquals("(= main []) null", tree.toStringTree());
	}
}
