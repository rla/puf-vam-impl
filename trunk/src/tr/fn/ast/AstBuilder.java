package tr.fn.ast;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.Tree;
import org.apache.commons.lang.ArrayUtils;

import tr.fn.ast.op.BinaryOperator;
import tr.fn.ast.op.BinaryOperator.Type;
import tr.fn.grammar.FunParser;

public class AstBuilder {
	private int[] binaryOperators;
	private boolean forceSingleArgumentFunctions = false;
	
	public AstBuilder() {
		binaryOperators = new int[Type.values().length];
		int i = 0;
		for (Type type : Type.values()) {
			binaryOperators[i++] = type.getId();
		}
	}
	
	public LetRec buildProgram(Tree tree) {
		List<Tree> declarations = new ArrayList<Tree>();
		
		if (tree.getType() == FunParser.DEFINE) {
			declarations.add(tree);
		} else {
			for (int i = 0; i < tree.getChildCount(); i++) {
				Tree child = tree.getChild(i);
				if (child.getType() == FunParser.EOF) {
					break;
				}
				declarations.add(child);
			}
		}
		
		// Write the whole program as a single letrec expression.
		Expression inExpression = new Identifier(0, "main");
		List<Declaration> declarationExpressions = new ArrayList<Declaration>();
		for (Tree declaration : declarations) {
			declarationExpressions.add((Declaration) buildExpression(declaration));
		}
		
		return new LetRec(0, declarationExpressions, inExpression);
	}
	
	private Expression buildExpression(Tree tree) {
		switch (tree.getType()) {
		case FunParser.DEFINE: 
			List<Identifier> arguments = new ArrayList<Identifier>();
			for (int i = 2; i < tree.getChildCount(); i++) {
				Tree argument = tree.getChild(i);
				arguments.add(new Identifier(argument.getLine(), argument.getText()));
			}
			
			Expression expression = null;
			if (arguments.isEmpty()) {
				// Constant expression
				expression = buildExpression(tree.getChild(1));
			} else {
				// Lambda expression
				expression = new Lambda(tree.getLine(), arguments, buildExpression(tree.getChild(1)));
			}
			
			return new Declaration(tree.getLine(), new Identifier(tree.getChild(0).getLine(), tree.getChild(0).getText()), expression);
		case FunParser.LETREC: 
			Expression inExpression = buildExpression(tree.getChild(0));
			List<Declaration> declarations = new ArrayList<Declaration>();
			for (int i = 1; i < tree.getChildCount(); i++) {
				declarations.add((Declaration) buildExpression(tree));
			}
			return new LetRec(tree.getLine(), declarations, inExpression);
		case FunParser.ID:
			return new Identifier(tree.getLine(), tree.getText());
		case FunParser.INT:
			return new Integer(tree.getLine(), java.lang.Integer.valueOf(tree.getText()));
		case FunParser.LAMBDA:
			List<Identifier> arguments1 = new ArrayList<Identifier>();
			for (int i = 1; i < tree.getChildCount(); i++) {
				Tree argument = tree.getChild(i);
				arguments1.add(new Identifier(argument.getLine(), argument.getText()));
			}
			Expression expression1 = buildExpression(tree.getChild(0));
			return new Lambda(tree.getLine(), arguments1, expression1);
		case FunParser.APP:		
			return buildApplication(tree);
		default:
			if (isIfThenElse(tree)) {
				return buildIfThenElse(tree);
			} else if (isBinaryOperator(tree)) {
				Expression left = buildExpression(tree.getChild(0));
				Expression right = buildExpression(tree.getChild(1));
				return new BinaryOperator(tree.getLine(), left, right, Type.getType(tree.getType()));
			} else {
				throw new IllegalArgumentException("Unknown expression type: " + tree.getType());
			}
		}
	}
	
	private Expression buildIfThenElse(Tree tree) {
		return new IfThenElse(tree.getLine(), buildExpression(tree.getChild(0)), buildExpression(tree.getChild(1)), buildExpression(tree.getChild(2)));
	}

	private Expression buildApplication(Tree tree) {
		if (forceSingleArgumentFunctions) {
			return rewriteApp(tree, tree.getChildCount() - 1);
		} else {
			Expression fExpression = buildExpression(tree.getChild(0));
			List<Expression> arguments = new ArrayList<Expression>();
			for (int i = 1; i < tree.getChildCount(); i++) {
				arguments.add(buildExpression(tree.getChild(i)));
			}
			return new Application(tree.getLine(), fExpression, arguments);
		}		
	}
	
	private Application rewriteApp(Tree tree, int i) {
		List<Expression> arguments = new ArrayList<Expression>();
		arguments.add(buildExpression(tree.getChild(i)));
		
		if (i <= 1) {
			return new Application(tree.getLine(), buildExpression(tree.getChild(0)), arguments);
		} else {
			return new Application(tree.getLine(), rewriteApp(tree, i - 1), arguments);
		}
	}
	
	private boolean isIfThenElse(Tree tree) {
		return FunParser.IF == tree.getType();
	}
	
	private boolean isBinaryOperator(Tree tree) {
		return ArrayUtils.contains(binaryOperators, tree.getType());
	}
	
	/**
	 * When set true then function application (f 1 2 3) gets
	 * rewritten to (((f 1) 2) 3).
	 */
	public void setForceSingleArgumentFunctions(boolean forceSingleArgumentFunctions) {
		this.forceSingleArgumentFunctions = forceSingleArgumentFunctions;
	}
	
}
