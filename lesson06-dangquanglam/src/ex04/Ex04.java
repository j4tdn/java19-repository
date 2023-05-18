package ex04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		while (count <= 0) {
		    try {
		        System.out.print("Nhập số lượng số cần đọc: ");
		        count = sc.nextInt();
		        if (count <= 0) {
		            System.out.println("Số lượng số cần đọc phải là số nguyên dương.");
		        }
		    } catch (InputMismatchException e) {
		        System.out.println("Số lượng số cần đọc phải là số nguyên.");
//		        sc.nextLine();
		    }
		}

		int[] numbers = new int[count];
		for (int i = 0; i < count; i++) {
		    while (true) {
		        try {
		            System.out.printf("Nhập số thứ %d: ", i + 1);
		            numbers[i] = sc.nextInt();
		            break; // nếu nhập thành công thì thoát vòng lặp
		        } catch (InputMismatchException e) {
		            System.out.println("Số cần đọc phải là số nguyên.");
		            sc.nextLine(); // đọc luôn ký tự xuống dòng để tránh bị lặp vô hạn
		        }
		    }
		}

		for (int i = 0; i < count; i++) {
		    String result = readNumber(numbers[i]);
		    System.out.printf("Số %d đọc là: %s\n", numbers[i], result);
		}
	}

	public static String readNumber(int num) {
		String[] ones = { "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };
		String[] tens = { "", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi",
				"chín mươi" };
		String[] hundreds = { "", "một trăm", "hai trăm", "ba trăm", "bốn trăm", "năm trăm", "sáu trăm", "bảy trăm",
				"tám trăm", "chín trăm" };

		String numStr = Integer.toString(num);
		String result = "";

		if (num == 0) {
			return "Không";
		} else if (num < 10) {
			return ones[num];
		} else if (num < 20) {
			if (num == 10) {
				result = "Mười";
			} else {
				result = "Mười " + ones[num - 10];
			}
		} else if (num < 100) {
			result = tens[num / 10];
			if (num % 10 != 0) {
				result += " " + ones[num % 10];
			}
		} else if (num < 1000) {
			result = hundreds[num / 100];
			if (num % 100 != 0) {
				result += " " + (num % 100 < 10 ? "lẻ " + ones[num % 10]
						: (num % 100 < 20) ? "mười " + ones[num % 10] : tens[num / 10 % 10] + " " + ones[num % 10]);
			}
		}

		return result;
	}
}
