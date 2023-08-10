package view;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04StringArrayHandling {

	public static void main(String[] args) {

		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "\\", "/", "&", "*", "@", "a", "c", "b", "xx" };

		System.out.println("Original array: " + Arrays.toString(strings));

		Arrays.sort(strings, new CustomStringComparator());

		System.out.println("Ascending order: " + Arrays.toString(strings));

		Arrays.sort(strings, new CustomStringComparator().reversed());

		System.out.println("Descending order: " + Arrays.toString(strings));

	}

}

class CustomStringComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		if (s1 == null && s2 == null) {
			return 0;
		}
		if (s1 == null) {
			return 1;
		}
		if (s2 == null) {
			return -1;
		}

		String specialCharsRegex = "[\\p{Punct}]+";

		if (s1.matches(specialCharsRegex) && !s2.matches(specialCharsRegex)) {
			return -1;
		}
		if (!s1.matches(specialCharsRegex) && s2.matches(specialCharsRegex)) {
			return 1;
		}

		boolean s1IsDigit = isDigit(s1);
		boolean s2IsDigit = isDigit(s2);

		if (s1IsDigit && s2IsDigit) {
			return compareDigits(s1, s2);
		}
		if (s1IsDigit && !s2IsDigit) {
			return -1;
		}
		if (!s1IsDigit && s2IsDigit) {
			return 1;
		}

		return s1.compareTo(s2);

	}

	private int compareDigits(String s1, String s2) {

		  int num1 = Integer.parseInt(s1);
		  int num2 = Integer.parseInt(s2);

		  if (num1 < 0 && num2 < 0) {
		    return Integer.compare(num1, num2);
		  } else if (num1 < 0) {
		    return -1;
		  } else if (num2 < 0) {
		    return 1;
		  } else { 
		    return Integer.compare(num1, num2);
		  }

		}

	private boolean isDigit(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
