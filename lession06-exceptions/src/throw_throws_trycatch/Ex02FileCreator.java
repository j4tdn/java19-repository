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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("*** ___ finished ___ ***");
	}
	
	// Tạo file data.txt trong folder document ở ổ đĩa D
	// pathname : D:\\document\\data.txt
	
	// Tạo file data.txt trong dự án hiện tại
	// pathname : data.txt  --> relative path
	private static File createNewFile(String pathname) throws IOException {
		if(pathname ==null || pathname.isEmpty()) {
			throw new FileNotFoundException("path is invalid");
		}
		
		File file = new File(pathname);
		if (!file.exists()) {
			
			boolean isCreated = file.createNewFile();
			System.out.println(file.getName() + " created successful --> " + isCreated);
		}
		return file;
	}
	
	/*
	 
	 JAVA có 2 loại Exception :
	 	+ Checked (Compile) Exception:
	 		--> Là những exception bắt buộc pahir xử lý tại thười điểm compile
	 		--> ...Exception con của class Exception
	 		
	 	+ Unchecked (Runtime) Exception :
	 		--> 
	 
	 */
}
