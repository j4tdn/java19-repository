package view.b.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import utils.CollectionUtils;

public class Ex03TreeMapDemo_SortedByKey {
    public static void main(String[] args) {
		Map<Integer, String> weekDays = new TreeMap<>(Comparator.reverseOrder());
		
		weekDays.put(2, "Monday");
		weekDays.put(6, "Friday");
		weekDays.put(3, "Tuesday");
		weekDays.put(5, "Thursday");
		weekDays.put(6, "Wednesday");
		
		CollectionUtils.generate("1A. cac ngay trong tuan", weekDays);

	}
}
