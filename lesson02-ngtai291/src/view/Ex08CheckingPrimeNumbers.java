package view;

public class Ex08CheckingPrimeNumbers {
	public static void main(String[] args) {
		int numToChecking = 7;
		System.out.println("Checking prime number " + numToChecking 
				+ " --> " + checkingPrimeNumber(numToChecking)) ;
		
	}
	
	
	private static boolean checkingPrimeNumber(int number) {
		for(int i = 2; i <= number / 2; i ++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
