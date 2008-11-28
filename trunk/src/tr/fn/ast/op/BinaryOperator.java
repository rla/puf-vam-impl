package tr.fn.ast.op;

import java.util.Set;

import tr.fn.ast.Expression;
import tr.fn.ast.Identifier;
import tr.fn.grammar.FunParser;

public class BinaryOperator extends Expression {
	private final Expression left;
	private final Expression right;
	private final Type type;

	public BinaryOperator(int line, Expression left, Expression right, Type type) {
		super(line);
		this.left = left;
		this.right = right;
		this.type = type;
	}

	public Expression getLeft() {
		return left;
	}

	public Expression getRight() {
		return right;
	}
	
	public Type getType() {
		return type;
	}

	public enum Type {
		OR(FunParser.OR, "or"),
		AND(FunParser.AND, "and"),
		PLUS(FunParser.PLUS, "add"),
		MINUS(FunParser.MINUS, "sub"),
		STAR(FunParser.STAR, "mul"),
		SLASH(FunParser.SLASH, "div"),
		PERCENT(FunParser.PERCENT, "mod"),
		LESS(FunParser.LESS, "le"),
		GREATER(FunParser.GREATER, "ge"),
		EQUAL(FunParser.EQUAL, "eq"),
		GREATEREQUAL(FunParser.GREATEREQUAL, "geq"),
		LESSEQUAL(FunParser.LESSEQUAL, "leq"),
		NOTEQUAL(FunParser.NOTEQUAL, "neq");
		
		private final int id;
		private final String name;
		
		private Type(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}
		
		public String getName() {
			return name;
		}

		public static Type getType(int id) {
			for (Type type : values()) {
				if (type.id == id) {
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
	public String toString() {
		return "(+ " + left + " " + right+ ")";
	}

}
