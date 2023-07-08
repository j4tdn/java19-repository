package test;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		//System.out.println("Nhập chuỗi: ");
		//String s = ip.nextLine();
		String s = "Ngày mai trời sẽ mưa";
		CharInString(s);
		WordOnTheOneLine(s);
		ReversedStringByChar(s);
		ReversedStringByWord(s);
		}
	public static void CharInString(String s) {
		char c = 0;
		for(int i =0; i <= s.length(); i++) {
			 c = s.charAt(i);
			if(c != ' ') {
			 System.out.println(c);
		}
			}
	}
	public static void WordOnTheOneLine(String s ) {
		String[] words = s.split(" "); 
		for(String word : words) {
			System.out.println(word);
		}
	}
	public static void ReversedStringByChar(String s) {
		StringBuilder str = new StringBuilder(s);
		System.out.println(str.reverse().toString());
	}
	public static void ReversedStringByWord(String s) {
		String[] words = s.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
	}
}
