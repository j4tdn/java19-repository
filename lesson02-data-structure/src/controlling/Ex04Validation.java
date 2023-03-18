package controlling;

import java.util.Scanner;

public class Ex04Validation {
public static void main(String[] args) {
	// ip.nextInt() -> trôi lệnh
	// Integer.pareseInt(ip.nextLine()) -> không bị trôi lệnh
	Scanner ip = new Scanner(System.in); // nhập đầu vào từ bàn phím
	String text = "";
	do {
		System.out.println("Nhập số nguyên n(hợp lệ): ");
		text = ip.nextLine(); // nhận vào dòng string nhập từ bàn phím, kết thúc khi enter
	}while(!isValidNumber(text));
	
	int n = Integer.parseInt(text); // phân tích chuỗi nhập vào thành integer	
	System.out.println("Nhập thành công n = " + n);
	System.out.println(isPrime(n) ? "N là số nguyên tố " : "N không phải là số nguyên tố");
}
	private static boolean isPrime(int input) {
		for (int i = 2; i <= input/2; i++) {
			if (input % i == 0) {
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
			char letter = input.charAt(i); // xét từng kí tự
			if (!Character.isDigit(letter)) // kí tự không phải là số  {
				return false;
			}
		return true;
	}
}

