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
	
	public void testTupleAccess() throws Exception {
		List<Declaration> l = getDeclarations("main = #2 (1,2,3);");
		assertEquals(1, l.size());
		assertEquals("main = fn -> `(# 2 (1,2,3))", l.get(0).toString());
	}
	
	public void testEmptyList() throws Exception {
		List<Declaration> l = getDeclarations("main = [];");
		assertEquals(1, l.size());
		assertEquals("main = fn -> []", l.get(0).toString());
	}
	
	public void testSingletonList() throws Exception {
		List<Declaration> l = getDeclarations("main = [3];");
		assertEquals(1, l.size());
		assertEquals("main = fn -> [3]", l.get(0).toString());
	}
	
	public void testEmptyTuple() throws Exception {
		List<Declaration> l = getDeclarations("main = ();");
		assertEquals(1, l.size());
		assertEquals("main = fn -> ()", l.get(0).toString());
	}
	
	public void testEmptyTupleLet() throws Exception {
		List<Declaration> l = getDeclarations("main = let () = () in 1 + 2;");
		assertEquals(1, l.size());
		assertEquals("main = fn -> let () = () ; in (1 + 2)", l.get(0).toString());
	}
	
	public void testBinOpApp() throws Exception {
		List<Declaration> l = getDeclarations("main = n * f 2;");
		assertEquals(1, l.size());
		assertEquals("main = fn -> (n * `(f 2))", l.get(0).toString());
	}
	
	public void testBinOpApp2() throws Exception {
		List<Declaration> l = getDeclarations("main = n * f 2 4;");
		assertEquals(1, l.size());
		assertEquals("main = fn -> (n * `(f 2 4))", l.get(0).toString());
	}
	
	public void testBinOpLet() throws Exception {
		List<Declaration> l = getDeclarations("main = n * f let x = 2; in x;");
		assertEquals(1, l.size());
		assertEquals("main = fn -> (n * `(f let x = 2; in x))", l.get(0).toString());
	}
	
	public void testLetAppLet() throws Exception {
		List<Declaration> l = getDeclarations("main = let x = f; in x let g = 2; in g + 2;");
		assertEquals(1, l.size());
		assertEquals("main = fn -> let x = f; in `(x let g = 2; in (g + 2))", l.get(0).toString());
	}
	
	public void testLetFarg() throws Exception {
		List<Declaration> l = getDeclarations("main = let I x = x; in I 2;");
		assertEquals(1, l.size());
		assertEquals("main = fn -> let I = fn x -> x; in `(I 2)", l.get(0).toString());
	}
	
	public void testCase() throws Exception {
		List<Declaration> l = getDeclarations("main = case x of [] -> 1; h:t -> h + t;");
		assertEquals(1, l.size());
		assertEquals("main = fn -> case of [] -> 1 ; h : t -> (h + t)", l.get(0).toString());
	}
	
	public void testTupleLet() throws Exception {
		List<Declaration> l = getDeclarations("main = let (y,z) = f 2 in s x y z;");
		assertEquals(1, l.size());
		assertEquals("main = fn -> let (y,z) = `(f 2) ; in `(s x y z)", l.get(0).toString());
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
		List<Declaration> l = getDeclarations("main = 2 : 3 : f;");
		assertEquals(1, l.size());
		assertEquals("main = fn -> 2 : 3 : f : []", l.get(0).toString());
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
		assertEquals("main = fn -> `(fn x -> (x + 1) 2)", l.get(0).toString());
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
