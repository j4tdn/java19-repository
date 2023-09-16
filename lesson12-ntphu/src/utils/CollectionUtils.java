package utils;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class CollectionUtils {
	
	private CollectionUtils() {
	}
	
	public static <E> void reset(List<E> elemenets) {
		elemenets.removeAll(elemenets);
	}
	
	public static <E> void generate(String prefix, Collection<E> collection) {
		System.out.println(prefix + " --> {");
		
		for (E element: collection) {
			System.out.println("     " + element);
		}
		
		System.out.println("}\n");
	}
	
	public static <K, V> void generate(String prefix, Map<K, V> map) {
		System.out.println(prefix + " --> {");
		
		for (K key: map.keySet()) {
			System.out.println("     " + key + ", " + map.get(key));
		}
		
		System.out.println("}\n");
	}
	
}