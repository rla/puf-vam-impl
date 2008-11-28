package tr.fn.test;

import java.io.File;
import java.io.IOException;

import junit.framework.TestCase;
import tr.fn.Compile;
import tr.fn.gen.GenerateException;
import tr.fn.opt.OptimizationException;
import tr.fn.pre.PreprocessorException;

public class VarmoBasicTest extends TestCase {
	
	public void testBasic1() throws PreprocessorException, GenerateException, IOException, OptimizationException {
		Compile.compile(new File("test/varmo/basic1.puf"), new File("test/varmo/out/basic1.f"), true, true);
	}
}
