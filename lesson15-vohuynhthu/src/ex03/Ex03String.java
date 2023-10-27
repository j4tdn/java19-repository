package ex03;

import java.util.Arrays;

public class Ex03String {
  public static void main(String[] args) {
	String a = "Word1";
	String b = "orWd";
	
	
	if(a.length() != b.length()) {
		System.out.println("Chuoi a khong phai la dao ngu cua b");
	};
	System.exit(0);
	System.out.print("Chuoi a co phai la dao ngu cua b khong: "+ isReverse(a, b));
	
	
	
  }
  public static boolean isReverse(String str1, String str2) {
	  str1 = str1.toLowerCase().replaceAll("\\s", "");
	  str2 = str2.toLowerCase().replaceAll("\\s", "");
	  
	  char[] str1Arr = str1.toCharArray();
	  char[] str2Arr = str2.toCharArray();
	  
	  Arrays.sort(str1Arr);
	  Arrays.sort(str2Arr);
   
    return Arrays.equals(str1Arr, str2Arr);

	  
  }
}
