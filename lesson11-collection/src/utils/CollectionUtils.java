package utils;

import java.util.Map;

public class CollectionUtils {
public CollectionUtils() {
}

public static <K, V> void generate(String prefix, Map<String, Integer> weekDays) {
	for(Map.Entry<String, Integer> weekDay : weekDays.entrySet()) {
		prefix = weekDay.getKey();
		Integer value = weekDay.getValue();
		System.out.println(prefix + " -> " + value);
		
	}
}
}
