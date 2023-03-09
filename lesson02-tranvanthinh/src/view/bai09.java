package view;

public class bai09 {
	public static void main(String[] args) {
		System.out.println(prime200Th());
	}
	private static int prime200Th() {
		int count = 0;
		for(int i = 2; ; i++) {
			if(bai08.isPrime(i))
				count++;
			if(count == 200) return i;
		}
	}
}
