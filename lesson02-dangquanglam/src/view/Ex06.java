package view;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 0, 0, 0 };
		for (int i = 0; i < 3; i++) {
			boolean valid = false;
			String input = "";
			while (!valid) {
				System.out.println("Nhập số thứ " + (i + 1) + ":");
				input = sc.nextLine();
				if (checkDigit(input)) {
					valid = true;
				} else {
					System.out.println("Giá trị không hợp lệ, vui lòng nhập lại");
				}
			}
			arr[i] = Integer.parseInt(input);
		}

		int max = Math.max(arr[0], Math.max(arr[1], arr[2]));
		int min = Math.min(arr[0], Math.min(arr[1], arr[2]));

		System.out.println("Số lớn nhất là " + max);
		System.out.println("Số nhỏ nhất là " + min);
	}

	public static boolean checkDigit(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < '0' || s.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
}
