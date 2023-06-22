package ex02;

import java.util.Arrays;

public class Ex02Demo {

	public static void main(String[] args) {
		String[] n1 = {"01a2b3456cde478"};
		String[] n2 = {"aa6b546c6e22h", "aa6b326c6e22h"};
		String[] result = getLargestNumbers(n2);
		for (String string:result) {
			System.out.println(string);
			
		}
	}

	public static String[] getLargestNumbers(String ...strings) {
		int[] tempResult = new int[strings.length];
		int[] tempResult2 = null;
		int running = 0;
		for (String string:strings) {
			tempResult[running++] = getMaxValidNumber(string);
		}
		Arrays.sort(tempResult, 0, tempResult.length);
		tempResult2 = Arrays.copyOfRange(tempResult, 0, running);
		String[] result = new String[running];
		int running2 = 0;
		for (int i:tempResult2) {
			result[running2++] = String.valueOf(i);
		}
		return result;
	}
	
	public static int getMaxValidNumber(String string) {
		String maxNumber;
		String tempNumber;
		maxNumber = "0";
		tempNumber = "";
		if (string == "") {
			System.out.println("String is empty!");
		} else {
			for (int i = 0; i < string.length(); i++) {
				if (isInteger(string.charAt(i))) {
					tempNumber += string.charAt(i);
					if (Integer.parseInt(maxNumber) < Integer.parseInt(tempNumber)) {
						maxNumber = tempNumber;

					}
				} else {
					tempNumber = "";
					continue;
				}
			}
		}

		return (int) Integer.parseInt(maxNumber);
	}

	public static boolean isInteger(char c) {
		if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8'
				|| c == '9') {
			return true;
		} else {
			return false;
		}
	}
}
