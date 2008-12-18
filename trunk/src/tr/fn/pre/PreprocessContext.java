package tr.fn.pre;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang.StringUtils;

import tr.fn.ast.AstUtil;
import tr.fn.ast.Declaration;
import tr.fn.ast.LetRec;

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
	
	public LetRec getAstAfterPreprocessing() throws Exception {
		List<Declaration> declarations = new ArrayList<Declaration>();
		
		for (Entry<File, List<String>> entry : files.entrySet()) {
			if (debug) {
				System.out.println("Parsing file " + entry.getKey().getAbsolutePath());
			}
			declarations.addAll(AstUtil.getDeclarations(StringUtils.join(entry.getValue(), '\n')));
		}
		
		return AstUtil.makeAst(declarations);
	}

	public File getMain() {
		return main;
	}

}
