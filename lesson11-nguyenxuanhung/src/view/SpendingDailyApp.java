package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SpendingDailyApp {
	public static void main(String[] args) {
		Map<String, Integer> dailySpending = mockData();
		
		Map<String, Integer> valueMoreThan500 = spendingDailyMoreThan(500000, dailySpending);
		prinfMap(valueMoreThan500);
		
		System.out.println("---name ASC---");
		prinfMap(sort(dailySpending, Comparator.comparing(e -> e.getKey())));
		
		System.out.println("---Value DESC---");
		prinfMap(sort(dailySpending, Comparator.comparing(e -> e.getValue(), Collections.reverseOrder())));
	}
	
	private static Map<String, Integer> sort(Map<String, Integer> originMap, Comparator<Entry<String, Integer>> comparator){
		Set<Entry<String, Integer>> entries = originMap.entrySet();
		List<Entry<String, Integer>> listToBeSorted = new ArrayList<Map.Entry<String,Integer>>(entries);
		listToBeSorted.sort(comparator);
		Map<String, Integer> mapSorted = new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> entry : listToBeSorted) {
			mapSorted.put(entry.getKey(), entry.getValue());
		}
		return mapSorted;
	}
	
	private static Map<String, Integer> spendingDailyMoreThan(Integer norm, Map<String, Integer> originMap){
		Map<String, Integer> result = new HashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry : originMap.entrySet()) {
			if(entry.getValue() > norm) {
				result.put(entry.getKey(), entry.getValue());
			}
		}
		return result;
	}
	
	public static <K, V> void prinfMap(Map<K, V> map) {
		for (Map.Entry<K, V> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
	
	private static Map<String, Integer> mockData() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Eat", 1000000);
		map.put("Drink", 200000);
		map.put("Gasoline", 300000);
		map.put("Rent", 600000);
		return map;
	}
}
