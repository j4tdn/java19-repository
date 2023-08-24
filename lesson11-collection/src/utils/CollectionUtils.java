package utils;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionUtils {
	private CollectionUtils() {
		
	}
	
	public static <K, V> void generate(String prefix, Map<K, V> map) {
		System.out.println(prefix + "---> {");
		
		for(Entry<K, V> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "->>" + entry.getValue());
		}
	}
	
	public static <K> void generate(String prefix, Set<K> set) {
		System.out.println(prefix + "---> {");
		for(K s:set) {
			System.out.println(s);
		}
	}
}
