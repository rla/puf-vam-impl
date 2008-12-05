package tr.fn.test;

import java.io.File;
import java.io.IOException;

import tr.fn.Compile;
import tr.fn.gen.GenerateException;
import tr.fn.opt.OptimizationException;
import tr.fn.pre.PreprocessorException;
import junit.framework.TestCase;

public class VarmoAdvancedTest extends TestCase {
	
	public void testFact() throws PreprocessorException, GenerateException, OptimizationException, IOException {
		Compile.compile(new File("test/varmo/fact.puf"), new File("test/varmo/out/fact.f"), true, true);
	}
	
	public void testFibo() throws PreprocessorException, GenerateException, OptimizationException, IOException {
		Compile.compile(new File("test/varmo/fibo.puf"), new File("test/varmo/out/fibo.f"), true, true);
	}
	
	public void testFlist1() throws PreprocessorException, GenerateException, OptimizationException, IOException {
		Compile.compile(new File("test/varmo/flist1.puf"), new File("test/varmo/out/flist1.f"), true, true);
	}
	
	public void testFlist2() throws PreprocessorException, GenerateException, OptimizationException, IOException {
		Compile.compile(new File("test/varmo/flist2.puf"), new File("test/varmo/out/flist2.f"), true, true);
	}
	
	public void testFlist3() throws PreprocessorException, GenerateException, OptimizationException, IOException {
		Compile.compile(new File("test/varmo/flist3.puf"), new File("test/varmo/out/flist3.f"), true, true);
	}
	
	public void testGcd() throws PreprocessorException, GenerateException, OptimizationException, IOException {
		Compile.compile(new File("test/varmo/gcd.puf"), new File("test/varmo/out/gcd.f"), true, true);
	}
}
