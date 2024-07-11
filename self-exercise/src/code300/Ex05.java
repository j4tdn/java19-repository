package code300;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	String str = "A man, a plan, a canal: Panama";
	System.out.println(isPalidrome(str));
	
//	System.out.println("Nhập chuỗi: ");
//	String str = ip.nextLine();
}
private static boolean isPalidrome(String str) {
	str = str.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();
	str = str.replaceAll("[\\s+]", "");
	System.out.println(str);
	String s1 = reverseString(str);
	System.out.println(s1);
	//System.out.println(Arrays.toString(charArray));
	//Arrays.sort(charArray);
	if(s1.equals(str)) {
		return true;
	}else {
		return false;
	}
	
}
private static String reverseString(String s) {
	  StringBuilder reversed = new StringBuilder(s);
	  return reversed.reverse().toString();
}

}

