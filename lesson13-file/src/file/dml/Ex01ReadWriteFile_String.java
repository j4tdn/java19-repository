package file.dml;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex01ReadWriteFile_String {
public static void main(String[] args) {
	
	//File file = new File(null)
	Path path = Paths.get("data", "interview.txt");
	List<String> questions = List.of();
	Files.write(path, null, null);
}
}
