package file.dml.text;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import utils.CollectionUtils;
import utils.FileUtils;

public class Ex01ReadWriteFile_String {
	
	public static void main(String[] args) {
		
		// Ghi dữ liệu vào file
		// input
		// + path
		// + Iterable<String>
		// + OpenOption
		
		Path path = Paths.get("data", "interview.txt");
		
		List<String> questions = List.of(
				"1. What is Stream in Java",
				"2. What is Lambda in Java",
				"3. What is Method Reference in Java",
				"4. What is Constructor Reference in Java",
				"5. What is Thread"
		);
		
		FileUtils.writeLines(path, questions);
		FileUtils.open(path);
		
		System.out.println("\n=================================\n");
		
		List<String> lines = FileUtils.readLines(path);
		CollectionUtils.generate("lines", lines);
		
	}
}
