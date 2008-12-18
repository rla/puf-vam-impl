package tr.fn.ast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import tr.fn.ast.BinaryOperator.Type;
import tr.fn.ast.list.HeadTailList;
import tr.fn.grammar.PufLexer;
import tr.fn.grammar.PufParser;

public class AstUtil {
	
	public static LetRec makeAst(List<Declaration> declarations) {
		List<Expression> arguments = Collections.emptyList();
		return new LetRec(declarations, new Application(new Identifier(Declaration.MAIN_NAME), arguments));
	}
	
	public static LetRec getAst(File file) throws Exception {
		return makeAst(getDeclarations(file));
	}
	
	public static LetRec getAst(String code) throws Exception {
		return makeAst(getDeclarations(code));
	}
	
	public static List<Declaration> getDeclarations(File file) throws Exception {
		return new PufParser(getTokenStream(file)).program().v;
	}
	
	private static CommonTokenStream getTokenStream(File file) throws IOException {
		return new CommonTokenStream(new PufLexer(new ANTLRReaderStream(new BufferedReader(new FileReader(file)))));
	}
	
	public static List<Declaration> getDeclarations(String code) throws Exception {
		return new PufParser(getTokenStream(code)).program().v;
	}
	
	private static CommonTokenStream getTokenStream(String code) throws IOException {
		return new CommonTokenStream(new PufLexer(new ANTLRReaderStream(new StringReader(code))));
	}
	
	public static Expression makeHeadTailList(List<Expression> expressions) {
		if (expressions.size() == 1) {
			return expressions.get(0);
		}
		expressions = new ArrayList<Expression>(expressions);
		return makeHeadTailList1(expressions);
	}
	
	private static Expression makeHeadTailList1(List<Expression> expressions) {
		if (expressions.isEmpty()) {
			return new HeadTailList();
		}
		
		Expression head = expressions.get(0);
		expressions.remove(0);
		Expression tail = makeHeadTailList1(expressions);
		
		return new HeadTailList(head, tail);
	}
	
	public static Expression makeBinaryOperator(String symbol, List<Expression> expressions, boolean isLeftAssociative) {
		expressions = new ArrayList<Expression>(expressions);
		if (isLeftAssociative) {
			Collections.reverse(expressions);
		}
		
		return makeBinaryOperator1(symbol, expressions, isLeftAssociative);
	}
	
	private static Expression makeBinaryOperator1(String symbol, List<Expression> expressions, boolean isLeftAssociative) {
		if (expressions.size() == 1) {
			return expressions.get(0);
		}
		Expression left = expressions.get(0);
		expressions.remove(0);
		Expression right = makeBinaryOperator1(symbol, expressions, isLeftAssociative);
		
		if (isLeftAssociative) {
			return new BinaryOperator(Type.getType(symbol), right, left);
		} else {
			return new BinaryOperator(Type.getType(symbol), left, right);
		}
	}
}
