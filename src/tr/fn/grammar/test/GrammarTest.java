package tr.fn.grammar.test;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import junit.framework.TestCase;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import tr.fn.ast.Declaration;
import tr.fn.grammar.PufLexer;
import tr.fn.grammar.PufParser;


public class GrammarTest extends TestCase {
	
	public void testCase() throws Exception {
		List<Declaration> l = getDeclarations("main = case x of [] -> 1; h:t -> h + t;");
		assertEquals(1, l.size());
		assertEquals("main = fn -> case of [] -> 1 ; h : t -> (h + t)", l.get(0).toString());
	}
	
	public void testLetRec() throws Exception {
		List<Declaration> l = getDeclarations("main = letrec f = 2; in f;");
		assertEquals(1, l.size());
		assertEquals("main = fn -> letrec f = 2; in f", l.get(0).toString());
	}
	
	public void testLet() throws Exception {
		List<Declaration> l = getDeclarations("main = let f = 2; in f;");
		assertEquals(1, l.size());
		assertEquals("main = fn -> let f = 2; in f", l.get(0).toString());
	}

	public void testList1() throws Exception {
		List<Declaration> l = getDeclarations("main = 2 : 3 : 5;");
		assertEquals(1, l.size());
		assertEquals("main = fn -> 2 : 3 : 5 : []", l.get(0).toString());
	}
	
	public void testList2() throws Exception {
		List<Declaration> l = getDeclarations("main = [2, 3, 5];");
		assertEquals(1, l.size());
		assertEquals("main = fn -> 2 : 3 : 5 : []", l.get(0).toString());
	}
	
	public void testLambda() throws Exception {
		List<Declaration> l = getDeclarations("main = fn x -> x + 1;");
		assertEquals(1, l.size());
		assertEquals("main = fn -> fn x -> (x + 1)", l.get(0).toString());
	}
	
	public void testLambdaAppl() throws Exception {
		List<Declaration> l = getDeclarations("main = (fn x -> x + 1) 2;");
		assertEquals(1, l.size());
		assertEquals("main = fn -> (fn x -> (x + 1) 2)", l.get(0).toString());
	}
	
	public void testTuple() throws Exception {
		List<Declaration> l = getDeclarations("main = (a,b,c);");
		assertEquals(1, l.size());
		assertEquals("main = fn -> (a,b,c)", l.get(0).toString());
	}
	
	public void testIfElse() throws Exception {
		List<Declaration> l = getDeclarations("main = if 1 then 2 else 5;");
		assertEquals(1, l.size());
		assertEquals("main = fn -> if 1 then 2 else 5", l.get(0).toString());
	}
	
	public static List<Declaration> getDeclarations(String code) throws Exception {
		PufParser parser = new PufParser(getTokenStream(code));
		return parser.program().v;
	}
	
	private static CommonTokenStream getTokenStream(String code) throws IOException {
		PufLexer lexer = new PufLexer(new ANTLRReaderStream(new StringReader(code)));
		return new CommonTokenStream(lexer);
	}
}
