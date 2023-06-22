package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		String[] elements = { "aa6b546c6e22h", "aa6b326c6e22h"};
		int[] result = new int[elements.length];
		for(int i = 0; i < elements.length; i++) {
			result[i] = findMaxDigit(elements[i]);
		}
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
	}

	private static int findMaxDigit(String s) {
		String[] result = s.split("[a-z]+");
		int max = -1;
		for (String temp : result) {
			if (temp.matches("\\d+")) {
				max = Math.max(max, Integer.parseInt(temp));
			}
		}
		return max;
	}
}
