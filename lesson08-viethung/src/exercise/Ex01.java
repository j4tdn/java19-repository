package exercise;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = null;
		while (true) {
			s = sc.nextLine();
			if (s.matches(".*[^!@#$%^&*()_+-={}|\\:;'<>,.?/]")) {
				break;
			}
			System.out.println("Invalid input. Re-enter !!!");
		}
		// 1.In ra mỗi kí tự trên một dòng
//		for (int i = 0; i < s.length(); i++) {
//			System.out.println(s.charAt(i));
//		}
		// 2. In ra mỗi từ trên mỗi dòng
		String temp[] = s.split("\\s+");
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		// In ra chuỗi đảo ngược theo kí tự
//		for(int i = s.length(); i > 0; i--) {
//			System.out.print(s.charAt(i - 1));
//		}
		// In ra chuỗi đảo ngược theo từ
		String temp = s;
		String[] token = temp.split("\\s");
		StringBuilder str = new StringBuilder(temp);
		
		for(int i = str.length(); i > 0; i--) {
			System.out.print(str.reverse().toString());
		}
	}
}
