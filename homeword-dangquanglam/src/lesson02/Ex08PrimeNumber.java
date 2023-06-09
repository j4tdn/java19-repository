package lesson02;

public class Ex08PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Prime Number : " +prime(2));
		System.out.println("Prime Number : " +prime(10));

	}
	
	private static boolean prime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
