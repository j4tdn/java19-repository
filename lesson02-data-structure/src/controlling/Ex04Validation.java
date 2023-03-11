package controlling;

import java.util.Scanner;

public class Ex04Validation {
	public static void main(String[] args) {
		//Nhập xuất số nguyên
		//ip.nextInt() --> trôi lệnh
		//Integer.pareseInt(ip.nextInt()) --> không bị trôi lệnh
		
		//yêu cầu: 
		//Nhập vào số nguyên n
		//+ nhập vào nhưng người dùng nhập chữ, ký tự đặc biệt
		
		//kiểm tra xem n có phải là số nguyên tố 
		
		Scanner ip = new Scanner(System.in);
		
		String text = "";
		
		//kiểm tra hợp lệ, có phải là chuỗi số hay không
		// 15     --> ok
		// aff33d --> fail --> aff33d --> length = 6;
		//                    012345 --> chỉ số vị trí của kí tự trong chuỗi
		// 44     --> ok
		// fdf    --> fail
		do {
			System.out.println("Nhập số nguyên n(hợp lệ): ");
			text = ip.nextLine();
		} while(!isValidNumber(text));
		
		
		int n = Integer.parseInt(text);
		
		// Enter --> muoilam[ip.nextLine()] --> Integer.parseInt("muoilam")
		// ==> exception(ngoại lệ) là những lỗi không mong muốn khi thực thi chương trình
		// JAVA sẽ tự động quăng ngoại lệ này ra yêu cầu người dùng thực hiện đúng
		
		//Xử lí: trước khi convert(chuyển đổi) giá trị nhập vào sang int
		//phải kiểm xem giá trị nhập vào đó có phải là 1 dãy số không
		//nếu là dãy số thì gọi Integer.parseInt để chuyển sang int
		//nếu không --> thông báo nhập lại
		
		
		
		System.out.println("Nhập thành công = " + n);
		
		//kiểm tra xem n có phải là số nguyên tố
		
		System.out.println(isPrime(n) ? "N là số nguyên tố" : "N không phải là số nguyên tố");
		
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
			char letter = input.charAt(i);
			//letter < '0' || letter > '9'
			if (Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}	
}
