package code300;

import java.util.Scanner;

public class Ex12 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Nhập chuỗi s: ");
	String s = ip.nextLine();
	int result = romanToInt(s);
//	System.out.println(romanToInt("III"));
//	System.out.println(romanToInt("IV"));
	System.out.println(result);
}
public static int romanToInt(String s) {
	int result = 0;
	for(int i = 0; i < s.length(); i++) {
		if(i < s.length() - 1 && romanToChar(s.charAt(i)) < romanToChar(s.charAt(i + 1))){
			result -= romanToChar(s.charAt(i));
		}else {
			result += romanToChar(s.charAt(i));
		}
	}
	return result;
}
public static int romanToChar(char c) {
	switch (c) {
	case 'I':
		return 1;
	case 'V':
		return 5;
	case 'X':
		return 10;
	case 'L':
		return 50;
	case 'C':
		return 100;
	case 'D':
		return 500;
	case 'M':
		return 1000;
		
		
	
}
	return 0;
}
}
