package ex02;

import java.util.Arrays;

public class Ex02LargestNumber {

	public static void main(String[] args) {
		String[] elements = { "01a2b3456cde478", "aa432aa6b546c6e22h321", "aa43aa6b326c6e22h43", "wefwaef" };
		int[] result = getArrayNumbers(elements);
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
	}

	private static int[] getArrayNumbers(String[] chains) {
		int[] results = new int[chains.length];
		int running = 0;
		for (String chain : chains) {
			results[running++] = getLargestNumbers(chain);
		}
		return results;
	}

	private static int getLargestNumbers(String s) {
		String[] words = s.split("\\D+");
		int biggestNumber = 0;
		int temp = 0;
		for (String word : words) {
			if (!"".equals(word))
				temp = Integer.parseInt(word);
			if (temp > biggestNumber)
				biggestNumber = temp;
		}
		return biggestNumber;
	}

}
