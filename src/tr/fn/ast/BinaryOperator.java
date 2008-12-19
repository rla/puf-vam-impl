package tr.fn.ast;

import java.util.List;
import java.util.Map;
import java.util.Set;

import tr.fn.opt.InterpretationContext;
import tr.fn.opt.NotAbsInterpretableException;

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
	public void markScopeExpression(Expression scopeExpression) {
		this.scopeExpression = scopeExpression;
		left.markScopeExpression(scopeExpression);
		right.markScopeExpression(scopeExpression);
	}

	@Override
	public void collectDeclarations(List<Declaration> declarations) {
		left.collectDeclarations(declarations);
		right.collectDeclarations(declarations);
	}

	@Override
	public boolean interpretation(Map<Identifier, Boolean> localScope, InterpretationContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInterpretable(List<Identifier> localScope) {
		return left.isInterpretable(localScope) && right.isInterpretable(localScope);
	}

	@Override
	public void findApplicationDeclarations(List<Declaration> declarations) throws NotAbsInterpretableException {
		left.findApplicationDeclarations(declarations);
		right.findApplicationDeclarations(declarations);
	}
	
	
	
}
