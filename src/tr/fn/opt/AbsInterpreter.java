package tr.fn.opt;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import tr.fn.ast.Declaration;
import tr.fn.ast.Identifier;
import tr.fn.ast.LetRec;
import tr.fn.opt.util.AbsInterpretationUtil;

public class AbsInterpreter {
	private LetRec program;
	private boolean debug;
	
	public AbsInterpreter(LetRec program, boolean debug) {
		this.program = program;
		this.debug = debug;
	}
	
	public Map<Declaration, BooleanTable> run() throws AbsInterpretationFailedException {
		
		List<Declaration> declarations = AbsInterpretationUtil.findInterpretableDeclarations(program);
		if (debug) {
			System.out.println("List of interpretable declarations : " + declarations);
		}
		
		Map<Declaration, BooleanTable> current = initializeInfo(declarations);
		Map<Declaration, BooleanTable> next = initializeInfo(declarations);
		
		boolean changed = true;
		boolean hitsLimit = false;
		int counter = 0;
		int roundLimit = 10000;
		while (changed) {
			if (counter > roundLimit) {
				hitsLimit = true;
				break;
			}
			if (debug) {
				System.out.println("Round " + counter);
			}
			try {
				changed = round(declarations, current, next);
			} catch (NotAbsInterpretableException e) {
				if (debug) {
					System.out.println("Interpretation of " + e + " failed");
				}
				throw new AbsInterpretationFailedException();
			}
			current = next;
			if (!changed) {
				break;
			}
			next = initializeInfo(declarations);
			
			counter++;
		}
		
		if (hitsLimit) {
			if (debug) {
				System.out.println("Abstract interpretation failed");
			}
			throw new AbsInterpretationFailedException();
		}
		
		return current;
	}
	
	private boolean round(List<Declaration> declarations, Map<Declaration, BooleanTable> current, Map<Declaration, BooleanTable> next) throws NotAbsInterpretableException {
		boolean changed = false;
		for (Declaration declaration : declarations) {
			BooleanVectorGenerator generator = new BooleanVectorGenerator(declaration.getNumberOfArguments());
			while (generator.hasNext()) {
				boolean[] argumentValues = generator.next();
				AbsInterpretationContext context = new AbsInterpretationContext(makeLocalScope(declaration, argumentValues),current);
				boolean oldResult = current.get(declaration).isTrue(argumentValues);
				boolean newResult = run(declaration, context);
				if (oldResult != newResult) {
					changed = true;
				}
				next.get(declaration).assertValue(argumentValues, newResult);
			}
		}
		
		return changed;
	}

	private boolean run(Declaration declaration, AbsInterpretationContext context) throws NotAbsInterpretableException {
		boolean result = declaration.interpretation(context);
		if (debug) {
			System.out.println("Int. " + context + " [" + declaration + "]" + " => " + result);
		}
		
		return result;
	}
	
	private static Map<Declaration, BooleanTable> initializeInfo(List<Declaration> declarations) {
		Map<Declaration, BooleanTable> next = new IdentityHashMap<Declaration, BooleanTable>();
		for (Declaration declaration : declarations) {
			next.put(declaration, new BooleanTable(declaration.getNumberOfArguments()));
		}
		
		return next;
	}
	
	private static Map<Identifier, Boolean> makeLocalScope(Declaration declaration, boolean[] argumentValues) {
		Map<Identifier, Boolean> localScope = new HashMap<Identifier, Boolean>();
		
		int i = 0;
		for (Identifier arg : declaration.getArguments()) {
			localScope.put(arg, argumentValues[i]);
			i++;
		}
		
		return localScope;
	}
}
