package tr.fn.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.io.FilenameUtils;

import tr.fn.Compile;

public class RunUtil {
	private static final String MAMA_UNIX = "mama/main";
	private static final String MAMA_WINDOWS = "mama/main.exe";
	
	public static int compileAndRun(File file) throws Exception {
		File dir = file.getParentFile();
		String name = FilenameUtils.getBaseName(file.getName());
		File out = new File(new File(dir, "out"), name + ".f");
		
		if (out.exists()) {
			out.delete();
		}
		
		Compile.compile(file, out, true, false, true, true, true, true);
		
		return RunUtil.runProgram(out);
	}
	
	private static int runProgram(File file) throws Exception {
		if (!file.exists()) {
			throw new IllegalArgumentException("File does not exist");
		}
		
		String mama = isUnix() ? MAMA_UNIX : MAMA_WINDOWS;
		
		Process process = Runtime.getRuntime().exec(new String[] {mama, "-steps", "3000", "-r", file.getAbsolutePath()});
		InputStream in = process.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String outString = reader.readLine();
		process.waitFor();
		in.close();
		
		return Integer.valueOf(outString);
	}
	
	private static boolean isUnix() {
		return File.listRoots()[0].getAbsolutePath().startsWith("/");
	}
}
