package code300;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in); 
	String st;
	System.out.println("Nhập số phần tử của mảng");
	int n = ip.nextInt();
	String []sts = new String[n];
 	while(true) {
	try {
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập chuỗi thứ " + i);
			sts[i] = ip.next();
			System.out.println("Các phần tử đó là: ");
			for(String e : sts) {
			System.out.println(e);
			}
		}
		System.out.println("các phần tử chung là: " + longestCommonPrefix(sts));
		break;
			}
		
	catch(IllegalArgumentException e) {
		System.out.println(e.getMessage());
	}
}
 	}
public static String longestCommonPrefix(String[] strs) {
	
	  if(strs == null || strs.length == 0){
          return "";
      }
      
      String prefix = strs[0];
     for (int i = 1; i < strs.length; i++) {
          while (strs[i].indexOf(prefix) != 0) {
              prefix = prefix.substring(0, prefix.length() - 1);
              if (prefix.isEmpty()) {
                  return "";
              }
          }
      }
      return prefix;
}
}

