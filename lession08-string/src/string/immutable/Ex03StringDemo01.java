package string.immutable;

import java.util.Arrays;

public class Ex03StringDemo01 {
	public static void main(String[] args) {
		String s = "hello world, my name is teo";
		System.out.println(s.length());
		
		
		String s1 = ", nice to see you all";
		
		cau2(s,s1);
		
		cau3(s);
		cau4(s);
		cau5(s);
		
		// \\s --> cắt theo khaonrg trắng
		// , --> cắt theo dấu phẩy
		// \\s, -->cắt theo cụm khoảng trắng và ,
		
		// [\\s,] --> tổ hợp tất cả các kết quả có thể xuất hiện trong []
					// --> \\s
					// --> ,
					// \\s,
					// ,\\s
		// + 	-->cắt theo 1 hoặc nhiều kí tự
				//--> lấy trường hợp tốt nhất
		loopWords(s);
	}
	
	private static void loopWords(String s) {
		String[] tokens = s.split("[\\s,]+");
		for(String token : tokens) {
			System.out.println("|||" + token + "|||");
		}
	}
	
	private static void cau5(String s) {
		System.out.println("\n" + s.indexOf('o'));
		System.out.println(s.lastIndexOf('o'));
	}

	private static void cau2(String s, String s1) {
		String s2 = s + s1;
		System.out.println(s2);
	}

	public static void cau3(String s) {
		char ch = s.charAt(3);
		System.out.println(ch);
	}
	
	public static void cau4(String s) {
		for(char c : s.toCharArray()) {
			System.out.print(c+ " ");
		}
	}
}
