package code300;

import java.util.Scanner;

public class Ex052 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
//	System.out.println("Nhập chuỗi: ");
//	String str = ip.nextLine();
//	boolean result = isPalindrome(str);
//	System.out.println(result);
	String str = "a.";
	System.out.println(isPalindrome(str));
}
private static boolean isPalindrome(String str) {
	str = str.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();
	char[] charArray = str.toCharArray();
	System.out.println(str);
	int f = 1;
	for(int i = 0; i < (str.length())/2; i++) {
		if(charArray[i] != charArray[str.length() - 1 - i]) {
			f = 0;
		}
		}
	if(f == 1) {
		return true;
	}else {
		return false;
	}
	}
}

