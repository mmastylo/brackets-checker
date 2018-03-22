package mm.test.brackets;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {

	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			throw new IllegalArgumentException("No file path provided.");
		}

		Path path = Paths.get(args[0]);

		if (!path.toFile().exists()) {
			throw new IllegalArgumentException("File does not exist.");
		}

		String text = new String(Files.readAllBytes(path));
		long startTime = System.currentTimeMillis();
		BracketsChecker bracketsChecker = new BracketsChecker();
		boolean result = bracketsChecker.check(text);
		long stopTime = System.currentTimeMillis();

		System.out.println("correct brackets: " + result + ", text length: " + text.length() + ", time: "
				+ (stopTime - startTime) + " ms");
	}

}