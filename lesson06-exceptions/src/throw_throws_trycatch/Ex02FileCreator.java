package throw_throws_trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02FileCreator {
	public static void main(String[] args) {
		try {
			File file = fileCreate("");
			System.out.println("file -->" + file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("==========Finish========");
		
	}
	//Tạo file data.txt trong folder document ở ổ đĩa D
	//pathname: D:\\document\\data.txt --> absolute path

	//tạo file data.txt trong sự án hiện tại: 
	//pathname: data.txt --> relative path
	
	private static File fileCreate(String pathName) throws IOException {
		//tạo 2 throw
		if(pathName == null || pathName.isEmpty()) {
			throw new FileNotFoundException("path is invalid");
		}
		
		File file = new File(pathName);
		if(!file.exists()) {
			boolean isCreated = file.createNewFile();
			System.out.println(file.getName() + " create suscessfully -->" +isCreated);
		}
		return file;
		
	}
	
	/* JAVA có 2 loại exception:
	checked(Complile) exception: bắt buộc phải xử lí tại thời điểm compile
	 --> ...Exception con của class Exception
	 thân hàm throw new compile exception
	phần khai báo hàm phải throws compile exception đó
	để thông báo cho vị trí gọi hàm này --> bắt buộc phải xử lí lỗi


	Unchecked (Runtime) : ko bắt buộc phải xử lí lúc compile
	--> có thể bị lỗi tại Runtime
	--> ...Exception con của class RuntimeException
	
	
	public static void test(){
	....
	throw new ArithmeticExxception(...);
	// không bắt buôc throws Runtime Exception tại phần khai báo hàm
	// vì có throws hay không Runtime Exception thì
	// vị trí gọi hàm cũng ko bắt buộc xử lý 
	
	public static void test() throws IOException {
	....
	throw new IOException(...);
	// thân hàm throws new compile Exception
	// phần khai báo hàm phải throws compile exception đó
	// để thông báo cho vị trí gọi hàm này --> phải bắt buộc xử lý lỗi
	
	*/

}
