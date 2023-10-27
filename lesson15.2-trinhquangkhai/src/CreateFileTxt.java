import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileTxt {
public static void main(String[] args) {
	String filename = "student.txt";
	String content = "102130174, Le Na, 7.8, Nu"
			+ "102130125, Hoang Nam, 8.2, Nam"
			+ "102130176, Van Cuong, 9.8, Nam"
			+ "102130177, Van Cong, 6.8, Nam"
			+ "102130178, Ngoc Nu, 9.1, Nu"
			+ "102130180, Hoang Nhung, 7.8, Nu";
	try {
		BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
		writer.write(content);
		writer.close();
		System.out.println("File is created sucessfully");
		
	}catch (IOException e ) {
		System.out.println("Error! can not create file ");
		e.printStackTrace();
	}
}
}
