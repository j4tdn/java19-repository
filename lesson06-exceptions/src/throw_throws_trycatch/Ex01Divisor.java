package throw_throws_trycatch;

/**
 * Requirments: Implement division of a and b
 * 
 * @author USER
 *
 */
public class Ex01Divisor {
	public static void main(String[] args) {
		// K, T
		System.out.println("K, T --> " + divide(10, 2));

		
		// M, N
		try {
			System.out.println("M, N --> " + divide(5, 0));
		} catch (ArithmeticException e) {
			System.out.println( "AEM --> " + e.getMessage());
		}
	}

	// --> utility method
	// --> nhận vào input và xử lý logic --> được gọi từ nhiều nơi.
	// M --> divide
	// N --> divide
	// K --> divide b
	// M, N --> cho truyền vào a, b thoải mái --> b có thể là 0 --> gọi hàm -->
	// exception.
	// K, T --> nhập a, b là số nguyên dương --> gọi hàm --> không bao giờ có ngoại
	// lệ

	// chổ nào chưa validate cho a, b --> xử lí lỗi
	// chổ nào đã validate cho a, b --> không cần phải xử lý lỗi.

	// try/catch luôn luôn thử và xử lý lỗi
	// --> throw ngoại lệ cho chổ chưa bắt lỗi và xử lý tại đó.
	private static int divide(int a, int b) {
		if(b==0) {
			throw new ArithmeticException("b should not be zero!!!");
			// khi ném ngoại lệ ra --> đoạn code phía sau sẽ không được thực thi.
			// dừng hàm.
		}
		return a / b;
	}
}
