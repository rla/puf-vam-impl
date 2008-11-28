package tr.fn.ast;

import java.util.List;

public class LetRec extends LetBase {

	public LetRec(int line, List<Declaration> declarations, Expression inExpression) {
		super(line, declarations, inExpression);
	}

}
