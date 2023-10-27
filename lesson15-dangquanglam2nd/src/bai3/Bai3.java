package bai3;

import java.util.ArrayList;

public class Bai3 {
	public static void main(String[] args) {
        System.out.println("aaaababbbddc -> " + findMaxChar("aaaababbbddc") );
        System.out.println("aaaccdcee ->" +findMaxChar("aaaccdcee"));
    }

    public static ArrayList<Character> findMaxChar(String str ) {
        int[] frequencies = new int[256];
        int maxFrequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            frequencies[c]++;
            if (frequencies[c] > maxFrequency) {
                maxFrequency = frequencies[c];
            }
        }

        ArrayList<Character> maxChars = new ArrayList<>();

        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] == maxFrequency) {
                maxChars.add((char) i);
            }
        }

        return maxChars;
    }
}
