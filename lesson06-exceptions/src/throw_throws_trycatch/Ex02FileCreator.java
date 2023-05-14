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
	System.out.println("Finished");
}
//Tạo file data.txt trong folder document ở ổ đĩa D
//pathname: D:\\document\\data.txt --> absolute path

//tạo file data.txt trong sự án hiện tại: 
//pathname: data.txt --> relative path
private static File createNewFile(String pathname) throws IOException {
	if (pathname == null || pathname.isEmpty()) {
		throw new FileNotFoundException("Path is invalid");
	}
	File file = new File(pathname);
	if (!file.exists()) {
		boolean isCreated = file.createNewFile();
		System.out.println(file.getName() + " created successfully --> " + isCreated);
	}
	return file;
}
}
//JAVA có 2 loại exception:
 //checked(Complile) exception: bắt buộc phải xử lí tại thời điểm compile
// --> ...Exception con của class Exception
// thân hàm throw new compile exception
//phần khai báo hàm phải throws compile exception đó
//để thông báo cho vị trí gọi hàm này --> bắt buộc phải xử lí lỗi


//Unchecked (Runtime) : ko bắt buộc phải xử lí lúc compile
//--> có thể bị lỗi tại Runtime
//--> ...Exception con của class RuntimeException