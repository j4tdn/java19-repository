package throw_throws_trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02FileCreator {
	public static void main(String[] args) {
		try {
			File file = createNewFile("");
			System.out.println("file --> " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("***___ finished ___ ***");
	}
	
	// Tạo file data.txt trong folder document ở ô đĩa D
	// pathname: D:\\document\\data.txt --> absolute path
	
	// Tạo file data.txt trong dự án hiện tại
	// pathname:data.txt --> relative path
	private static File createNewFile(String pathname) throws IOException {
		
		if (pathname == null || pathname.isEmpty()) {
			throw new FileNotFoundException("path is invalid");
		}
		
		File file = new File(pathname);
		if (!file.exists()) {
			boolean isCreated = file.createNewFile();
			System.out.println(file.getName() + " is created successful --> " + isCreated);
		}
		return file;
	}
	
	/*
	
	JAVA có 2 loại exception
	+ Checked(Compile) Exception: 
		--> Là những exception bắt buộc phải xử lý tại thời điểm compile
		--> ...Exception con của class Exception
		
	+ Unchecked(Runtime) Exception:
		--> Là những exception không bắt buộc phải xử lý tại thời điểm compile
		--> Có thể gây ra / bị lỗi tại thời điểm runtime
		--> ...Exception con của class RuntimeException
	 
	
	public static void test() {
	   ....
	   throw new ArithmeticException(...);
	   // không bắt buộc phải throws Runtime Exception tại phần khai báo hàm
	   // vì có throws hay không Runtime Exception thì
	   // vị trí gọi hàm này cũng ko bắt buộc xử lý
	}
	
	public static void test() throws IOException {
	   ....
	   throw new IOException(...); // compile exception
	   // thân hàm throw new compile exception
	   // phần khai báo hàm phải throws compile exception đó
	   // để thông báo cho vị trí gọi hàm này --> phải bắt buộc xử lý lỗi
	}
	
	
	
	*/
}
