package controlling;

import java.util.Scanner;

public class Ex04Valication {

	public static void main(String[] args) {
		// Nhập xuất số nguyên
		// ip.nextInt(): trôi lệnh
		// Interger.pareseInt(ip.nextLine()): không bị trôi lệnh
		// Yêu cầu :
		// Nhập số nguyên n
		// + Nhập số những người dùng nhập chữ, kí tự đặc biệt
		// kiểm tra n có phải là số nguyên tố
		Scanner ip = new Scanner(System.in);
		String text = "";
		// kiểm tra hợp lệ:
		do {
			System.out.print("Nhập số nguyên n: ");
			text = ip.nextLine();
		} while (!isValidNumber(text));

		int n = Integer.parseInt(text);
		System.out.println("Nhập thành công, Số n: " + n);
		// Kiểm tra số nguyên tố:
		
		System.out.println(isPrime(n)?"N là số nguyên tố":"N không là số nguyên tố");

	}

	private static boolean isValidNumber(String ip) {
		int textLength = ip.length();
		for (int i = 0; i < textLength; i++) {
			char letter = ip.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
	private static boolean isPrime(int ip) {
		
		for(int i=2;i<=ip/2;i++) {
			if(ip%i==0) {
				return false;
			}
		}
		return true;
	}
}
