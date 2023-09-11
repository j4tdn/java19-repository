package file.dml.text;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import utils.FileUtils;

public class Ex01ReadWriteFile_String {
    public static void main(String[] args) {
		
    	//Ghi du lieu vao file
    	Path path = Paths.get("data", "interview.txt");
    	List<String> questions = List.of(
    			"1. What is Stream in Java",
    			"2. What is Lamba in Java "
    			"3. What is Method reference");
         FileUtils.write(path, questions);
         
         FileUtils.open(path);
	}
}
