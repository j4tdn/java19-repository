package view;

import java.util.*;
import java.util.Map.Entry;
import static java.util.Comparator.*;


public class Temp {
	public static void main(String[] args) {
		Map<String, Integer> weekDays = new TreeMap<>();

		weekDays.put("Monday", 2);
		weekDays.put("Friday", 6);
		weekDays.put("Tuesday", 3);
		weekDays.put("Thursday", 5);
		weekDays.put("Wednesday", 4);
		Map<String, Integer> sorted = sort(weekDays, comparing(Entry::getValue, reverseOrder()));
		for(Entry<String, Integer> entry : sorted.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	private static Map<String, Integer>
	private static Map<String, Integer> sort(Map<String, Integer> map, Comparator<Entry<String, Integer>> comparator) {
		Set<Entry<String, Integer>> entries = map.entrySet();
		List<Entry<String, Integer>> listSort = new ArrayList<>(entries);
		listSort.sort(comparator);
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for(Entry<String, Integer> entry : listSort) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	
}