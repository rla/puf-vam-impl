package tr.fn.ast.list;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import tr.fn.ast.Declaration;
import tr.fn.ast.Expression;
import tr.fn.ast.Identifier;
import tr.fn.opt.AbsInterpretationContext;
import tr.fn.opt.NotAbsInterpretableException;
import tr.fn.opt.OptimizationContext;

public class HeadTailList extends Expression {
	public final Expression head;
	public final Expression tail;
	
	public HeadTailList(Expression head, Expression tail) {
		this.head = head;
		this.tail = tail;
	}
	
	public HeadTailList() {
		this(null, null);
	}
	
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public String toString() {
		if (isEmpty()) {
			return "[]";
		}
		return head.toString() + " : " + tail.toString();
	}

	@Override
	public Set<Identifier> getFreeVariables() {
		if (isEmpty()) {
			return new HashSet<Identifier>();
		}		
		Set<Identifier> free = new HashSet<Identifier>(tail.getFreeVariables());
		free.addAll(head.getFreeVariables());
		
		return free;
	}

	@Override
	public boolean isSimpleStrict() {
		return isEmpty() || head.isSimpleStrict() && tail.isSimpleStrict();
	}

	@Override
	public void markScopeExpression(Expression scopeExpression) {
		this.scopeExpression = scopeExpression;
		if (!isEmpty()){
		    head.markScopeExpression(scopeExpression);
		    tail.markScopeExpression(scopeExpression);			
		}

	}

	@Override
	public void collectDeclarations(List<Declaration> declarations) {
		if (!isEmpty()){
			head.collectDeclarations(declarations);
			tail.collectDeclarations(declarations);
		}
	}

	@Override
	public boolean absInterpretation(AbsInterpretationContext context) throws NotAbsInterpretableException {
		return isEmpty() || head.absInterpretation(context) && tail.absInterpretation(context);
	}

	@Override
	public boolean isAbsInterpretable(List<Identifier> localScope) {
		return isEmpty() || head.isAbsInterpretable(localScope) && tail.isAbsInterpretable(localScope);
	}

	@Override
	public void findApplicationDeclarations(List<Declaration> declarations) throws NotAbsInterpretableException {
		if (!isEmpty()) {
			head.findApplicationDeclarations(declarations);
			tail.findApplicationDeclarations(declarations);
		}
	}

	@Override
	public void markTailCall(boolean tail, int upperArgNum) {}

	@Override
	public void dumpTailCalls(OptimizationContext context) {}
	
}
