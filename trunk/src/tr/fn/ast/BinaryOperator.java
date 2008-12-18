package tr.fn.ast;

import java.util.Set;

public class BinaryOperator extends Expression {
	public final Type type;
	public final Expression left;
	public final Expression right;
	
	public BinaryOperator(Type type, Expression left, Expression right) {
		this.type = type;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "(" + left + " " + type.symbol + " " + right + ")";
	}

	public enum Type {
		OR("or", "||"),
		AND("and", "&&"),
		PLUS("add", "+"),
		MINUS("sub", "-"),
		STAR("mul", "*"),
		SLASH("div", "/"),
		PERCENT("mod", "%"),
		LESS("le", "<"),
		GREATER("ge", ">"),
		EQUAL("eq", "=="),
		GREATEREQUAL("geq", ">="),
		LESSEQUAL("leq", "<="),
		NOTEQUAL("neq", "/=");
		
		private final String name;
		private final String symbol;
		
		private Type(String name, String symbol) {
			this.name = name;
			this.symbol = symbol;
		}
		
		public String getName() {
			return name;
		}
		
		public static Type getType(String symbol) {
			for (Type type : values()) {
				if (type.symbol.equals(symbol)) {
					return type;
				}
			}
			
			return null;
		}
		
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		Set<Identifier> free = left.getFreeVariables();
		free.addAll(right.getFreeVariables());
		
		return free;
	}

	@Override
	public boolean isSimpleStrict() {
		return left.isSimpleStrict() && right.isSimpleStrict();
	}

	@Override
	public void markEnclosingLambda(Lambda lambda) {
		setEnclosingLambda(lambda);
		left.markEnclosingLambda(lambda);
		right.markEnclosingLambda(lambda);
	}

	@Override
	public void markEnclosingLet(LetBase let) {
		setEnclosingLet(let);
		left.markEnclosingLet(let);
		right.markEnclosingLet(let);
	}
	
}
