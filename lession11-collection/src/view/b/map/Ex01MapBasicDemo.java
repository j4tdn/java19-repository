package view.b.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ex01MapBasicDemo {
	public static void main(String[] args) {
		Map<Integer, String> vehicleModelMap = new HashMap<>();
		
		vehicleModelMap.put(92, "Quang Nam");
		vehicleModelMap.put(43, "Da Nang");
		vehicleModelMap.put(75, "Thua Thien Hue");
		vehicleModelMap.put(74, "Quang Tri");
		
		printf("vehicleModelMap : " , vehicleModelMap);
	}
	
	private static void printf(String prefix, Map<Integer, String> map) {
		System.out.println("\n" + prefix);
		for(Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}
}
