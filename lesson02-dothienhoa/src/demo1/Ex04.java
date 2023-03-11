package demo1;

public class Ex04 {
	public static void main(String[] args) {
		long a = (long) (Math.random() * 11) + 10; 
		long b = (long) (Math.random() * 11) + 10;
		long c = (long) (Math.random() * 11) + 10;
		long d = (long) (Math.random() * 11) + 10;

		long sum = sumOfFactorials(a, b, c, d);

		System.out.println("Tổng giải thừa của " + a + ", " + b + ", " + c + " và " + d + " là " + sum);
	}

	public static long factorial(long n) {
		long result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}


	public static long sumOfFactorials(long a, long b, long c, long d) {
		long sum = factorial(a) + factorial(b) + factorial(c) + factorial(d);
		return sum;
	}

}
