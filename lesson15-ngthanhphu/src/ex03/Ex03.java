package ex03;

import java.util.HashMap;
import java.util.Map;

public class Ex03 {
	
	public static void main(String[] args) {
		
		String str1 = "Word";
        String str2 = "orWd";

        boolean isAnagram = checkAnagram(str1, str2);

        if (isAnagram) {
            System.out.println("The two strings are anagrams");
        } else {
            System.out.println("The two strings aren't anagrams");
        }
		
	}
	public static boolean checkAnagram(String str1, String str2) {
        
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");

       
        if (str1.length() != str2.length()) {
            return false;
        }

        
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) - 1);
        }

        
        for (int count : charCountMap.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
		
		
}
