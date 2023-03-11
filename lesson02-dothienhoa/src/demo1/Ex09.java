package demo1;

public class Ex09 {

	public static void main(String[] args) {
		int count = 0;
		int num = 2;
		while (count < 200) {
			boolean isPrime = true;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
			}
			num++;
		}
		System.out.println("Số nguyên tố thứ 200 là: " + (num - 1));
	}

}
