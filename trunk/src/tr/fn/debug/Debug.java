package tr.fn.debug;

import java.util.Collection;

import tr.fn.ast.Expression;
import tr.fn.ast.Identifier;

public class Debug {
	
	public static void printFreeVariables(Expression e) {
		System.out.print("Free variables:");
		for (Identifier identifier : e.getFreeVariables()) {
			System.out.print(" ");
			System.out.print(identifier);
		}
		System.out.println();
	}
	
	public static String collectionToString(Collection<?> collection) {
		StringBuilder builder = new StringBuilder();
		builder.append('[');
		
		boolean first = true;
		for (Object e : collection) {
			if (first) {
				first = false;
			} else {
				builder.append(',');
			}
			builder.append(e);
		}
		
		builder.append(']');
		return builder.toString();
	}
}
