package tr.fn.ast;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tuple extends Expression {
	public final List<? extends Expression> arguments;

	public Tuple(List<? extends Expression> arguments) {
		this.arguments = arguments;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append('(');
		boolean first = true;
		for (Expression arg : arguments) {
			if (first) {
				first = false;
			} else {
				builder.append(',');
			}
			builder.append(arg);
		}
		builder.append(')');
		
		return builder.toString();
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> free = new HashSet<Identifier>();
		
		for (Expression argument : arguments) {
			free.addAll(argument.getFreeVariables());
		}
		
		return free;
	}

	@Override
	public boolean isSimpleStrict() {
		for (Expression argument : arguments) {
			if (!argument.isSimpleStrict()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void markEnclosingLambda(Lambda lambda) {
		setEnclosingLambda(lambda);
		for (Expression argument : arguments) {
			argument.markEnclosingLambda(lambda);
		}
	}

	@Override
	public void markEnclosingLet(LetBase let) {
		setEnclosingLet(let);
		for (Expression argument : arguments) {
			argument.markEnclosingLet(let);
		}
	}
	
}
