package tr.fn.pre;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.apache.commons.lang.StringUtils;

import tr.fn.grammar.FunParser;
import tr.fn.util.TreeUtil;

public class PreprocessContext {
	private Map<File, List<String>> files;
	private File main;
	private boolean debug;
	
	public PreprocessContext(File main, boolean debug) {
		this.files = new HashMap<File, List<String>>();
		this.main = main;
		this.debug = debug;
	}
	
	public void addFile(File file, List<String> lines) {
		files.put(file, lines);
	}
	
	public Tree getTreeAfterPreprocess() {
		CommonTree tree = new CommonTree();
		
		for (Entry<File, List<String>> entry : files.entrySet()) {
			if (debug) {
				System.out.println("Parsing file " + entry.getKey().getAbsolutePath());
			}
			Tree fileTree = TreeUtil.getTree(entry.getKey(), StringUtils.join(entry.getValue(), '\n'));
			for (int i = 0; i < fileTree.getChildCount(); i++) {
				Tree decl = fileTree.getChild(i);
				if (decl.getType() == FunParser.EOF) {
					break;
				}
				tree.addChild(decl);
			}
		}
		
		return tree;
	}

	public File getMain() {
		return main;
	}

}
