package file.dml.test;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

import utils.FileUtils;
import static utils.CollectionUtils.*;

public class Ex01ReadWriteFile_String {

	public static void main(String[] args) {

		// ghi dữ liệu vào file
		/*
		 * Input: + path + Iterable<String> + OpenOption
		 */
//		Path path = Paths.get("data", "interview.txt");

		File file = new File("data//interview.txt");
		Path path = file.toPath();

		List<String> questions = List.of(
				"1. What is Stream in Java", 
				"2. What is Lambda in Java",
				"3. What is Method Reference in Java",
				"4. What is Constructor Reference in Java",
				"5. What is Thread"
				);

		FileUtils.writeLines(path, questions);
		FileUtils.open(file);
		
		System.out.println("\n=============================\n");
		
		List<String> lines = FileUtils.readLines(path);
		
		generate("lines", lines);
		
		
		
	}
}
