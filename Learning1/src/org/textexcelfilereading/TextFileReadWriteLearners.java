package org.textexcelfilereading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;


public class TextFileReadWriteLearners {

	public static void main(String[] args) throws IOException {
		// java 11 features
		Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");
		System.out.println(path);
		String s = Files.readString(path);
		System.out.println(s);
		System.out.println(Objects.requireNonNull("test"));
		//Path.of(GetPropertyAction.privilegedGetProperty("java.io.tmpdir"));
	}

}
