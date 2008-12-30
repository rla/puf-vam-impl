package tr.fn.ast;

import java.util.List;
import java.util.Set;

import tr.fn.opt.AbsInterpretationContext;
import tr.fn.opt.NotAbsInterpretableException;
import tr.fn.opt.OptimizationContext;

public abstract class Expression {
	public Expression scopeExpression;

	/**
	 * Traverses the expressions recursively and marks expressions
	 * that are origins of identifiers. An origin can be either
	 * letbase, tuplelet, calt or lambda.
	 */
	public abstract void markScopeExpression(Expression scopeExpression);

	/**
	 * Get the free variables of this expression.
	 */
	public abstract Set<Identifier> getFreeVariables();
	
	/**
	 * Retuns true if the expression can used in strict context.
	 */
	public abstract boolean isSimpleStrict();
	
	/**
	 * Collects the declarations occurred in the expression.
	 */
	public abstract void collectDeclarations(List<Declaration> declarations);
	
	/**
	 * Returns true if the expression can be used in abstract
	 * interpretation. It can be used if it does not contain
	 * higher order function calls. This is just necessary
	 * condition but not sufficient.
	 */
	public abstract boolean isInterpretable(List<Identifier> localScope);
	
	/**
	 * Runs the abstract interpretation of this expression
	 * as it appeared in the function whose arguments are
	 * stored in localScope.
	 */
	public abstract boolean interpretation(AbsInterpretationContext context) throws NotAbsInterpretableException;

	/**
	 * Returns the list of declarations that are used in function
	 * applications of this expression.
	 * 
	 * @throws NotAbsInterpretableException if the expression is not meant for the abstract interpretation.
	 */
	public abstract void findApplicationDeclarations(List<Declaration> declarations) throws NotAbsInterpretableException;
	
	/**
	 * Traverses the expression tree and marks tail-recursive calls.
	 * TODO currently it does not consider "case of" and list expressions.
	 * By default, all function applications are marked non-tail-recursive.
	 */
	public abstract void markTailCall(boolean tail);
	
	/**
	 * Outputs debug information about tail calls.
	 */
	public abstract void dumpTailCalls(OptimizationContext context);
	
}
