package view;

public class Ex07NumberDecimalToBinary {
	public static void main(String[] args) {
		int decimalNumber = 12;
		System.out.println("Decimal number " + decimalNumber
				+ " to binary number is: " + decimalToBinary(decimalNumber));
	}

	private static long decimalToBinary(int decimalNumber) {
		long binaryNumber = 0;
		int x;
		String numberToString = "";
		String binaryNumberToString = "";
		do {
			x = decimalNumber % 2;
			decimalNumber /= 2;
			if(x == 0) numberToString += "0";
			else numberToString += "1";
		}while(decimalNumber != 0);
		for (int i = numberToString.length() - 1 ; i >= 0; i--) {
			binaryNumberToString += numberToString.charAt(i);
		}
		binaryNumber = Long.parseLong(binaryNumberToString);
		return binaryNumber;
	}
}
