package tr.fn.opt;


public class StrictnessAnalysis {
	private OptimizationContext context;

	public StrictnessAnalysis(OptimizationContext context) {
		this.context = context;
	}
	
	/*
	public void execute() throws OptimizationException {
		if (context.isDebug()) {
			System.out.println("Strictness analysis:");
		}
		Map<Expression, StrictnessInfo> strictness = new IdentityHashMap<Expression, StrictnessInfo>();
		
		// For each function declaration, construct the initial strictness info.
		//context.getProgram().constructInitialStrictness(strictness);
		
		// FIXME remove functions with more than 10 arguments?
		
		if (context.isDebug()) {
			debugExpressions(strictness);
		}
		
		// Do the fixpoint calculation as stated on the slides.
		boolean changed = true;
		int round = 0;
		while (changed) {
			System.out.println("  Round: " + round);
			changed = false;
			for (Entry<Expression, StrictnessInfo> entry : new IdentityHashMap<Expression, StrictnessInfo>(strictness).entrySet()) {
				Declaration declaration = (Declaration) entry.getKey();
				Lambda lambda = (Lambda) declaration.getExpression();
				Expression definition = lambda.getExpression();
				BooleanVectorGenerator generator = new BooleanVectorGenerator(lambda.getArguments().size());
				
				Map<Identifier, Boolean> arguments = new HashMap<Identifier, Boolean>();
				
				// Do the abstract interpretation of the definition on the given boolean arguments.
				while (generator.hasNext()) {
					boolean[] vector = generator.next();
					
					int i = 0;
					for (Identifier arg : lambda.getArguments()) {
						arguments.put(arg, vector[i]);
						i++;
					}
					
					System.out.println("    " + Debug.mapToString(arguments));
					try {
						boolean result = interpretation(definition, strictness, arguments);
						System.out.println("    Result: " + result);
						StrictnessInfo info = strictness.get(entry.getKey());
						if (info.resultWithArguments(vector) != result) {
							changed = true;
							if (result) {
								info.getBooleanTable().assertTrue(vector);
							} else {
								info.getBooleanTable().assertFalse(vector);
							}
						}
					} catch (NoInformationException e) {
						if (context.isDebug()) {
							System.out.println("    Our strictness analysis fails on " + e.getExpression());
						}
						// FIXME Remove from the set of known expressions.
						changed = true;
					}
				}
			}
			round++;
		}
		
	}
	
	private boolean interpretation(
		Expression expression,
		Map<Expression, StrictnessInfo> strictness,
		Map<Identifier, Boolean> arguments) throws NoInformationException, OptimizationException {
		
		if (expression instanceof IfThenElse) {
			IfThenElse ifThenElse = (IfThenElse) expression;
			boolean condResult = interpretation(ifThenElse.getCondition(), strictness, arguments);
			boolean thenResult = interpretation(ifThenElse.getThenExpression(), strictness, arguments);
			boolean elseResult = interpretation(ifThenElse.getElseExpression(), strictness, arguments);
			return condResult && (thenResult || elseResult);
		} else if (expression instanceof Integer) {
			return true;
		} else if (expression instanceof Identifier) {
			if (arguments.containsKey(expression)) {
				// One of the function arguments.
				return arguments.get(expression);
			} else {
				throw new RuntimeException("I do not know what is " + expression);
			}
		} else if (expression instanceof BinaryOperator) {
			BinaryOperator operator = (BinaryOperator) expression;
			boolean leftResult = interpretation(operator.getLeft(), strictness, arguments);
			boolean rightResult = interpretation(operator.getRight(), strictness, arguments);
			return leftResult && rightResult;
		} else if (expression instanceof Application) {
			Application application = (Application) expression;
			if (!(application.getFExpression() instanceof Identifier)) {
				// Function expression is lambda or something else.
				// That's too complex case to handle here.
				throw new NoInformationException(application);
			}
			Identifier name = (Identifier) application.getFExpression();
			// Now find the correct declaration of the function using the
			// scoping rules.
			Declaration declaration = null;
			// 1. Is lambda argument
			if (arguments.containsKey(name)) {
				// Current function is higher order, do not know
				// what to do.
				throw new NoInformationException(application);
			}
			// 2. Is defined in enclosing let expression
			outer: while (true) {
				if (application.getEnclosingLet() == null) {
					throw new OptimizationException("Identifier " + name + " in " + application + " is unknown");
				}
				LetBase let = application.getEnclosingLet();
				// Look for declaration FIXME in reveser order? Have to consider the location of current expression as well?
				for (Declaration decl : let.getDeclarations()) {
					if (decl.getName().equals(name)) {
						declaration = decl;
						break outer;
					}
				}
				
				if (let.getEnclosingLet() == null) {
					// Cannot find the declaration
					throw new NoInformationException(application);
				}
				let = let.getEnclosingLet();
			}
			
			// FIXME must order enclosing lambda and let correctly (no idea how to do it) 
			
			// Check for the value in the current fixpoint calculation.
			if (strictness.containsKey(declaration)) {
				// Calculate arguments
				// FIXME check if arguments count matches
				boolean[] args = new boolean[application.getArguments().size()];
				int i = 0;
				for (Expression arg : application.getArguments()) {
					args[i] = interpretation(arg, strictness, arguments);
					i++;
				}
				StrictnessInfo info = strictness.get(declaration);
				return info.resultWithArguments(args);
			} else {
				throw new NoInformationException(application);
			}
		} else {
			throw new RuntimeException("Cannot interpret " + expression.getClass());
		}
	}
	
	private void debugExpressions(Map<Expression, StrictnessInfo> strictness) {
		System.out.println("  Considering declarations:");
		for (Expression expression : strictness.keySet()) {
			Declaration declaration = (Declaration) expression;
			Lambda lambda = (Lambda) declaration.getExpression();
			System.out.println("    " + declaration.getName() + " " + Debug.collectionToString(lambda.getArguments()));
		}
	}
	
	private static class NoInformationException extends Exception {
		private static final long serialVersionUID = 1L;
		
		private Expression expression;

		public NoInformationException(Expression expression) {
			this.expression = expression;
		}

		public Expression getExpression() {
			return expression;
		}
		
	}
	*/
}
