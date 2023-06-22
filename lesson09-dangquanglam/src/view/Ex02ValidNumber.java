package view;

import java.util.Arrays;

public class Ex02ValidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] elements = {"aa01a2b3456cde478a", "aa01a2b3456cde478a" };

		for (String element : elements) {
			String[] numbersAsString = getValidNumbersAsString(element);
			int max = max(numbersAsString);
			System.out.println(Arrays.toString(numbersAsString) + "--->" + max);
		}
	}

	private static String[] getValidNumbersAsString(String s) {
		String[] numbersAsString = new String[s.length()/2];
 		int running = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(Character.isDigit(s.charAt(0)) ? s.charAt(0) : "");
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (Character.isDigit(letter)) {
				sb.append(letter);
				if (i == s.length() - 1) {
					numbersAsString[running++] = sb.toString();
				}
			} else {
				if (Character.isDigit(s.charAt(i - 1))) {
					numbersAsString[running++] = sb.toString();
					sb.delete(0, sb.length());
				}
			}
		}
		return Arrays.copyOfRange(numbersAsString, 0, running);
	}

	private static int max(String[] numbersAstring) {
		int max = Integer.MIN_VALUE;
		for (String numberAString : numbersAstring) {
			int number = Integer.parseInt(numberAString);
			if (max < number) {
				max = number;
			}
		}
		return max;
	}

}
