package view.b.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import utils.CollectionUtils;

public class Ex04TreeMap_SortedByValue {
	public static void main(String[] args) {
		Map<Integer, String> weekDays = new HashMap<>();

		weekDays.put(2, "Monday");
		weekDays.put(6, "Friday");
		weekDays.put(3, "Tuesday");
		weekDays.put(5, "Thursday");
		weekDays.put(4, "Wednesday");

		CollectionUtils.generate("1A. Các ngày trong tuần", weekDays);
	}

	private static Map<String, Integer> sort(Map<String, Integer> map, Comparator<Entry<String, Integer>> comparator) {
		Set<Entry<String, Integer>> entries = map.entrySet();
		List<Entry<String, Integer>> listToBesorted = new ArrayList<>(entries);
		listToBesorted.sort(comparator);
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Entry<String, Integer> entry : listToBesorted) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

}
