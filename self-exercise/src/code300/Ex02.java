package code300;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String s = "";
		System.out.println("Nhập s");
		s = ip.nextLine();
		isValid(s);
	}

	public static boolean isValid(String s) {
		if (s == "()" || s == "{}" || s == "[]") {
			return true;
		} else {
			return false;
		}
	}
}
