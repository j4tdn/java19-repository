package ex04;

import java.util.HashMap;
import java.util.Map;

public class Ex04 {
    public static void main(String[] args) {
		String string  = "aaaababbbddc";
		
		Map<Character, Integer> CountMap = new HashMap<>();
		for (char c : string.toCharArray()) {
			CountMap.put(c, CountMap.getOrDefault(c, 0) + 1);
		}
		System.out.println(CountMap);
		
		char maxAppearChar = ' ';
		int maxAppear = 0;
		for(Map.Entry<Character, Integer> entry : CountMap.entrySet()) {
			if(entry.getValue() > maxAppear) {
				maxAppear = entry.getValue();
				maxAppearChar = entry.getKey();
			}
		}
		System.out.print("Ky tu xuat hien nhieu nhat la: " + maxAppearChar);
		
	}
}
