package throw_throws_trycatch;

public class Ex01Divisor {
	public static void main(String[] args) {
		System.out.println(divide(10, 2));
		
		try {
			System.out.println(divide(5, 0));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	private static int divide(int a, int b) {
		if( b == 0) {
			throw new ArithmeticException("b should not be zero");
		}
		return a / b;
	}
}
