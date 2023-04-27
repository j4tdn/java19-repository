package view;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(2, 8));
		System.out.println(isPowerOf(6, 2));
		System.out.println(isPowerOf(20, 4));
		System.out.println(isPowerOf(64, 4));
		
	}
	private static boolean isPowerOf(int a, int b) {
		if(a <= 0 || b <= 0) {
			return false;
		}
		while (a > b) {
			if (a % b != 0) {
				return false;
			}
			a = a / b;
		}
		return a == b;
		
	}
	
	

}
