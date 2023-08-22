package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import util.CollectionUtil;

public class Bai5 {
	
	public static void main(String[] args) {
		Map<String, Integer> map = mockData();
		CollectionUtil.generate("Sort by key", map);
		CollectionUtil.generate("Sort by value", sortByValue(map, Comparator.comparing(Entry::getValue, Comparator.reverseOrder())));
	}
	
	private static Map<String, Integer> sortByValue(Map<String, Integer> map, Comparator<Entry<String, Integer>> comparator) {
		Set<Entry<String, Integer>> entries = map.entrySet();
		
		List<Entry<String, Integer>> listToBeSorted = new ArrayList<>(entries);
		
		listToBeSorted.sort(comparator);
		
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		
		for (Entry<String, Integer> entry: listToBeSorted) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}
	
	public static Map<String, Integer> mockData(){
		Map<String, Integer> map = new TreeMap<String, Integer>();
		map.put("Mua xe", 60);
		map.put("Mua nhà", 200);
		map.put("Lấy vợ", 150);
		map.put("Đầu tư", 50);
		map.put("Mua coin", 70);
		return map;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
