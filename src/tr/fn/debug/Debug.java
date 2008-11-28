package tr.fn.debug;

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
}
