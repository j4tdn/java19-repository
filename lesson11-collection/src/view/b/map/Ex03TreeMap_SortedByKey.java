package view.b.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import utils.CollectionUtils;

public class Ex03TreeMap_SortedByKey {
	
	public static void main(String[] args) {
		
		// sắp xếp theo key tăng/giảm dần
		Map<String, Integer> weekDays = new TreeMap<>(Comparator.reverseOrder());
		
		weekDays.put("Monday", 2);
		weekDays.put("Friday", 6);
		weekDays.put("Tuesday", 3);
		weekDays.put("Thursday", 5);
		weekDays.put("Wednesday", 4);
		
		CollectionUtils.generate("1A. Các ngày trong tuần", weekDays);
		
	}
}
