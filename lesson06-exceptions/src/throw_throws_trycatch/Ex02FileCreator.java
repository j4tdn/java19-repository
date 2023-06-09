package throw_throws_trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02FileCreator {
public static void main(String[] args) {
	try {
		File file = createNewFile("data.txt ");
		System.out.println("file" + file);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
//
private static File createNewFile(String pathname) throws IOException {
	if(pathname == null || pathname.isEmpty()) {
		throw new FileNotFoundException("path is invalid");
	}
	
File file = new File(pathname);
if(!file.exists()) {
	boolean isCreated = file.createNewFile();
	System.out.println(file.getName() + " is created successful -> " + isCreated);
}
return file;
// Khi bên trong hàm ném ra compile exception thì throws ra để thông báo cho hàm này -> xử lý lỗi
// không bắt buộc throws runtime ex tại phần khai báo hàm vì có throws hay không Runtime Ex thì 
// vị trí gọi hàm này cũng ko bắt buộc xử lý 
}

}
