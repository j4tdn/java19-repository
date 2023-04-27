package ex1234;

public class Ex01FindPowerOfNumber {
	public static void main(String[] args) {
		int a = 2;
		int b = 8;

		Ex01FindPowerOfNumber ex01 = new Ex01FindPowerOfNumber();
		ex01.isPowerOf(a, b);

		System.out.println("(" + a + "," + b + ")" 
							+ "(" + ex01.isPowerOf(a, b) + ")");
	}

	private boolean isPowerOf(int a, int b) {
		int less;
		int bigger;
		int temp = 1;

		if (a < b) {
			less = a;
			bigger = b;
		} else if (a > b) {
			less = b;
			bigger = a;
		} else {
			return true;
		}

		while (true) {
			temp = temp * less;
			if (temp == bigger) {
				return true;
			} else if (temp > bigger) {
				return false;
			}
		}

	}
}
