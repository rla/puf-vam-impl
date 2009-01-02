package tr.fn.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import tr.fn.opt.BooleanVectorGenerator;

/**
 * A rather large test case for trying out different combinations of
 * optimizations. Executed by PufTestSuite.
 */
@RunWith(Parameterized.class)
public class OptimizationCombinationsTest {
	private final boolean nodead;
	private final boolean strictness;
	private final boolean noSphagetti;
	private final boolean tailcalls;
	
	public OptimizationCombinationsTest(
		boolean nodead,
		boolean strictness,
		boolean noSphagetti,
		boolean tailcalls) {
		
		this.nodead = nodead;
		this.strictness = strictness;
		this.noSphagetti = noSphagetti;
		this.tailcalls = tailcalls;
	}
	
	@Test public void testBasic1() throws Exception {
		assertEquals(3, RunUtil.compileAndRun(new File("test/varmo/basic1.puf"), nodead, strictness, noSphagetti, tailcalls));
	}
	
	@Test public void testBasic2() throws Exception {
		assertEquals(3, RunUtil.compileAndRun(new File("test/varmo/basic2.puf"), nodead, strictness, noSphagetti, tailcalls));
	}
	
	@Test public void testBasic3() throws Exception {
		assertEquals(3, RunUtil.compileAndRun(new File("test/varmo/basic3.puf"), nodead, strictness, noSphagetti, tailcalls));
	}
	
	@Test public void testBasic4() throws Exception {
		assertEquals(3, RunUtil.compileAndRun(new File("test/varmo/basic4.puf"), nodead, strictness, noSphagetti, tailcalls));
	}
	
	@Test public void testBasic5() throws Exception {
		assertEquals(3, RunUtil.compileAndRun(new File("test/varmo/basic5.puf"), nodead, strictness, noSphagetti, tailcalls));
	}
	
	@Test public void testBasic6() throws Exception {
		assertEquals(4, RunUtil.compileAndRun(new File("test/varmo/basic6.puf"), nodead, strictness, noSphagetti, tailcalls));
	}
	
	@Test public void testBasic7() throws Exception {
		assertEquals(5, RunUtil.compileAndRun(new File("test/varmo/basic7.puf"), nodead, strictness, noSphagetti, tailcalls));
	}
	
	@Test public void testBasic8() throws Exception {
		assertEquals(8, RunUtil.compileAndRun(new File("test/varmo/basic8.puf"), nodead, strictness, noSphagetti, tailcalls));
	}
	
	@Test public void testFact() throws Exception {
		assertEquals(120, RunUtil.compileAndRun(new File("test/varmo/fact.puf"), nodead, strictness, noSphagetti, tailcalls));
	}
	
	@Test public void testFibo() throws Exception {
		assertEquals(3, RunUtil.compileAndRun(new File("test/varmo/fibo.puf"), nodead, strictness, noSphagetti, tailcalls));
	}
	
	@Test public void testFlist1() throws Exception {
		assertEquals(4, RunUtil.compileAndRun(new File("test/varmo/flist1.puf"), nodead, strictness, noSphagetti, tailcalls));
	}
	
	@Test public void testFlist2() throws Exception {
		assertEquals(4, RunUtil.compileAndRun(new File("test/varmo/flist2.puf"), nodead, strictness, noSphagetti, tailcalls));
	}
	
	@Test public void testFlist3() throws Exception {
		assertEquals(3, RunUtil.compileAndRun(new File("test/varmo/flist3.puf"), nodead, strictness, noSphagetti, tailcalls));
	}
	
	@Test public void testGcd() throws Exception {
		assertEquals(2, RunUtil.compileAndRun(new File("test/varmo/gcd.puf"), nodead, strictness, noSphagetti, tailcalls));
	}
	
	@Test public void testSingletonList() throws Exception {
		assertEquals(3, RunUtil.compileAndRun(new File("test/list/singeltonlist.fn"), nodead, strictness, noSphagetti, tailcalls));
	}
	
	@Test public void testTupleLet() throws Exception {
		assertEquals(10, RunUtil.compileAndRun(new File("test/tuple3.fn"), nodead, strictness, noSphagetti, tailcalls));
	}
	
	@Test public void testSelect1() throws Exception {
		assertEquals(2, RunUtil.compileAndRun(new File("test/select/select1.fn"), nodead, strictness, noSphagetti, tailcalls));
	}
	
	@Test public void testSelect2() throws Exception {
		assertEquals(2, RunUtil.compileAndRun(new File("test/select/select2.fn"), nodead, strictness, noSphagetti, tailcalls));
	}
	
	@Test public void testSelect3() throws Exception {
		assertEquals(2, RunUtil.compileAndRun(new File("test/select/select3.fn"), nodead, strictness, noSphagetti, tailcalls));
	}
	
	 @Parameters
	public static Collection<?> combinations() {
		 BooleanVectorGenerator generator = new BooleanVectorGenerator(4);
		 List<Object[]> combs = new ArrayList<Object[]>();
		 
		 while (generator.hasNext()) {
			 boolean[] vector = generator.next();
			 Object[] values = new Object[vector.length];
			 
			 for (int i = 0; i < vector.length; i++) {
				 values[i] = vector[i];
			 }
			 combs.add(values);
		 }
		 
		 return combs;
	}
}
