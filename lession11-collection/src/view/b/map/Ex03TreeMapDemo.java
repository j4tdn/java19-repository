package view.b.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import utils.CollectionUtils;

public class Ex03TreeMapDemo {
	public static void main(String[] args) {
		Map<String,Integer> weekeDays = new TreeMap<>(Comparator.reverseOrder());
		
		weekeDays.put("Moday",2);
		weekeDays.put("Friday",6);
		weekeDays.put("Tuesday",3);
		weekeDays.put("Thursday",5);
		weekeDays.put("wednesday",4);
		
		CollectionUtils.generate("1A. Các ngày trong tuần", weekeDays);
	}
	
	private static Map<String, Integer> sort(Map<String, Integer> map, Comparator<Entry<String, Integer>> comparator){
		Set<Entry<String, Integer>> entries = map.entrySet();
	}
}
