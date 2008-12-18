package tr.fn.ast;

import java.util.List;

public class LetRec extends LetBase {

	public LetRec(List<Declaration> declarations, Expression inExpression) {
		super(declarations, inExpression);
	}

	@Override
	protected String getTypeName() {
		return "letrec";
	}

}
