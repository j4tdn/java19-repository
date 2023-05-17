package throw_throws_trycatch;

/**
 * Yêu cầu: Thực hiện phép chia 2 số a,b
 * 
 * @author ADMIN
 *
 */

public class Ex01Divisor {
	public static void main(String[] args) {
		
		try {
			System.out.println("d2 --> " + divide(5,0));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("d2 --> " + divide(10,2));
	}
	
	private static int divide(int a, int b) {
		if(b==0) 
			throw new ArithmeticException("b should not be zero !!!");
		return a/b;
	}
	
	/*
	 	Exception in thread "main" java.lang.ArithmeticException: / by zero
		at throw_throws_trycatch.Ex01Divisor.divide(Ex01Divisor.java:18)
		at throw_throws_trycatch.Ex01Divisor.main(Ex01Divisor.java:14)
	 */
}
