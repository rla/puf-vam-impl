package tr.fn.ast;

import java.util.List;

public class Let extends LetBase {

	public Let(int line, List<Declaration> declarations, Expression inExpression) {
		super(line, declarations, inExpression);
	}

}
