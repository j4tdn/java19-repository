package view.b.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Ex01HashMap {
	public static void main(String[] args) {
		Map<Integer, String> vehicleModelMap = new HashMap<>();
		vehicleModelMap.put(92, "Quảng Nam");
		vehicleModelMap.put(43, "�?à Nẵng");
		vehicleModelMap.put(75, "Thừa Thiên Huế");
		vehicleModelMap.put(74, "Quảng Trị");
		

		vehicleModelMap.put(43, "�?N");
		
		printf("vehicleModeMap", vehicleModelMap);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	private static void  printf(String prefix, Map<Integer, String> map) {
		System.out.println("\n" + prefix);
		Set<Entry<Integer, String>> entries = map.entrySet();
		for(Entry<Integer, String> entry: entries) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
