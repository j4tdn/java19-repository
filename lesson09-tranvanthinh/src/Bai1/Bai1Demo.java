package Bai1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Bai1Demo {
	private static HashMap<Integer, Integer> hashMap = new HashMap<>();

	public static void main(String[] args) {
		int a[] = { 2, 8, 9, 1, 6 };
		int b[] = { 2, 1, 1, 8, 9 };
		findDupes(a, b);
	}
	
	public static void findDupes(int[] a, int[] b) {
	    HashSet<Integer> map = new HashSet<Integer>();
	    HashSet<Integer> rs = new HashSet<Integer>();
	    for (int i : a)
	        map.add(i);
	    for (int i : b) {
	        if (map.contains(i))
	        	rs.add(i);
	    }
	    System.out.println(rs.toString());
	}

}