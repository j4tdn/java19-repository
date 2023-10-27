package ex04;

import java.util.HashMap;
import java.util.Map;

public class Ex04 {
public static void main(String[] args) {
		
		String input = "aaaccdcee"; 

        char[] characters = input.toCharArray(); 
        Map<Character, Integer> frequencyMap = new HashMap<>();

        
        for (char c : characters) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        int maxFrequency = 0;
        StringBuilder mostFrequentCharacters = new StringBuilder();

        
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentCharacters = new StringBuilder();
                mostFrequentCharacters.append(entry.getKey());
            } else if (frequency == maxFrequency) {
                mostFrequentCharacters.append(", ").append(entry.getKey());
            }
        }

        
        System.out.println("The character that appears the most times in the string: " + mostFrequentCharacters);
    }
}
