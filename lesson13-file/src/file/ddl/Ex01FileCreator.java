package file.ddl;

import java.io.File;
import java.io.IOException;

import utils.FileUtils;

public class Ex01FileCreator {
	private static final String path = "data" +File.separator + "interview.txt"; 
public static void main(String[] args) {
	File file = FileUtils.createdNewFile(path);
	System.out.println("File properbility " + file );
	
	}
}

