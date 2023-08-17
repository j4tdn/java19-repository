package view.b.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import utils.CollectionUtils;

import static java.util.Comparator.*;

public class Ex04TreeMap_SortedByValue {
	public static void main(String[] args) {

		// mặc định sắp xếp theo key tăng dần
		Map<String, Integer> weekDays = new TreeMap<>();

		weekDays.put("Monday", 2);
		weekDays.put("Friday", 6);
		weekDays.put("Tuesday", 3);
		weekDays.put("Thursday", 5);
		weekDays.put("Wednesday", 4);

		CollectionUtils.generate("1A. Các ngày trong tuần", weekDays);

		// sắp xếp theo value tăng dần
		// convert map<k, v> --> map.entrySet() --> set<entry<k,v>> --> list<entry<k,v>>
		// --> sort list entries by k/v --> sorted list<entry<k, v>> --> convert/copy in
		// map
		// --> sorted map

		Map<String, Integer> sortedWeekDays = sort(weekDays, comparing(Entry::getValue, reverseOrder()));

		CollectionUtils.generate("LOG >> sortedWeekDays", sortedWeekDays);
	}

	private static Map<String, Integer> sort(Map<String, Integer> map, Comparator<Entry<String, Integer>> comparator) {
		Set<Entry<String, Integer>> entries = map.entrySet();

		List<Entry<String, Integer>> listToBeSorted = new ArrayList<>(entries);

		listToBeSorted.sort(comparator);

		Map<String, Integer> sortedMap = new LinkedHashMap<>();

		for (Entry<String, Integer> entry : listToBeSorted) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}

}