package test;

import java.util.Scanner;

public class Ex05 {

public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	try {
	System.out.println("Nhập xâu s1: ");
	String s1 = ip.nextLine();
	System.out.println("Nhập xâu s2: ");
	String s2 = ip.nextLine();
//	String s1 = "ABCEDEABC";
//	String s2 = "ABCEDCBBCK";
	System.out.println("xâu chung: "  + CommonSubString(s1, s2));
	}catch(IllegalArgumentException i ) {
		System.out.println(i.getMessage());
	
	}
	
}
public static String CommonSubString(String s1, String s2) {
	int n = s1.length();
	int m = s2.length();
	int[][] s = new int[n + 1][m + 1];
	int max = 0;
	String css = "";
	
	  String[] SubString = new String[250];
		if(s1.length() >= 250 && s2.length() >= 250) {
			throw new IllegalArgumentException("Syntax Error 'length' ");
		}
		if(!s1.matches(".*[A-Z].*") && !s2.matches(".*[A-Z].*")) {
			throw new IllegalArgumentException("s1 and s2 should be capital letters!");
		}
		
		
		
	for(int i = 1; i <= n; i++) {
		for(int j = 1; j <= m; j++) {
			if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
				s[i][j] = s[i - 1][j - 1] + 1;
				if(s[i][j] > max) {
				max = s[i][j];
				css += s1.charAt(i - 1);
			}else {
				s[i][j] = Math.max(s[i-1][j], s[i][j -1]);
			}
				
		}
	}
	
	}
	return css;
			}


			
		
	}



