package tr.fn.test;

import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tr.fn.grammar.test.GrammarTest;

/**
 * Single suit for running all Puf tests.
 */
@RunWith(Suite.class)
@SuiteClasses({
	GrammarTest.class,
	CompileTest.class,
	VarmoBasicTest.class,
	VarmoAdvancedTest.class,
	GeneralRunTest.class,
	OptimizationCombinationsTest.class
})
public class PufTestSuite extends TestSuite {}
