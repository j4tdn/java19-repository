package view.b.map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex01MapBasicDemo {
public static void main(String[] args) {
	Map<Integer,String> vehicleModeMap = new HashMap<>();
	vehicleModeMap.put(92, "Quảng Nam");
	vehicleModeMap.put(43, "Đà Nẵng");
	vehicleModeMap.put(75, "Thừa Thiên Huế");
	vehicleModeMap.put(74, "Quảng Trị");
	System.out.println("size -> " + vehicleModeMap);
	printf("vehicleModeMap -> ", vehicleModeMap);
	
	System.out.println("map contains -> " + vehicleModeMap.containsKey(75));
	System.out.println("map get -> " + vehicleModeMap.get(75));
	
}
private static void printf(String prefix, Map<Integer, String> map) {
	System.out.println("\n" + prefix);
	Set<java.util.Map.Entry<Integer, String>> entries = map.entrySet();
	for(java.util.Map.Entry<Integer, String> entry: entries) {
		System.out.println(entry.getKey() + " -> " + entry.getValue());
	}
}
}
