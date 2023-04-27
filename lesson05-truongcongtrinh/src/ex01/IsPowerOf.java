package ex01;

public class IsPowerOf {
	private IsPowerOf() {
		System.out.println(isPowerOf(2, 8));
	}

	public static void main(String[] args) {
		new IsPowerOf();
	}

	private static boolean isPowerOf(int a, int b) {
		if (a == 0 || b == 0) {
			return false;
		}

		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		int checkNum = 1;
		while (checkNum < a) {
			checkNum *= b;
		}
		return checkNum == a;
	}
}
