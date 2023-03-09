package testlesson2;

public class Bai4 {
	private static int factorialOfN(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorialOfN(n - 1);
	}

	private static long sumOfFourFactorialOfNRandom(int a, int b, int c, int d) {
		return factorialOfN(a) + factorialOfN(b) + factorialOfN(c) + factorialOfN(d);
	}

	public static void main(String[] args) {
		// define the range
		int max = 10;
		int min = 20;
		int range = max - min + 1;

		int a = (int) (Math.random() * range) + min;
		int b = (int) (Math.random() * range) + min;
		int c = (int) (Math.random() * range) + min;
		int d = (int) (Math.random() * range) + min;
		System.out.println(a + "! " + b + "! " + c + "! " + d + "! = " + sumOfFourFactorialOfNRandom(a, b, c, d));
	}
}
