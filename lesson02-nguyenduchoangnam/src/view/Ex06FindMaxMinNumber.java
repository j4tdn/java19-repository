package view;

// import tất cả static methods/attributes từ class utils.NumberUtil
// gọi trực tiếp ko cần phải lấy NumberUtil...
import static utils.NumberUtil.*;

public class Ex06FindMaxMinNumber {
	// ctrl shift o
	public static void main(String[] args) {
		int a = random(0, 20);
		int b = random(0, 20);
		int c = random(0, 20);
		
		System.out.println("(a, b, c) --> (" + a + ", " + b + ", " + c + ")");
		
		
		// take n! comparison times --> not good for huge elements
		// if (a>b && a>c) --> max is a
		// if (b>a && b>c) --> max is b
		// if (c>a && c>b) --> max is c
		
		// assign max = a --> 
		// if (b > max) max = b
		// if (c > max) max = c
		
		int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		System.out.println("max --> " + max);
	}
	
	// Yêu cầu viết 1 hàm trả về min, max của 3 số a, b, c
	// Trả về 1 đối tượng Tuple(left, right)
	
	
}
