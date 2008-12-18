package tr.fn.test;

import java.io.File;

import junit.framework.TestCase;

public class VarmoBasicTest extends TestCase {
	
	public void testBasic1() throws Exception {
		assertEquals(3, RunUtil.compileAndRun(new File("test/varmo/basic1.puf")));
	}
	
	public void testBasic2() throws Exception {
		assertEquals(3, RunUtil.compileAndRun(new File("test/varmo/basic2.puf")));
	}
	
	public void testBasic3() throws Exception {
		assertEquals(3, RunUtil.compileAndRun(new File("test/varmo/basic3.puf")));
	}
	
	public void testBasic4() throws Exception {
		assertEquals(3, RunUtil.compileAndRun(new File("test/varmo/basic4.puf")));
	}
	
	public void testBasic5() throws Exception {
		assertEquals(3, RunUtil.compileAndRun(new File("test/varmo/basic5.puf")));
	}
	
	public void testBasic6() throws Exception {
		assertEquals(4, RunUtil.compileAndRun(new File("test/varmo/basic6.puf")));
	}
	
	public void testBasic7() throws Exception {
		assertEquals(5, RunUtil.compileAndRun(new File("test/varmo/basic7.puf")));
	}
	
	public void testBasic8() throws Exception {
		assertEquals(8, RunUtil.compileAndRun(new File("test/varmo/basic8.puf")));
	}
}
