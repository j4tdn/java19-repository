package org.example;

import java.util.*;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();
        String s = sc.nextLine();
        List<Character>[] arr = new ArrayList[s.length()];
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(Character c : map.keySet()){
            int freq = map.get(c);
            if(arr[freq] == null) arr[freq] = new ArrayList<>();
            arr[freq].add(c);
        }
        for(int i = s.length() - 1; i >= 0; i--){
            if(arr[i] != null){
                for(int val : arr[i]){
                    System.out.print((char)val + " ");
                }
                return;
            }
        }
    }
}
