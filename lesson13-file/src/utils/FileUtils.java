package utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {
private FileUtils() {
}
public static File createdNewFile(String path) {
	File file = new File(path);
	String filename = file.getAbsolutePath();
	if(file.exists()) {
		System.out.println("File " + file.getName() + " is created");
	}else {
		File parents = file.getParentFile();
		if(!parents.exists()) {
			parents.mkdirs();
			System.out.println("Dir " + parents.getAbsolutePath() + " is created successful");
		}
	try {
		boolean isSuccess =	file.createNewFile();
		System.out.println("File " + filename + " is created " + (isSuccess ? "successful" : "failed"));
	} catch (IOException e) {
		e.printStackTrace();
	}
}
	return file;
}
public static File createNewDir(String path) {
	File dir = new File(path);
	String dirname = dir.getAbsolutePath();
	if(dir.exists()) {
		System.out.println("Dir " + dirname + "is existed");
	}else {
		boolean isSuccess = dir.mkdirs();
		System.out.println("Dir " + dirname + (isSuccess ? "successful" : "failed"));
	}
	return dir;
}

}
