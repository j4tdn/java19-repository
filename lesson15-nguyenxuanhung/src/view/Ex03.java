package view;

import java.util.HashMap;
import java.util.Map;

public class Ex03 {
	public static void main(String[] args) {
		String s1 = "word";
		String s2 = "DoRw";
		System.out.println(isAnagram(s1, s2));
	}

	public static boolean isAnagram(String s1, String s2) {
		
		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();

		if (s1.length() != s2.length()) {
			return false;
		}

		Map<Character, Integer> charCountMap = new HashMap();

		for (char c : s1.toCharArray()) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}

		}

		for (char c : s2.toCharArray()) {
			if (!charCountMap.containsKey(c)) {
				return false;
			}

			int count = charCountMap.get(c);
			if (count == 0) {
				return false;
			}
			
			charCountMap.put(c, count - 1);
		}

		return true;
	}
}
