package view;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Ex04 {
	public static void main(String[] args) {
		String inputString = "aaaccdcee";

		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		for (char c : inputString.toCharArray()) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		Map<Character, Integer> sortedMap = charCountMap.entrySet().stream()
				.sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		int maxValue = sortedMap.entrySet().stream().findFirst().map(Entry::getValue).orElse(0);

		sortedMap.entrySet().stream().filter(e -> e.getValue() == maxValue)
				.forEach(e -> System.out.print(e.getKey() + " "));
	}

}
