package tr.fn.test;

import java.io.File;

import junit.framework.TestCase;

public class GeneralRunTest extends TestCase {
	
	public void testTupleLet() throws Exception {
		assertEquals(10, RunUtil.compileAndRun(new File("test/tuple3.fn")));
	}
}
