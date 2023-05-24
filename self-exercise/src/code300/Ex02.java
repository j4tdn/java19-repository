package code300;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String s = "";
		System.out.println("Nhập s");
		s = ip.nextLine();
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {
		if(s.length() % 2 == 1) {
			return false;
		}else {
			for(int i = 0; i < s.length(); i+= 2) {
				if(couple(s.charAt(i), s.charAt(i + 1)) == false) {
					return false;
				}
			}
			
		}
		return true;
	}
	private static boolean couple(char a, char b) {
		if(a == '(' && b == ')') {
			return true;
		}else if(a == '[' && b == ']') {
			return true;
		}else if(a == '{' && b == '}') {
			return true;
		}
		return false;
	}
}
