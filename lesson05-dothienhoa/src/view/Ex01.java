package view;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println(isPowerOf(64, 4));
	}

	private static boolean isPowerOf(int a, int b) {
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		double x = Math.log(a) / Math.log(b);
		return x == (int) x;
	}

}
