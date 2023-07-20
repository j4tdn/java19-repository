package view;

import java.util.Arrays;

import functional.NumbersCondition;
import functional.StringsCondition;
import utils.ArrayUtils;

public class Ex04 {
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };
		System.out.println("The origin array String : " + Arrays.toString(strings));
		sortString(strings, (s1, s2) -> {
			if (s1 == null) {
				return true;
			}
			if (s2 == null || s1 == "Special") {
				return false;
			}
			if (s2 == "Special") {
				return s1.compareTo(s2) < 0;
			}
			return s1.compareTo(s2) > 0;
		}, (num1, num2) -> {
			return num1 > num2;
		});
		System.out.println("The origin array String after sorting ASC : " + Arrays.toString(strings));
		
		sortString(strings, (s1, s2) -> {
			if (s1 == null) {
				return false;
			}
			if (s2 == null || s1 == "Special") {
				return true;
			}
			if (s2 == "Special") {
				return s1.compareTo(s2) < 0;
			}
			return s1.compareTo(s2) < 0;
		}, (num1, num2) -> {
			return num1 < num2;
		});
		System.out.println("The origin array String after sorting DESC : " + Arrays.toString(strings));
	}

	private static void sortString(String[] strings, StringsCondition stringCondition,
			NumbersCondition numberCondition) {
		for (int i = 0; i < strings.length; i++) {
			for (int j = 0; j < strings.length - i - 1; j++) {
				if (stringCondition.check(strings[j], strings[j + 1])) {
					ArrayUtils.swap(strings, j, j + 1);
				}
				if (strings[j] != null && strings[j + 1] != null) {
					if (checkInt(strings[j]) && checkInt(strings[j + 1])) {
						if (numberCondition.check(Integer.parseInt(strings[j]), Integer.parseInt(strings[j + 1]))) {
							ArrayUtils.swap(strings, j, j + 1);
						}
					}
				}
			}
		}
	}

	private static boolean checkInt(String numAsString) {
		if (numAsString.matches("^-?\\d+$")) {
	        return true;
	    }
	    return false;
	}
}
