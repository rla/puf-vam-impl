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
	
	public void testBasic2() throws PreprocessorException, GenerateException, IOException, OptimizationException {
		Compile.compile(new File("test/varmo/basic2.puf"), new File("test/varmo/out/basic2.f"), true, true);
	}
	
	public void testBasic3() throws PreprocessorException, GenerateException, IOException, OptimizationException {
		Compile.compile(new File("test/varmo/basic3.puf"), new File("test/varmo/out/basic3.f"), false, true);
	}
	
	public void testBasic4() throws PreprocessorException, GenerateException, IOException, OptimizationException {
		Compile.compile(new File("test/varmo/basic4.puf"), new File("test/varmo/out/basic4.f"), false, true);
	}
	
	public void testBasic5() throws PreprocessorException, GenerateException, IOException, OptimizationException {
		Compile.compile(new File("test/varmo/basic5.puf"), new File("test/varmo/out/basic5.f"), false, true);
	}
	
	public void testBasic6() throws PreprocessorException, GenerateException, IOException, OptimizationException {
		Compile.compile(new File("test/varmo/basic6.puf"), new File("test/varmo/out/basic6.f"), false, true);
	}
	
	public void testBasic7() throws PreprocessorException, GenerateException, IOException, OptimizationException {
		Compile.compile(new File("test/varmo/basic7.puf"), new File("test/varmo/out/basic7.f"), false, true);
	}
	
	public void testBasic8() throws PreprocessorException, GenerateException, IOException, OptimizationException {
		Compile.compile(new File("test/varmo/basic8.puf"), new File("test/varmo/out/basic8.f"), false, true);
	}
}
