package exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		System.out.println("Nhập chuỗi:");
		Scanner ip = new Scanner(System.in);
		String input = ip.next();

		Map<Character, Integer> charCounts = new HashMap<>();
		for (char c : input.toCharArray()) {
			if (charCounts.containsKey(c)) {
				charCounts.put(c, charCounts.get(c) + 1);
			} else {
				charCounts.put(c, 1);
			}
		}

		int maxCount = 0;
		List<Character> maxChars = new ArrayList();

		for (char c : charCounts.keySet()) {
			if (charCounts.get(c) > maxCount) {
				maxCount = charCounts.get(c);
				maxChars.clear();
				maxChars.add(c);
			} else if (charCounts.get(c) == maxCount) {
				maxChars.add(c);
			}
		}

		for (char c : maxChars) {
			System.out.print(c + " ");
		}
	}
}
