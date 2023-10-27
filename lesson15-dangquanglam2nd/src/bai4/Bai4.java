package bai4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập chuỗi thứ nhất: ");
		String str1 = sc.nextLine();

		System.out.print("Nhập chuỗi thứ hai: ");
		String str2 = sc.nextLine();

		if (isAnagram(str1, str2)) {
			System.out.println("Hai chuỗi là đảo ngữ của nhau.");
		} else {
			System.out.println("Hai chuỗi không phải là đảo ngữ của nhau.");
		}
	}

	public static boolean isAnagram(String str1, String str2) {
		str1 = str1.toLowerCase().trim();
		str2 = str2.toLowerCase().trim();

		if (str1.length() != str2.length()) {
			return false;
		}

		Map<Character, Integer> charCount = new HashMap<>();
		for (char c : str1.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}

		for (char c : str2.toCharArray()) {
			if (!charCount.containsKey(c) || charCount.get(c) <= 0) {
				return false;
			}
			charCount.put(c, charCount.get(c) - 1);
		}

		return true;
	}
}
