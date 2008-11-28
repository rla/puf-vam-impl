package tr.fn.test;

import java.io.IOException;

import tr.fn.Compile;
import tr.fn.gen.GenerateException;
import tr.fn.opt.OptimizationException;
import tr.fn.pre.PreprocessorException;
import junit.framework.TestCase;

public class CompileTest extends TestCase {
	
	public void testCompile() throws PreprocessorException, GenerateException, IOException, OptimizationException {
		Compile.main(new String[] {"-in", "test/include.fn", "-out", "test/out/include.fn"});
	}
}
