package controlling;

import java.util.Scanner;

public class Ex04Validation {
	public static void main(String[] args) {
		// Nhập xuất số nguyên
		// ip.nextInt() --> trôi lệnh
		// Integer.pareseInt(ip.nextLine()) --> ko bị trôi lệnh

		// yêu cầu
		// nhập vào số nguyên n
		// + Nhập số nhưng người dùng nhập chữ, ký tự đặt biệt

		// Kiểm tra xem n có phải là sóo nguyên tố
		Scanner ip = new Scanner(System.in);

		String text = " ";

		// kiểm tra hợp lệ, có phải là chuỗi số hay không
		// 15 --> ok
		// a3333n --> fail --> a333n --> length = 5
		// 01234 --> chỉ vị trí kí tự trong chuỗi
		// 444 --> ok
		// yyy --> fail
		do {
			System.out.print("Nhập số nguyên n(hợp lệ):");
			text = ip.nextLine();
		} while (!isValidNumber(text));

		int n = Integer.parseInt(text);

		// Enter --> muoilam[ip.nextline()]-->Integer.parseInt("muoi lam")
		// ==>exception(ngoại lệ) là những lỗi ko mong muốn khi thực hiện ctr
		// JAVA sẽ tự quăng ngoại lệ này ra ,yêu cầu người dùng thực hiện đúng

		// xử lý: trước khi convert( chuyển đổi) giá trị sang int
		// phải xem giá trị nhập vào đó có pải là 1 dãy số ko
		// nếu là dãy số thì gọi Integer.parseInt để chuyển sang int
		// Nếu ko --> thông báo nhập lại

		System.out.println("Nhập thành công n = " + n);
		
		// Kiểm tra xem n có phải là số nguyên tố hay k
		// n = 33 --> 
	
		System.out.println(isPrime(n) ? "N Là số nguyên tố" : "N ko phải là số nguyên tố");
	}
	private static boolean isPrime(int input) {
		//boolean isPrime  = true;
		for (int i = 2; i <=  input/2; i++) {
			if (input % 2 == 0) {
				return false;
			
			}
		}
		return  true;
	}
	

	private static boolean isValidNumber(String input) {
		int textLength = input.length();
		if (textLength == 0) {
			return false;
		}
		for (int i = 0; i < textLength; i++) {
			char letter = input.charAt(i);
			// nếu ko pải là số
			// letter < '0' || letter > '9'
			if (!Character.isDigit(letter)) {
				return false;
			}

		}
		return true;
	}
}
