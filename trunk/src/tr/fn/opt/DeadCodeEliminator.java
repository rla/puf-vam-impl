package tr.fn.opt;

import java.util.ArrayList;
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
	
	// TODO currently uses very primitive algorithm, does not remove all dead code.
	public void execute() throws OptimizationException {
		LetRec top = (LetRec) context.getProgram();
		
		Declaration main = null;
		for (Declaration declaration : top.getDeclarations()) {
			if (declaration.getName().getName().equals(Declaration.MAIN_NAME)) {
				main = declaration;
				break;
			}
		}
		
		if (main == null) {
			throw new OptimizationException("Program is missing main function");
		}
		
		// Find all used identifiers
		Set<Identifier> idsInMain = main.getExpression().getIdentifiers();
		
		List<Declaration> keepDeclarations = new ArrayList<Declaration>();
		
		// Remove those from top letrec that are certanly not used
		for (Declaration declaration : top.getDeclarations()) {
			if (declaration.getName().getName().equals(Declaration.MAIN_NAME)) {
				// We certanly need main
				keepDeclarations.add(declaration);
				continue;
			}
			
			if (idsInMain.contains(declaration.getName())) {
				// This one might be used, keep into the program
				keepDeclarations.add(declaration);
			}
		}
		
		context.setProgram(new LetRec(top.getLine(), keepDeclarations, top.getInExpression()));
	}
}
