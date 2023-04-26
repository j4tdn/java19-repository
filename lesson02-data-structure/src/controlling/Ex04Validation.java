package controlling;

import java.util.Scanner;

public class Ex04Validation {
	public static void main(String[] args) {

		// Nhập xuất số nguyên
		// ip.nextInt()--> trôi lệnh
		// Integer.parseInt(ip.nextLine) --> ko bị trôi

		// Yêu cầu:
		// Nhập vào số nguyên n
		// + Nhập số nhưng người dùng nhập chủ, kí tự đặc biệt

		// Kiểm tra xem n có phải là số nguyên tố

		Scanner sc = new Scanner(System.in);
		
		String text = "";
		
		//kiểm tra hợp lệ , có phải chuỗi nhập vào có phải chuỗi số hay ko
		do {
			System.out.println("Nhập vào số nguyên n: ");
			text = sc.nextLine();
		} while(!isValidNumber(text));
		
		int n = Integer.parseInt(text);
		
		
		//Enter --> ,muoilam[ip.nextLine()] --> Integer.parseInt("muoilam")
		// ==> exception(ngoại lệ) là những lỗi không mong muốn khi thực thi chương trình
		// Java sẽ tự động quang ngoại lệ này ra yêu cầu người dùng thực hiện đúng
		
		//Xử lý: trước khi bị convert(chuyển đổi) giá trị nhập vào sang int
		//phải kiểm tra xem giá trị nhập vào đó có phải là 1 dãy số ko
		//nếu là dãy số thì gọi Integer.parseInt để chuyển sang int
		//nếu ko --> yhoong báo nhập lại
		
		System.out.println("Nhập thành công n = " + n);
		
		System.out.println(isPrime(n) ? "N là số nguyên tố" : "N không phải là số nguyên tố");
	

	}
	
	private static boolean isPrime(int input) {
		for(int i = 2; i <= input/2; i ++) {
			if(input % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean isValidNumber(String input) {
		int textLength = input.length();
		if (textLength == 0) {
			return false;
		}
		for (int i = 0; i < textLength; i++) {
			char letter = input.charAt(i);
			// letter < '0' || letter > '9'
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
}
