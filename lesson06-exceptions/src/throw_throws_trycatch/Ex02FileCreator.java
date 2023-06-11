package throw_throws_trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02FileCreator {
	public static void main(String[] args) {
		try {
			File file = createNewFile("");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static File createNewFile(String pathname) throws IOException{
		
		if(pathname == null || pathname.isEmpty()) {
			throw new FileNotFoundException("path is invalid");
		}
		File file = new File(pathname);
		if(!file.exists()) {
			boolean isCreated = file.createNewFile();
			System.out.println(file.getName() + " created successful --> "+ isCreated);
		}
		return file;
	}
}
