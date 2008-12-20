package tr.fn.opt.util;

import java.util.ArrayList;
import java.util.List;

import tr.fn.ast.Declaration;
import tr.fn.ast.LetRec;
import tr.fn.opt.NotAbsInterpretableException;

public class AbsInterpretationUtil {

	/**
	 * Finds the declarations of the program for which the
	 * abstract interpretation will be run.
	 */
	public static List<Declaration> findInterpretableDeclarations(LetRec program) {
		
		// Collect all declarations first.
		
		List<Declaration> declarations = new ArrayList<Declaration>();
		program.collectDeclarations(declarations);
		
		// Filter out declarations which can be used for direct
		// interpretation (without considering interpretability
		// of the declarations that the expressions in current one
		// use in function applications).
		
		declarations = filterDirectInterpretableDeclarations(declarations);
		
		// Find maximal subset S of declarations so that
		// for each s in S: D = a(s), each d in D is also in S.
		// a(s) - set of function declarations used in function
		// aplications in s.
		
		int n = declarations.size();
		while (true) {
			filterFullyInterpretableDeclarations(declarations);
			if (declarations.size() == n) {
				break;
			}
			// Run fixpoint over size of S.
			n = declarations.size();
		}
		
		return declarations;
	}
	
	private static List<Declaration> filterDirectInterpretableDeclarations(List<Declaration> declarations) {
		List<Declaration> ret = new ArrayList<Declaration>();
		
		for (Declaration declaration : declarations) {
			if (declaration.definesInterpretable()) {
				ret.add(declaration);
			}
		}
		
		return ret;
	}
	
	private static void filterFullyInterpretableDeclarations(List<Declaration> declarations) {
		List<Declaration> badList = new ArrayList<Declaration>();
		
		for (Declaration declaration : declarations) {
			List<Declaration> used = new ArrayList<Declaration>();
			try {
				declaration.findApplicationDeclarations(used);
			} catch (NotAbsInterpretableException e) {
				badList.add(declaration);
			}
			for (Declaration usedDecl : used) {
				if (!declarations.contains(usedDecl)) {
					badList.add(declaration);
				}
			}
		}
		
		declarations.removeAll(badList);
	}
}
