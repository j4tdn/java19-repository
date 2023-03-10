package homework;

public class Ex09_200thPrimeNumber {

	public static void main(String[] args) {
		System.out.println(twoHundredThPrimeNumber());
	}
	
	private static int twoHundredThPrimeNumber() {
		int i = 0;
		int n = 2;
		while(i < 201) {
			if(Ex08CheckPrimeNumber.isPrimeNumber(n)) {
				i++;
			}
			n++;
		}
		return n - 1;
	}
}
