package view.b.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Ex01MapBasicDemo {
	
	public static void main(String[] args) {
		
		// List: contains, remove --> override equals
		// Map
		
		// K = Integer
		// V = String
		// Mỗi phần tử là 1 Entry<K, V>
		
		// Cơ chế
		// Khi put K, V --> hashing(K) lưu trữ hashed đại diện cho K của Entry
		// Khi nào get ra theo K, so sánh hashed để lấy ra
		
		Map<Integer, String> vehicleModelMap = new HashMap<>();
		
		vehicleModelMap.put(92, "Quảng Nam");
		vehicleModelMap.put(43, "Đà Nẵng");
		vehicleModelMap.put(75, "Thừa Thiên Huế");
		vehicleModelMap.put(74, "Quảng Trị");
		
		vehicleModelMap.put(43, "ĐN");
		vehicleModelMap.putIfAbsent(92, "QN");
		
		vehicleModelMap.remove(74);
		vehicleModelMap.put(73, "Quảng Bình");
		
		printf("vehicleModelMap --> ", vehicleModelMap);
		
		System.out.println("map contains --> " + vehicleModelMap.containsKey(75));
		System.out.println("map get --> " + vehicleModelMap.get(75));
	}
	
	private static void printf(String prefix, Map<Integer, String> map) {
		System.out.println("\n" + prefix);
		
		Set<Entry<Integer, String>> entries = map.entrySet();
		
		for (Entry<Integer, String> entry: entries) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}
}
