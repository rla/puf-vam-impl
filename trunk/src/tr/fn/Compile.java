package tr.fn;

import java.io.File;
import java.io.IOException;

import org.antlr.runtime.tree.Tree;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import tr.fn.ast.AstBuilder;
import tr.fn.ast.LetRec;
import tr.fn.gen.CodeV;
import tr.fn.gen.Environment;
import tr.fn.gen.GenerateException;
import tr.fn.gen.GenerationContext;
import tr.fn.gen.instr.Halt;
import tr.fn.opt.DeadCodeEliminator;
import tr.fn.opt.OptimizationContext;
import tr.fn.opt.OptimizationException;
import tr.fn.pre.IncludePreprocessor;
import tr.fn.pre.PreprocessContext;
import tr.fn.pre.PreprocessorException;

/**
 * Main class for the compiler.
 */
public class Compile {
	
	public static void main(String[] args) throws PreprocessorException, GenerateException, IOException, OptimizationException {
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
		
		compile(inputFile, outputFile, command.hasOption(CompileOptions.OPTION_DEBUG), command.hasOption(CompileOptions.OPTION_DEADCODE));
	}
	
	public static void compile(File inputFile, File outputFile, boolean debug, boolean nodead) throws PreprocessorException, GenerateException, IOException, OptimizationException {
		// Executing "#include"
		PreprocessContext preprocessContext = new PreprocessContext(inputFile, debug);
		new IncludePreprocessor(preprocessContext).execute();
		
		// Concrete syntax tree
		Tree tree = preprocessContext.getTreeAfterPreprocess();
		
		// Tree of statements
		AstBuilder builder = new AstBuilder();
		LetRec program = builder.buildProgram(tree);
		
		// Optimizations
		OptimizationContext optimizationContext = new OptimizationContext(program, debug);
		if (nodead) {
			new DeadCodeEliminator(optimizationContext).execute();
		}
		
		// Generate output code
		GenerationContext generationContext = new GenerationContext();
		generationContext.setDebug(debug);
		CodeV.codeV(new Environment(null), generationContext, optimizationContext.getProgram(), 0);
		generationContext.addInstruction(new Halt());
		
		// Save it to file
		generationContext.saveToFile(outputFile);
	}
	
	private static void printHelp(Options options) {
		HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp("puf-compile", options);
	}
	
	private static class CompileOptions extends Options {
		public static final String OPTION_IN = "in";
		public static final String OPTION_OUT = "out";
		public static final String OPTION_DEBUG = "debug";
		public static final String OPTION_DEADCODE = "nodead";
		
		public CompileOptions() {
			addOption(OPTION_IN, true, "Input file for the PuF code");
			addOption(OPTION_OUT, true, "Output file");
			addOption(OPTION_DEBUG, false, "If present, excessively verbose debug info is written to the output");
			addOption(OPTION_DEADCODE, false, "If present, tries to eliminate unused declarations");
		}
	}
}
