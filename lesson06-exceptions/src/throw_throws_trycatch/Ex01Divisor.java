package throw_throws_trycatch;

import java.io.File;

/**
 * Yêu cầu: Thực hiện phép chia 2 số a, b
 * 
 * @author qphan
 *
 */
public class Ex01Divisor {
	public static void main(String[] args) {
		// M, N
		try {
			System.out.println("M, N --> " + divide(5, 0));
		} catch (ArithmeticException e) {
			System.out.println("AEM --> " + e.getMessage());
		}
		
		// K, T (validate)
		System.out.println("\nK, T --> " + divide(10, 2));
		
		// ở function --> ném ra ngoại lệ
		// chỗ gọi function đó không bắt buộc phải bắt/xử lý(try catch) lỗi đó
	}
	
	// --> utility method
	// --> nhận vào input và xử lý logic --> được gọi từ nhiều chỗ
	
	// M --> divide
	// N --> divide
	// K --> divide
	
	// M, N --> cho truyền vào a, b thoải mái --> b có thể là 0 --> gọi hàm --> ngoại lệ
	// K, T --> nhập xuất a,b là số nguyên dương --> gọi hàm --> ko bao giờ xảy ra ngoại lệ
	
	// chỗ nào mà chưa validate cho a, b --> xử lý lỗi ..
	// chỗ nào đã validate cho a, b --> ko cần phải xử lý lỗi
	
	// try/catch luôn luôn thử và xử lý lỗi
	// --> throw ngoại lệ cho chỗ chưa bắt lỗi và xử lý tại đó
	
	// Tượng tư Integer.parseInt(text)
	private static int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("b should not be zero !!!");
			// khi ném ngoại lệ ra --> đoạn code phía sau sẽ không được thực thi
			// dừng hàm
		}
		return a / b;
	}
	
	/*
	 Exception in thread "main" java.lang.ArithmeticException: / by zero
		at throw_throws_trycatch.Ex01Divisor.divide(Ex01Divisor.java:17)
		at throw_throws_trycatch.Ex01Divisor.main(Ex01Divisor.java:13)
		
		// validate  --> nhập vào b phải luôn !0
		// try/catch --> nếu lỗi thì quăng lỗi và tiếp tục
		// throw[s]
	*/
}
