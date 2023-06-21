package ex01;

import java.util.Collections;

public class Ex01 {
//	Viết chương trình nhập vào một chuỗi kí tự bất kì sau đó thực hiện các công việc sau :
//		Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.
//		In ra mỗi kí tự trên một dòng
//		In ra mỗi từ trên mỗi dòng
//		In ra chuỗi đảo ngược theo kí tự
//		In ra chuỗi đảo ngược theo từ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello Word";

		// In ra mỗi kí tự trên một dòng

		for (int i = 0; i < s.length(); i++) {
			char character = s.charAt(i);
			if (character != ' ') {
				System.out.print(character + "-");
			}
		}
		System.out.println();

		// In ra mỗi từ trên mỗi dòng
		String[] words = s.split("[\\s,]+");
		for (String word : words) {
			System.out.println(word);
		}
		System.out.println();

		// In ra chuỗi đảo ngược theo kí tự
		StringBuilder sbd = new StringBuilder(s);
		sbd.reverse();
		System.out.println(sbd);

		// In ra chuỗi đảo ngược theo từ
		String[] reversedWords = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			reversedWords[words.length - 1 - i] = words[i];
		}
		String reversedString = String.join(" ", reversedWords);
		System.out.println(reversedString);

	}

}
