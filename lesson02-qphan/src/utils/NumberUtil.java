package utils;

public class NumberUtil {

	private NumberUtil() {
	}

	public static long factorial(int n) {
		long f = n; // 10
		while (n > 1) {
			n--;
			f *= n;
		}
		return f;
	}
}
