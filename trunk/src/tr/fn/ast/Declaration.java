package tr.fn.ast;

import java.util.Set;

public class Declaration extends Expression {
	public static final String MAIN_NAME = "main";
	
	public final Expression expression;
	public final Identifier name;
	
	public Declaration(Identifier name, Expression expression) {
		this.expression = expression;
		this.name = name;
	}

	@Override
	public String toString() {
		return name + " = " + expression;
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		return expression.getFreeVariables();
	}

	@Override
	public boolean isSimpleStrict() {
		return false;
	}

	@Override
	public void markEnclosingLambda(Lambda lambda) {
		setEnclosingLambda(lambda);
		expression.markEnclosingLambda(lambda);
	}

	@Override
	public void markEnclosingLet(LetBase let) {
		setEnclosingLet(let);
		expression.markEnclosingLet(let);
	}

}