package utils;

public class NumberUtils {
	
	private NumberUtils(){
	}
	
	private static boolean isPrimeNumber(int number) {
		if(number == 0 || number == 1) {
			return false;
		}
		for(int i = 2; i < Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
}
