package lesson02;

public class Ex09FindNthPrime {
	public static void main(String[] args) {
		int num = 2;
		int count = 0;
		
		while(true) {
			if (prime(num)) {
				count++;
				System.out.println(+ num);
				if(count == 5) {
					break;
				}
			}
			num++;
		}
		System.out.println(count + "th prime ---> " + num );
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
