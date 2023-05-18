package throw_throws_trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02FileCreator {
	public static void main(String[] args) {
		try {
			File file = createNewFile("dataa.txt");
			System.out.println("File is : " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static File createNewFile(String pathname) throws IOException {
		if(pathname == null || pathname.isEmpty()) {
			throw new FileNotFoundException("Path is invalid");
		}
		
		File file = new File(pathname);
		if(!file.exists()) {
			boolean isCreated = file.createNewFile();
			System.out.println(file.getName() + "is created successful --> " + isCreated);
		}
		return file;
	}
}
