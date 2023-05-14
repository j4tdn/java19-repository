package throw_throws_trycatch;
/*
 * yeu cau: chia 2 so a, b
 * 
 */
public class Ex01Divisor {
	public static void main(String[] args) {
		
		System.out.println("d1 -->"+ divide(10, 2));
		
		try {
			System.out.println("d2 -->"+ divide(5, 0));
		} catch (ArithmeticException e) {
			System.out.println("AEM --> " + e.getMessage());
		}
		
	}
	
	private static int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("b should not be zero !!!");
			//khi nem ngoai le ra --> break
		}
		return a / b;
	}
	
	/**
	 * Exception in thread "main" java.lang.ArithmeticException: / by zero
			at throw_throws_trycatch.Ex01Divisor.divide(Ex01Divisor.java:15)
			at throw_throws_trycatch.Ex01Divisor.main(Ex01Divisor.java:10)
	 */
}
