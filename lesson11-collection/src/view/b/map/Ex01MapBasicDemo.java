package view.b.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01MapBasicDemo {

	public static void main(String[] args) {
		Map<Integer, String> vehicleModelMap = new HashMap<>();
		vehicleModelMap.put(92, "Quảng Nam");
		vehicleModelMap.put(43, "Đà Nẵng");
		vehicleModelMap.put(75, "Thừa Thiên Huế");
		vehicleModelMap.put(74, "Quảng Trị");
		
		print("vehicleModelMap", vehicleModelMap);
		
		vehicleModelMap.put(43, "ĐN");
		vehicleModelMap.putIfAbsent(92, "QN");

		print("vehicleModelMap", vehicleModelMap);

	}
	
	private static void print(String prefix, Map<Integer,String> map) {
		System.out.println("\n" + prefix);
		
		Set<Entry<Integer,String>> entries  = map.entrySet();
		
		for(Entry<Integer, String> entry:entries) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}
	
}
