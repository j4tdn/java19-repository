package demo;

public class Ex03 {
	public static int getMaxValidNumber(String st) {
		int maxValidNumber = -1;
		int currentNumber = 0;

		for (int i = 0; i < st.length(); i++) {
			char c = st.charAt(i);
			if (Character.isDigit(c)) {
				currentNumber = currentNumber * 10 + (c - '0');
			} else {
				if (currentNumber > maxValidNumber && currentNumber >= 0) {
					maxValidNumber = currentNumber;
				}
				currentNumber = 0;
			}
		}
		if (currentNumber > maxValidNumber && currentNumber >= 0) {
			maxValidNumber = currentNumber;
		}

		return maxValidNumber;
	}

	public static void main(String[] args) {
		String str = "12abu02muzk586cyx";
		int largestValidNumber = getMaxValidNumber(str);
		if (largestValidNumber == -1) {
			System.out.println("No valid number found.");
		} else {
			System.out.println("The largest valid number is " + largestValidNumber);
		}
	}
}
