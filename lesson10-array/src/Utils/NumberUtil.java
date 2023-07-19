package Utils;

public class NumberUtil {
	
	public static int Sum(int a, int b) {
		return a + b;
	}
	public static int Subtract(int a, int b) {
		return a - b;
	}
	public static int Multiple(int a, int b) {
		return a * b;
	}
	public static int divide(int a, int b) {
		return a/b;
	}
	
	
	public static boolean isPrime(int number) {
		if(number == 1 || number == 0) {
			return false;
		}
		for (int i = 2; i <= number/2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isHappyNumber(int number) {
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
	
	private static boolean isExists(int[] elements, int checkNumber, int realCounter) {
		for (int i = 0; i < realCounter; i++) {
			if (elements[i] == checkNumber) {
				return true;
			}
		}
		return false;
	}
	
	private static int sumOfSquare(int number) {
		int sum = 0;
		String numberAsString = String.valueOf(number); 
		String[] text = new String[numberAsString.length()]; 
		for (int i = 0; i < numberAsString.length(); i++) {
			String digitAsString = numberAsString.charAt(i) + "";
			int digit = Integer.parseInt(digitAsString);
			sum = sum + digit*digit;
			text[i] = digitAsString + "^2";
		}
		System.out.println(String.join(" + ", text) + " = " + sum);
		return sum;
	}
}
