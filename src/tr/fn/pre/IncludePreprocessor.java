package tr.fn.pre;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;

/**
 * Starts from the main file and reads in all files
 * that are included using 'include' directive.
 */
public class IncludePreprocessor {
	private static final String ENCODING = "UTF-8";
	private static final String INCLUDE_REGEX = "^\\#include\\s+?(.+)$";
	
	private Set<File> files;
	private PreprocessContext context;

	public IncludePreprocessor(PreprocessContext context) throws PreprocessorException {
		this.context = context;
	}
	
	@SuppressWarnings("unchecked")
	public void execute() throws PreprocessorException {
		files = new HashSet<File>();
		try {
			files.add(context.getMain());
			addIncludes(context.getMain(), FileUtils.readLines(context.getMain(), ENCODING));
		} catch (IOException e) {
			throw new PreprocessorException(e);
		}
	}
	
	@SuppressWarnings("unchecked")
	private void addIncludes(File includer, List<String> lines) throws IOException {
		List<File> includes = new ArrayList<File>();
		Pattern pattern = Pattern.compile(INCLUDE_REGEX);
		List<String> linesClean = new ArrayList<String>();
		
		for (String line : lines) {
			Matcher matcher = pattern.matcher(line);
			if (matcher.matches()) {
				File file = new File(includer.getParentFile(), matcher.group(1).trim());
				if (!includes.contains(file)) {
					addIncludes(file, FileUtils.readLines(file, ENCODING));
				}
				includes.add(file);
			} else {
				linesClean.add(line);
			}
		}
		
		context.addFile(includer, linesClean);
	}
	
	/**
	 * Returns all code files, both original and included.
	 */
	public Collection<File> getAllFiles() {
		return files;
	}
	
}
