package throw_throws_trycatch;

/*
 *  yêu cầu: thực hiện phép chia 2 số cho a,b
 */


public class Ex01Divisor {
	public static void main(String[] args) {
		System.out.println("d1-->"+ divide(10, 2));
		
		System.out.println("d2-->"+ divide(5, 0));
	}
	
	private static int divide(int a ,int b) {
		
		if (b == 0) {
			throw new ArithmeticException("B should not be zero!!");
		}
		
		return a/b;
		
		/*
		 * validate --> nhập vào b phải luôn !0
		 * try/ catch --> nếu lỗi thì quăng lỗi và tiếp tục
		 * throw
		 */
	}
}
