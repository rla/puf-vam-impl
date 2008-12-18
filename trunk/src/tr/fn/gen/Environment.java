package tr.fn.gen;

import java.util.HashMap;
import java.util.Map;

import tr.fn.ast.Identifier;

/**
 * Tracks variables during code generation.
 */
public class Environment {
	private final Environment parent;
	private final Map<Identifier, Variable> variables;
	
	public Environment(Environment parent) {
		this.parent = parent;
		this.variables = new HashMap<Identifier, Variable>();
	}
	
	public Environment() {
		this(null);
	}
	
	public void addVariable(Variable variable) {
		variables.put(variable.getIdentifier(), variable);
	}
	
	public Variable getVariable(Identifier identifier) {
		return variables.get(identifier);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Variable variable : variables.values()) {
			builder.append(variable.getIdentifier() + " -> (" + (variable.isLocal() ? "L" : "G") + "," + variable.getId() + ")\n");
		}
		return builder.toString();
	}

	public Environment getParent() {
		return parent;
	}
	
	/**
	 * Returns the copy of this environment. The added
	 * variables will not appear in the original environment.
	 */
	public Environment getCopy() {
		Environment environment = new Environment(parent);
		
		for (Variable variable : variables.values()) {
			environment.addVariable(variable);
		}
		
		return environment;
	}
	
}
