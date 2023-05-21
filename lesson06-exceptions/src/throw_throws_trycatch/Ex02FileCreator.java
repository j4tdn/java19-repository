package throw_throws_trycatch;

import java.io.File;

public class Ex02FileCreator {
	public static void main(String[] args) {
		
	}
	
	//tao file data.txt trong du an
	private static File createNewFile (String pathname) {
		File file = new File(pathname);
		if(!file.exists()) {
			boolean isCreated = file.createNewFile();
			System.out.println(file.getName() + "is ");
		}
	}
}
