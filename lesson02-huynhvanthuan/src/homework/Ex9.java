package homework;

public class Ex9 {

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int count = 0;
		int flag = 0;
		int prime = 1;
		while (200 != count) {
			flag = 0;
			prime++;
			for (int i = 2; i <= Math.sqrt(prime); i++) {
				if (prime % i == 0)
					flag = 1;
			}
			if (flag == 0) {
				count++;
			}
		}
		System.out.println(prime);

	}

}
