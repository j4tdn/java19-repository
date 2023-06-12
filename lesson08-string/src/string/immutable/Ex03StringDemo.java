package string.immutable;

import java.util.Arrays;

public class Ex03StringDemo {
	public static void main(String[] args) {
//		1 tinh do dai chuoi
//		2 noi chuoi s1 nào s
//		3 lấy 1 kí tự tại vt 3
//		duyet tung ki tu tu trong chuoi
//		tim vi tri xuat hien dau tien va cuoi cung của "a"
		
		String s = "hello word, my name is teo";
		String s1= ", nice to see you all";
		System.out.println(s.length());
//		System.out.println(s + s1);
		System.out.println(s.concat(s1));
		System.out.println(s.charAt(3));
		loopChars(s+s1);
		loopWords(s+s1);
		
	}
	private static void loopChars(String s) {
		for( int i = 0; i<s.length(); i++) {
			System.out.println(s.charAt(i)+ "-");
		}
		System.out.println();
	}
	private static void loopWords(String s) {
		String[] tokens = s.split("[\\s,]+");
//		System.out.println("token -->" + Arrays.toString(tokens));
		for(String token: tokens) {
			System.out.println("|||"+ token + "|||");
		}
	}

}
