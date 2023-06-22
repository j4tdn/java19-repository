package view;

import java.util.HashSet;
import java.util.Set;

public class AllPermutationOfString {
    private static Set<String> permutations = new HashSet<>();

    public static void main(String[] args) {
        String input = "aabbcc";
        String[] allPermutations = getAllPermutation(input);

        for (String permutation : allPermutations) {
            System.out.println(permutation);
        }
    }

    private static String[] getAllPermutation(String s) {
        generatePermutations("", s);
        return permutations.toArray(new String[0]);
    }

    private static void generatePermutations(String prefix, String suffix) {
        int n = suffix.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                String newPrefix = prefix + suffix.charAt(i);
                String newSuffix = suffix.substring(0, i) + suffix.substring(i + 1);
                generatePermutations(newPrefix, newSuffix);
            }
        }
    }
}