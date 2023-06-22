package Bai4;

import java.util.HashSet;

public class Bai4Demo {
	static HashSet<String> map = new HashSet<String>();
	public static void main(String[] args) {
		permutation("", "xxz"); 
		System.out.println(map.toString());
	}
	
	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) map.add(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
}
