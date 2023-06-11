package throw_throws_trycatch;

public class Ex01Divisor {
	public static void main(String[] args) {
		System.out.println("d1 --> " + divide(10, 2));
		System.out.println("d2 --> " + divide(5, 0));
	}
	
	private static int divide(int a, int b) {		
		return a/b;
	}
}
