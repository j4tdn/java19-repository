package test;

import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Nhập họ và tên: ");
	try {
	String s = ip.nextLine();
	CheckName(s);
}catch(IllegalArgumentException e) {
	System.out.println(e.getMessage());
}
	}
private static String CheckName(String s) {
	//s = s.strip();
	String result = "";
	result = result.strip();
	if(!s.matches(".*[A-Za-z].*")) {
		throw new IllegalArgumentException("Nhập sai dữ liệu");
	}
	String[] words = s.split(" ");
	for(String word: words) {
		String firstletter = word.substring(0, 1).toUpperCase();
		String restletter = word.substring(1).toLowerCase();
		result += firstletter + restletter + " ";
	}
	System.out.println("Họ và tên đã được định dạng: " + result);
		
	return result;
	}

}

