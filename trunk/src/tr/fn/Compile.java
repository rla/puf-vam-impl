package tr.fn;

import java.io.File;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import tr.fn.ast.LetRec;
import tr.fn.gen.CodeV;
import tr.fn.gen.Environment;
import tr.fn.gen.GenerationContext;
import tr.fn.gen.instr.Halt;
import tr.fn.opt.DeadCodeEliminator;
import tr.fn.opt.OptimizationContext;
import tr.fn.opt.StrictnessAnalysis;
import tr.fn.opt.TailCallFinder;
import tr.fn.post.PostprocessContext;
import tr.fn.post.SpaghettiRemover;
import tr.fn.pre.IncludePreprocessor;
import tr.fn.pre.PreprocessContext;

/**
 * Main class for the compiler.
 */
public class Compile {
	
	public static void main(String[] args) throws Exception {
		CommandLineParser parser = new GnuParser();
		Options options = new CompileOptions();
		CommandLine command = null;
		try {
			command = parser.parse(options, args);
		} catch (ParseException e) {
			printHelp(options);
			return;
		}
		
		if (!command.hasOption(CompileOptions.OPTION_IN) || !command.hasOption(CompileOptions.OPTION_OUT)) {
			printHelp(options);
			return;
		}
		
		File inputFile = new File(options.getOption(CompileOptions.OPTION_IN).getValue());
		File outputFile = new File(options.getOption(CompileOptions.OPTION_OUT).getValue());
		
		compile(
			inputFile,
			outputFile,
			command.hasOption(CompileOptions.OPTION_DEBUG),
			command.hasOption(CompileOptions.OPTION_DEBUG_INSTR),
			command.hasOption(CompileOptions.OPTION_DEADCODE),
			command.hasOption(CompileOptions.OPTION_STRICTNESS),
			command.hasOption(CompileOptions.OPTION_NOSPAGHETTI),
			command.hasOption(CompileOptions.OPTION_TAILCALLS)
		);
	}
	
	public static void compile(
		File inputFile,
		File outputFile,
		boolean debug,
		boolean debugInstr,
		boolean nodead,
		boolean strictness,
		boolean noSphagetti,
		boolean tailcalls) throws Exception {
		
		// Executing "#include"
		PreprocessContext preprocessContext = new PreprocessContext(inputFile, debug);
		new IncludePreprocessor(preprocessContext).execute();
		
		// Ast after preprocessing
		LetRec program = preprocessContext.getAstAfterPreprocessing();
		
		program.markScopeExpression(null);
		
		// Optimizations
		OptimizationContext optimizationContext = new OptimizationContext(program, debug);
		if (nodead) {
			new DeadCodeEliminator(optimizationContext).execute();
		}
		
		if (strictness) {
			new StrictnessAnalysis(optimizationContext).execute();
		}
		
		if (tailcalls) {
			new TailCallFinder(optimizationContext).execute();
		}
		
		// Generate output code
		GenerationContext generationContext = new GenerationContext();
		
		generationContext.setDebug(debug);
		generationContext.setDebugInstr(debugInstr);
		generationContext.setTryToEliminateClosures(strictness);
		generationContext.setStrictness(optimizationContext.getStrictnessInfo());
		generationContext.setTailcalls(tailcalls);
		
		CodeV.codeV(new Environment(null), generationContext, optimizationContext.getProgram(), 0);
		generationContext.addInstruction(new Halt());
		
		PostprocessContext postProcessContext = new PostprocessContext(generationContext.getInstructions());
		if (noSphagetti) {
			new SpaghettiRemover(postProcessContext).execute();
		}
		
		// Save it to file
		postProcessContext.saveToFile(outputFile);
	}
	
	private static void printHelp(Options options) {
		HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp("puf-compile", options);
	}
	
	private static class CompileOptions extends Options {
		public static final String OPTION_IN = "in";
		public static final String OPTION_OUT = "out";
		public static final String OPTION_DEBUG = "debug";
		public static final String OPTION_DEBUG_INSTR = "debuginstr";
		public static final String OPTION_DEADCODE = "nodead";
		public static final String OPTION_STRICTNESS = "strictness";
		public static final String OPTION_NOSPAGHETTI = "nospaghetti";
		public static final String OPTION_TAILCALLS = "tailcalls";
		
		public CompileOptions() {
			addOption(OPTION_IN, true, "Input file for the PuF code");
			addOption(OPTION_OUT, true, "Output file");
			addOption(OPTION_DEBUG, false, "If present, debug info is written to the output");
			addOption(OPTION_DEBUG_INSTR, false, "If present, more verbose debug info is written to the output");
			addOption(OPTION_DEADCODE, false, "If present, tries to eliminate unused declarations");
			addOption(OPTION_STRICTNESS, false, "If present, runs strictness analysis and tries to remove unneeded closures");
			addOption(OPTION_NOSPAGHETTI, false, "If present, mama will eat no spaghetti");
			addOption(OPTION_TAILCALLS, false, "If present, special code will be generated for tail calls");
		}
	}
}
