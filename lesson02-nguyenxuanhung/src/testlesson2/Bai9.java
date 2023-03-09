package testlesson2;

public class Bai9 {
	private static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

//	private static int primeAtIndex(int Index) {
//		int index = 1;
//		int res = 2;
//		do {
//			if(isPrime(res)) {
//				index++;
//			}
//			res++;
//		} while (index <= Index);
//		
//		return res - 1;
//	}

	private static int primeAtIndex200() {
		int index = 1;
		int res = 2;
		do {
			if (isPrime(res)) {
				index++;
			}
			res++;
		} while (index <= 200);

		return res - 1;
	}

	public static void main(String[] args) {
//		System.out.println(primeAtIndex(3));
		System.out.println(primeAtIndex200());

	}
}
