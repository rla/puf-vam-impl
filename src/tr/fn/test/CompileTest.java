package tr.fn.test;

import junit.framework.TestCase;
import tr.fn.Compile;

public class CompileTest extends TestCase {
	
	public void testCompile() throws Exception {
		Compile.main(new String[] {"-in", "test/include.fn", "-out", "test/out/include.fn"});
	}
}
