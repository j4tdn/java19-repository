package string.immutable;

import java.util.Arrays;

/**
 * Tính chiều dài của chuỗi s
• Nối chuỗi s1 vào chuỗi s
• Lấy một ký tự tại vị trí index(3) trong chuỗi s
• Duyệt từng phần tử trong chuỗi
• Tìm vị trí – chỉ số xuất hiện đầu tiên, cuối cùng của kí tự “a” trong chuỗi s
 * 
 *
 */
public class Ex03StringDemo01 {
	public static void main(String[] args) {
		String s = "hello world, my name is teo";
		String s1 = ", nice to see you";
		
		//1.Tính chiều dài của chuỗi s
		System.out.println("\n======1. length=====\n");
		System.out.println(+ s.length());
		
		
		//2.Nối chuỗi s1 vào chuỗi s
		System.out.println("\n======2. concat=====\n");
		System.out.println( s.concat(s1));		
		
		//3. Lấy một ký tự tại vị trí index(3) trong chuỗi s
		System.out.println("\n======3. char at=====\n");
		System.out.println( s.charAt(3));	
		
		//4.Duyệt từng phần tử, tu trong chuỗi
		System.out.println("\n======4.1 loopChars=====\n");
		loopChars(s);
		
		System.out.println("\n======4.2 loopWords=====\n");
		loopWords(s);
		
		//5.
		System.out.println("\n======5=====\n");
		
		
		
		
	}
	
	//3.
	private static void loopChars(String s) {
		for (int i = 0; i < s.length(); i++) {
		    char c = s.charAt(i);
		    System.out.print( c + "-");
		}
		System.out.println("\n");
	}
	
	//4.
	private static void loopWords(String s) {
		
		// \\s --> cat theo khoang trang
		// , --> cat theo dau ,
		// \\s, cat theo cum khoang trang va ,
		// ,\\s cat theo cum khaong , va khoang trang
		
		// [\\s,] --> cat theo to hop
		// \\s | , | \\s, | ,\\s
		
		// [\\s,]+ --> cat theo to hop
		// \\s+ | ,+ | \\s,+ | ,\\s+
		String[] words = s.split("[\\s,]+");

		for (String word : words) {
		    System.out.print(" " + word + " ");
		}
		System.out.println("\n");
	}
}
