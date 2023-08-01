package view;

import java.util.Arrays;

import functional.StringComparator;
import utils.ArrayUtils;

public class Ex04 {
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };
		
		System.out.println("Origin --> " + Arrays.toString(strings));

		// ASC
		sorting(strings, (s1, s2) -> {
			if (s1 == null && s2 != null) {
				return true;
			}
			if ("Special".equals(s2)) {
				return true;
			}
			if (s2 == null) {
				return false;
			}
			if("Special".equals(s1) && !"Special".equals(s2)) {
				return false;
			}
			if(s1.matches("^-?\\d+$") && s2.matches("^-?\\d+$")) {
				return Integer.parseInt(s1) > Integer.parseInt(s2);
			}
			if(s1.matches("^-?\\d+$") && !s2.matches("^-?\\d+$")) {
				return false;
			}			
			return s1.compareTo(s2) > 0;
		});
		
		System.out.println("ASC -->" + Arrays.toString(strings));
		
		
		//DESC
				sorting(strings, (s1, s2) -> {
					if (s1 == null && s2 != null) {
						return false;
					}
					if ("Special".equals(s2)) {
						return false;
					}
					if (s2 == null) {
						return true;
					}
					if("Special".equals(s1) && !"Special".equals(s2)) {
						return true;
					}
					if(s1.matches("^-?\\d+$") && s2.matches("^-?\\d+$")) {
						return Integer.parseInt(s1) < Integer.parseInt(s2);
					}
					if(s1.matches("^-?\\d+$") && !s2.matches("^-?\\d+$")) {
						return true;
					}			
					return s1.compareTo(s2) < 0;
				});
				System.out.println("DESC --> " + Arrays.toString(strings));
	}

	private static void sorting(String[] strings, StringComparator comparator) {
		for (int i = 0; i < strings.length; i++) {
			for (int j = 0; j < strings.length - i - 1; j++) {
				if (comparator.compare(strings[j], strings[j + 1])) {
					ArrayUtils.swap(strings, j, j + 1);
				}
			}
		}
	}
}
