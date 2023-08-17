package string.immutable;

import java.util.Arrays;

/**
 1. Tính chiều dài của chuỗi s
 2. Nối chuỗi s1 vào chuỗi s
 3. Lấy một ký tự tại vị trí index(3) trong chuỗi s
 4. Duyệt từng kí tự, từ trong chuỗi
 5. Tìm vị trí – chỉ số xuất hiện đầu tiên, cuối cùng của kí tự  “a” trong chuỗi s
*/
public class Ex03StringDemo01 {
	public static void main(String[] args) {
		String s = "hello world, my name is teo";
		String s1 = ", nice to see you all";
		
		System.out.println("1. s length --> " + s.length());
		System.out.println("2. s + concat --> " + (s.concat(s1)));
		System.out.println("3. s chartAt --> " + s.charAt(3));
		loopChars(s + s1);
		loopWords(s + s1);
	}
	
	private static void loopChars(String s) {
		System.out.print("4. loop chars --> ");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + "-");
		}
		System.out.println();
	}
	
	private static void loopWords(String s) {
		// \\s --> cắt theo 1 khoảng trắng
		// ,   --> cắt theo dấu phẩy
		// \\s, --> cắt theo cụm khoảng trắng và ,
		// ,\\s --> cắt theo cụm khoảng , và khoảng trắng
		
		// [\\s,] --> tổ hợp tất cả các kết quả có thể xuất hiện trong []
		//        --> \\s
		//        --> ,
		//        --> \\s,
		//        --> ,\\s
		
		// +<=>{1,} --> cắt theo 1 hoặc nhiều kí tự
		//          --> lấy trường hợp tốt nhất
		
		// [\\s,]+ --> tổ hợp tất cả các kết quả có thể xuất hiện trong []
		//         --> \\s+
		//         --> ,+
		//         --> \\s+,+
		//         --> ,+\\s+
		
		System.out.println("4. loop words --> ");
		String[] tokens = s.split("[\\s,]+");
		for (String token: tokens) {
			System.out.println("|||" + token + "|||");
		}
	}
}
