package tr.fn.opt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import tr.fn.ast.Declaration;
import tr.fn.ast.Identifier;
import tr.fn.ast.LetRec;

/**
 * Currently eliminates top-level declarations that are
 * certanly not used in the 'main' function.
 */
public class DeadCodeEliminator {
	private OptimizationContext context;
	
	public DeadCodeEliminator(OptimizationContext context) {
		this.context = context;
	}
	
	public void execute() throws OptimizationException {
		LetRec top = (LetRec) context.getProgram();
		
		if (context.isDebug()) {
			System.out.println("Dead code elimination:");
		}
		
		Declaration main = null;
		for (Declaration declaration : top.declarations) {
			if (declaration.name.name.equals(Declaration.MAIN_NAME)) {
				main = declaration;
				break;
			}
		}
		
		if (main == null) {
			throw new OptimizationException("Program is missing the main function");
		}
		
		// Find all used identifiers
		Set<Identifier> idsForMain = new HashSet<Identifier>();
		List<Declaration> current = new ArrayList<Declaration>();
		current.add(main);
		idsForMain.add(main.name);
		while (!current.isEmpty()) {
			List<Declaration> next = new ArrayList<Declaration>();
			for (Declaration decl : current) {
				Collection<Identifier> ids = decl.getFreeVariables();
				for (Declaration topDecl : top.declarations) {
					if (ids.contains(topDecl.name) && !idsForMain.contains(topDecl.name)) {
						next.add(topDecl);
						idsForMain.add(topDecl.name);
					}
				}
			}
			current = next;
		}
		
		if (context.isDebug()) {
			System.out.println("  Main uses: " + idsForMain);
		}
		
		List<Declaration> keepDeclarations = new ArrayList<Declaration>();
		
		// Remove those from top letrec that are certanly not used
		for (Declaration declaration : top.declarations) {
			if (idsForMain.contains(declaration.name)) {
				// This one might be used, keep into the program
				keepDeclarations.add(declaration);
			}
		}
		
		context.setProgram(new LetRec(keepDeclarations, top.inExpression));
	}

}
