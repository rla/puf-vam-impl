package tr.fn.ast;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class LetBase extends Expression {
	public final List<Declaration> declarations;
	public final Expression inExpression;
	
	public LetBase(List<Declaration> declarations, Expression inExpression) {
		this.declarations = declarations;
		this.inExpression = inExpression;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(getTypeName());
		for (Declaration declaration : declarations) {
			builder.append(' ').append(declaration).append(';');
		}
		
		builder.append(" in ").append(inExpression);
		
		return builder.toString();
	}
	
	protected abstract String getTypeName();
	
	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> nonFree = new HashSet<Identifier>();
		Set<Identifier> free = new HashSet<Identifier>(inExpression.getFreeVariables());
		
		for (Declaration declaration : declarations) {
			if (declaration instanceof Declaration) {
				nonFree.add(((Declaration) declaration).name);
			}
			
			free.addAll(declaration.expression.getFreeVariables());
		}
		
		free.removeAll(nonFree);
		
		return free;
	}

	@Override
	public boolean isSimpleStrict() {
		return false;
	}

	@Override
	public void markEnclosingLambda(Lambda lambda) {
		setEnclosingLambda(lambda);
		for (Declaration declaration : declarations) {
			declaration.markEnclosingLambda(lambda);
		}
		inExpression.markEnclosingLambda(lambda);
	}

	@Override
	public void markEnclosingLet(LetBase let) {
		setEnclosingLet(let);
		for (Declaration declaration : declarations) {
			declaration.markEnclosingLet(this);
		}
		inExpression.markEnclosingLet(this);
	}
	
}
