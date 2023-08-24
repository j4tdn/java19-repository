package view.c.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import utils.CollectionUtils;

public class Ex01BasicDemo {
	
	/*
	 * List<E>
	 *    --> mỗi phần tử kiểu E
	 * 	  --> các phần tử(E) có thể trùng nhau
	 *    --> ArrayList, LinkedList
	 *        remove, contains --> override equals
	 *
	 * Map<K, V>
	 *    --> mỗi phần tử kiểu Entry<K, V>
	 *    --> các phần tử(entry) không được chứa key trùng nhau
	 *        hashcode/equals của K
	 *    --> HashMap, TreeMap, LinkedHashMap
	 *
	 * Set<E>
	 *    --> mỗi phần tử kiểu E
	 *    --> các phần tử(E) không được phép trùng nhau
	 *        hashcode/equals của E
	 *    --> HashSet, TreeSet, LinkedHashSet
	 *    
	 * Set
	 *   Map
	 *   
	 * set.add(e)
	 *   --> map.put(e, PRESENT)
	 */
	
	public static void main(String[] args) {
		
		// Set.of, Map.of
		// Set<Integer> numbers = new HashSet<>();
		// Set<Integer> numbers = new LinkedHashSet<>();
		Set<Integer> numbers = new TreeSet<>(Comparator.reverseOrder());
		numbers.add(14);
		numbers.add(22);
		numbers.add(18);
		numbers.add(99);
		numbers.add(77);
		CollectionUtils.generate("1A LOG >> numbers", numbers);
		
		// require sort
		// --> sử dụng TreeSet
		// --> chuyển đổi sang List --> sorting --> đưa về lại LinkedHashSet
	}
}