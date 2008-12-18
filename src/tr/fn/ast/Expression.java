package tr.fn.ast;

import java.util.Set;

public abstract class Expression {
	private LetBase enclosingLet;
	private Lambda enclosingLambda;

	public LetBase getEnclosingLet() {
		return enclosingLet;
	}

	public void setEnclosingLet(LetBase enclosingLet) {
		this.enclosingLet = enclosingLet;
	}

	public Lambda getEnclosingLambda() {
		return enclosingLambda;
	}

	public void setEnclosingLambda(Lambda enclosingLambda) {
		this.enclosingLambda = enclosingLambda;
	}
	
	/**
	 * Get the free variables of this expression.
	 */
	public abstract Set<Identifier> getFreeVariables();
	
	/**
	 * Retuns true if the expression can used in strict context.
	 */
	public abstract boolean isSimpleStrict();
	
	public abstract void markEnclosingLet(LetBase let);
	
	public abstract void markEnclosingLambda(Lambda lambda);

}
