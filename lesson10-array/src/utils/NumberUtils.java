package utils;

public class NumberUtils {
	
	private NumberUtils() {
		
	}
	
	// 'nb -> nb % 2 == 0' <==> ClassOwner::isEven
	// thay thế lambda(method) = static method reference
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	public static boolean isPrime(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isHappy(int number) {
		int[] storage = new int[1000];
		int storageCount = 0;
		while(number != 1) {
			if (isExists(storage, number, storageCount)) {
				return false;
			}
			storage[storageCount++] = number;
			number = sumOfSquare(number);
		}
		return true;
	}
	
	public static boolean isExists(int[] elements, int checkNumber, int realCounter) {
		for (int i = 0; i < realCounter; i++) {
			if (elements[i] == checkNumber) {
				return true;
			}
		}
		return false;
	}
	
	public static int sumOfSquare(int number) {
		int sum = 0;
		String numberAsString = String.valueOf(number);
		for (int i = 0; i < numberAsString.length(); i++) {
			int digit = Integer.parseInt(numberAsString.charAt(i) + "");
			sum = sum + digit*digit;
		}
		return sum;
	}
}
