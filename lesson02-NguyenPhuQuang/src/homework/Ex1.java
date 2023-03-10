package homework;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
		 * Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N
		 * không hợp lệ (tối đa 5 lần) VD: Nhập N = abc  báo lỗi, yêu cầu nhập lại
		 * 
		 * = 4  true = 6  true = 7  false
		 */
		System.out.println("Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không\r\n"
				+ "Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ (tối\r\n"
				+ "đa 5 lần)\r\n" + "VD: Nhập N = abc  báo lỗi, yêu cầu nhập lại\r\n" + "\r\n" + "= 4  true\r\n"
				+ "= 6  true\r\n" + "= 7  false\n\n" + "===========");
		

		int n = inputPositiveNumber();

		if (isEvenNumber(n) == true) {
			System.out.println(n + " là số chẵn.");
		} else {

			System.out.println(n + " là số lẻ.");
		}

	}

	public static boolean isPositiveInt(String input) {
		if (input == "") {
			return false;
		} else {

			for (int i = 0; i < input.length(); i++) {
				if ((input.charAt(i) < '0') || (input.charAt(i) > '9')) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isEvenNumber(int input) {
		if (input % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int inputPositiveNumber() {
		int errorCounter = 0; // đếm số lần nhập sai
		String input;

		Scanner ip = new Scanner(System.in);

		do {
			System.out.println("Nhập số nguyên dương N");
			input = ip.nextLine();
			// Kiểm tra ip
			if (isPositiveInt(input)) {
				System.out.println("Nhập thành công");
				break;
			} else {
				errorCounter++;
				System.out.println("Bạn nhập sai " + errorCounter + " lần");
			}

		} while (errorCounter < 5);
		
		return Integer.parseInt(input);
	}
	
	public static String inputTwoDigitsNumber() {
		int errorCounter = 0; // đếm số lần nhập sai
		String input;

		Scanner ip = new Scanner(System.in);

		do {
			System.out.println("Nhập số nguyên dương N có 2 chữ số");
			input = ip.nextLine();
			// Kiểm tra ip
			if (isPositiveInt(input)) {
				if (Integer.parseInt(input) > 9){
					System.out.println("Nhập thành công");
					break;
				}
				errorCounter++;
				System.out.println("Bạn nhập sai " + errorCounter + " lần");
			} else {
				errorCounter++;
				System.out.println("Bạn nhập sai " + errorCounter + " lần");
			}

		} while (errorCounter < 5);
		
		return input;
	}
}
