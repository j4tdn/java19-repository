package homework;

import java.math.BigInteger;

public class Ex03FindFactorial {

	public static void main(String[] args) {
		int input = 50;
		System.out.println("Giai thừa của " + input + " là: " + factorial2(input));
	}

	public static long factorial(int input) {
		long result = 1;
		for (int i = 2; i <= input; i++) {
			result *= i;
		}
		return result;
	}

	public static BigInteger factorial2(int num) {
		BigInteger result = BigInteger.ONE;
		for (int next = 2; next <= num; next++) {
			result = result.multiply(new BigInteger(Integer.toString(next, 10)));
		}
		return result;
	}
}
