package view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập chuỗi: ");
		String input = scanner.nextLine();

		String result = findMostFrequentCharacters(input);
		System.out.println("Ký tự có số lần xuất hiện nhiều nhất trong chuỗi là: " + result);
	}

	public static String findMostFrequentCharacters(String input) {
		input = input.toLowerCase().trim();

		int[] charCount = new int[128];

		for (char c : input.toCharArray()) {
			charCount[c]++;
		}

		int maxCount = 0;
		String result = "";
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > maxCount) {
				maxCount = charCount[i];
				result = String.valueOf((char) i);
			} else if (charCount[i] == maxCount && maxCount > 0) {
				result += ", " + (char) i;
			}
		}

		return result;
	}
}
