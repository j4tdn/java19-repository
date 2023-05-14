package throw_throws_trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02FileCreator {
	public static void main(String[] args) {
		try {
			File file = createNewFile("data.txt");
			System.out.println("file --> " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("====finished====");
	}
	
	//tao file data.text trong folder document o o dia D
	//pathName: data.txt --> relative path
	
	//throws (compile) --> function declaration
	private static File createNewFile(String pathName) throws IOException {
		
		if (pathName == null || pathName.isEmpty()) {
			throw new FileNotFoundException("path is invalid");
			
		}
		
		File file = new File(pathName);
		if (!file.exists()) {
			boolean isCreated = file.createNewFile();
			System.out.println(file.getName()+ "is created successful -->" + isCreated);
		}
		return file;
	}
}
