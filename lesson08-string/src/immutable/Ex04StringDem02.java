package immutable;

public class Ex04StringDem02 {
//• Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
//	• Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
//	• Loại bỏ các khoảng trắng thừa của chuỗi s3
//	• Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
//	• Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
	public static void main(String[] args) {
		String[] sequences = {"SGK123", "STKxy12", "SGK999", "STK115"};
		//1. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
		System.out.println("sequences[0]-->" + sequences[0].startsWith("SGK"));
		System.out.println("sequences[0]-->" + sequences[0].endsWith("123"));
		System.out.println("sequences[1]-->" + sequences[1].startsWith("SGK"));
		//2. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		String s = "welcome to string lesson";
		System.out.println("Replacement --> " + s.replace("string", "char sequence"));
		//3. Loại bỏ các khoảng trắng thừa của chuỗi s3
		String s3 = "welcome    to string   lesson";
		System.out.println("Space Replacement--> " + s3.replaceAll("\\s+", " "));
		
		System.out.println("=======================");
		//Loại bỏ các khoảng trắng thừa ở 2 đầu của chuỗi s4
		String s4 = "  welcome    to string   lesson  ";
		System.out.println("Space Replacement--> " + s4.strip().replaceAll("\\s+", " "));
		
		//4. Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
		s = s.strip(); //loại bỏ khoảng trắng 2 đầu 
		int firstSpaceIndex = s.indexOf(" ");
		System.out.println("Sub String -->" +s.substring(3, firstSpaceIndex));
		
		//5. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		System.out.println("Contains-->" + s.contains("to"));
	} 
}
