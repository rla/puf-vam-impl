package tr.fn.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import tr.fn.grammar.FunLexer;
import tr.fn.grammar.FunParser;

public class TreeUtil {
	
	public static Tree findAndMergeTrees(Collection<File> files) {
		CommonTree tree = new CommonTree();
		
		for (File file : files) {
			Tree fileTree = getTree(file);
			for (int i = 0; i < fileTree.getChildCount(); i++) {
				Tree decl = tree.getChild(i);
				if (decl.getType() == FunParser.EOF) {
					break;
				}
				tree.addChild(decl);
			}
		}
		
		return tree;
	}
	
	public static Tree getTree(String filename) {
		return getTree(new File(filename));
	}
	
	public static Tree getTree(File file, String contents) {
		try {
			FunParser parser = new FunParser(getTokenStream(new StringReader(contents)));
			return (Tree) parser.program().getTree();
		} catch (Exception e) {
			throw new RuntimeException("Cannot parse input file " + file, e);
		}
	}
	
	public static Tree getTree(File file) {
		try {
			FunParser parser = new FunParser(getTokenStream(new BufferedReader(new FileReader(file))));
			return (Tree) parser.program().getTree();
		} catch (Exception e) {
			throw new RuntimeException("Cannot parse input file " + file, e);
		}
	}
	
	private static CommonTokenStream getTokenStream(Reader reader) throws IOException {
		FunLexer lexer = new FunLexer(new ANTLRReaderStream(reader));
		return new CommonTokenStream(lexer);
	}
}
