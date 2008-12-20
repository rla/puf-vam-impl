package tr.fn.opt;

import java.util.Map;

import tr.fn.ast.Declaration;
import tr.fn.ast.Identifier;

public class AbsInterpretationContext {
	public final Map<Identifier, Boolean> localScope;
	public final Map<Declaration, BooleanTable> current;
	
	public AbsInterpretationContext(Map<Identifier, Boolean> localScope, Map<Declaration, BooleanTable> current) {
		this.localScope = localScope;
		this.current = current;
	}

	public boolean check(Declaration declaration, boolean[] argumentValues) {
		if (declaration == null) {
			throw new IllegalArgumentException("Declaration cannot be null");
		}
		BooleanTable table = current.get(declaration);
		if (table == null) {
			throw new IllegalArgumentException("Declaration " + declaration + " does not take part of abstract interpretation");
		}
		
		return table.isTrue(argumentValues);
	}
	
	public boolean checkArg(Identifier arg) {
		if (!localScope.containsKey(arg)) {
			throw new IllegalArgumentException("Argument " + arg + " cannot be found in local scope");
		}
		
		return localScope.get(arg);
	}

	@Override
	public String toString() {
		return localScope.toString();
	}
	
}
