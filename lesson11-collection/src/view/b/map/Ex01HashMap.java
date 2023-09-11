package view.b.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01HashMap {
    public static void main(String[] args) {
		Map<Integer, String> vehicleModelMap = new HashMap<>();
		
		vehicleModelMap.put(92, "Quang Nam");
		vehicleModelMap.put(43, "Da Nang");
		vehicleModelMap.put(75, "Thua Thien Hue");
		vehicleModelMap.put(74, "Quang Tri");
		
		vehicleModelMap.put(43, "DN");
		vehicleModelMap.putIfAbsent(92, "QN");
		vehicleModelMap.remove(74);
		vehicleModelMap.put(73, "Quang Binh");

		System.out.println("size: " + vehicleModelMap.size());
		printf("vehiclesModeMap --> ", vehicleModelMap);
		System.out.println("map contains --> " + vehicleModelMap.containsKey(75));
		System.out.println("map get --> " + vehicleModelMap.get(75));
		

	}
    private static void printf(String prefix, Map<Integer, String> map) {
    	System.out.println("\n" + prefix);
    	
    	Set<Entry<Integer, String>> entries = map.entrySet();
    	for(Entry<Integer, String> entry: entries) {
    		System.out.println(entry.getKey() + "--> " + entry.getValue());
    	}
    }
}
