package exam;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
        String input = "xyz";
        List<String> permutations = findPermutations(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + permutations);
    }

    public static List<String> findPermutations(String input) {
        List<String> permutations = new ArrayList<>();
        generatePermutations("", input, permutations);
        return permutations;
    }

    private static void generatePermutations(String prefix, String input, List<String> permutations) {
        if (input.length() == 0) {
            permutations.add(prefix);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            String newPrefix = prefix + currentChar;
            String newRemaining = input.substring(0, i) + input.substring(i + 1);
            generatePermutations(newPrefix, newRemaining, permutations);
        }
    }
}

