package view.b.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Ex01HashMap {
	
	public static void main(String[] args) {
		
		/*
		 
		 Map
		   + không trùng key
		   + hashcode/equals
		 
		 HashMap
		   + key cho phép giá trị null
		   + ko duy trì đúng thứ tự các phần tử đưa vào
		     put(x, y, z) có thể thực tế là z x y
		     
		 TreeMap(sorted map by key)
		   + tự động sắp xếp các phần tử trong map theo key tăng dần
		     --> key không cho phép giá trị null
		     --> key phải implements Comparable<?>
		     
		   + nếu muốn sắp xếp theo key, giảm dần hoặc sắp xếp theo value
		     --> custom(tự sắp xếp lại, có thể dùng lớp thực thi khác của map)
		     
		 LinkedHashMap
		   + key cho phép giá trị null
		   + duy trì đúng thứ tự các phần tử đưa vào
		     put(x, y, z) sẽ được kq là x, y, z
		     
		 ---> Thường sẽ sử dụng HashMap
		 
		 ---> Muốn sắp xếp đảm bảo đúng thứ tự LinkedHashMap
		 
		 ---> Những trường hợp đơn giản muốn sắp xếp theo key TreeMap
		 
		 */
		
		
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
