package tr.fn.ast;

import java.util.List;

public class Let extends LetBase {

	public Let(List<Declaration> declarations, Expression inExpression) {
		super(declarations, inExpression);
	}

	@Override
	protected String getTypeName() {
		return "let";
	}

}
