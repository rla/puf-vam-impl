package tr.fn.test;

import java.io.File;

import junit.framework.TestCase;

public class GeneralRunTest extends TestCase {
	
	public void testSingletonList() throws Exception {
		assertEquals(3, RunUtil.compileAndRun(new File("test/singeltonlist.fn")));
	}
	
	public void testTupleLet() throws Exception {
		assertEquals(10, RunUtil.compileAndRun(new File("test/tuple3.fn")));
	}
	
	public void testSelect1() throws Exception {
		assertEquals(2, RunUtil.compileAndRun(new File("test/select/select1.fn")));
	}
	
	public void testSelect2() throws Exception {
		assertEquals(2, RunUtil.compileAndRun(new File("test/select/select2.fn")));
	}
	
	public void testSelect3() throws Exception {
		assertEquals(2, RunUtil.compileAndRun(new File("test/select/select3.fn")));
	}
}
