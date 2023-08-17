package utils;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionUtils {
	private CollectionUtils() {
		
	}
	
	public static <K, V> void generate(String prefix, List<Entry<K,V>> map) {
		System.out.println(prefix );
		
	}
	public static <K, V> void generate(String prefix, Map<K, V> map) {
		System.out.println(prefix );
		for(K key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
	}
}
