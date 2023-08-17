package view.b.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import utils.CollectionUtils;

public class Ex03TreeMap_SortedByKey {
	public static void main(String[] args) {
		Map<String, Integer> weekDays = new TreeMap<>(Comparator.reverseOrder());
		
		weekDays.put("Honday", 2);

		weekDays.put("Friday", 6);

		weekDays.put("TuesDay", 3);

		weekDays.put("Thursday", 5);

		weekDays.put("Wednesday", 4);

		
		Set<Entry<String, Integer>> entries = weekDays.entrySet();

		List<Entry<String, Integer>> list = new ArrayList<>(entries);

		list.sort(Comparator.comparing(Entry::getValue)); // sort by value asc
		
		CollectionUtils.generate("1A. Các ngày trong tuần", weekDays);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
