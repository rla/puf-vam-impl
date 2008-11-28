package tr.fn.ast;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * (letrec inExpression declarations)
 */
public class LetRec extends Expression {
	private final List<Declaration> declarations;
	private final Expression inExpression;
	
	public LetRec(int line, List<Declaration> declarations, Expression inExpression) {
		super(line);
		this.declarations = declarations;
		this.inExpression = inExpression;
	}

	public List<Declaration> getDeclarations() {
		return declarations;
	}

	public Expression getInExpression() {
		return inExpression;
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> nonFree = new HashSet<Identifier>();
		Set<Identifier> free = new HashSet<Identifier>(inExpression.getFreeVariables());
		
		for (Declaration declaration : declarations) {
			nonFree.add(declaration.getName());
			free.addAll(declaration.getExpression().getFreeVariables());
		}
		
		free.removeAll(nonFree);
		
		return free;
	}

	@Override
	public Set<Identifier> getIdentifiers() {
		Set<Identifier> identifiers = new HashSet<Identifier>(inExpression.getIdentifiers());
		
		for (Declaration declaration : declarations) {
			identifiers.addAll(declaration.getExpression().getIdentifiers());
		}
		
		return identifiers;
	}

}
