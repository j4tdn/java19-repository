package homework;

import java.util.Scanner;

public class Ex06MinMax {
	public static boolean checkDigit(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < '0' || s.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		int[] arr = { 0, 0, 0 };
		for (int i = 1; i <= 3; i++) {
			String temp = "abc";
			while (!checkDigit(temp)) {
				System.out.println("Nhap so thu " + i + ": ");
				temp = ip.nextLine();
			}
			arr[i - 1] = Integer.parseInt(temp);
		}
		System.out.println("So lon nhat la: " + Math.max(arr[0], Math.max(arr[1], arr[2])));
		System.out.println("So nho nhat la: " + Math.min(arr[0], Math.min(arr[1], arr[2])));
	}
}
