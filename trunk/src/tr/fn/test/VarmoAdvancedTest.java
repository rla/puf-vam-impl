package tr.fn.test;

import java.io.File;

import junit.framework.TestCase;

public class VarmoAdvancedTest extends TestCase {
	
	public void testFact() throws Exception {
		assertEquals(120, RunUtil.compileAndRun(new File("test/varmo/fact.puf")));
	}
	
	public void testFibo() throws Exception {
		assertEquals(3, RunUtil.compileAndRun(new File("test/varmo/fibo.puf")));
	}
	
	public void testFlist1() throws Exception {
		assertEquals(4, RunUtil.compileAndRun(new File("test/varmo/flist1.puf")));
	}
	
	public void testFlist2() throws Exception {
		assertEquals(4, RunUtil.compileAndRun(new File("test/varmo/flist2.puf")));
	}
	
	public void testFlist3() throws Exception {
		assertEquals(3, RunUtil.compileAndRun(new File("test/varmo/flist3.puf")));
	}
	
	public void testGcd() throws Exception {
		assertEquals(2, RunUtil.compileAndRun(new File("test/varmo/gcd.puf")));
	}
}
