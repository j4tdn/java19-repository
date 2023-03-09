package homework;

import java.util.Scanner;

public class Ex02CheckExponential {
	public static boolean checkDigit(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) < '0' || s.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
	public static boolean checkExponential(int a) {
		if(a == 0 || a == 1) return true;
		int x = a / 2;
		if(a % 2 == 1) return false;
		return checkExponential(x);
	}
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String temp = "abc0";
		int i = 0;
		while (!checkDigit(temp)) {
			System.out.println("Nhap so: ");
			temp = ip.nextLine();
			i++;
			if (i == 5) {
				System.out.println("Gia tri khong hop le!");
				break;
			}
		}
		if (i < 5) {
			System.out.println(checkExponential(Integer.parseInt(temp)));
		}
	}
}
