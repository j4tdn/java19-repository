package controlling;

import java.util.Scanner;

public class Ex04Validation {

	public static void main(String[] args) {
		//Nhập xuất số nguyên
		//ip.nextInt() --< trôi lệnh
		//Integer.parseInt(ip.nextLine()) --> ko bị trôi lệnh
		
		//Yêu cầu: nhập số nguyên n
		// + Nhập số nhưng người dùng ko nhập đúng
		
		
	//	Scanner ip = new Scanner(System.in);
	//	System.out.print("nhập số nguyên n: ");
	//	int n = Integer.parseInt(ip.nextLine());
		
		//Enter --> muoilam(ip.nextLine()) --> Integer.parseInt("muoilam")
		//==> exception: là những lỗi không mong muốn
		//JAVA sẽ tự động quăng ngoại lệ ra cho người dùng thực hiện đúng
		
		
		//Kiểm tra hợp lệ
		// 15 --> OK
		// muoilam15 --> FAIL --->	muoilam15	-->	lenth = 9
		//							0123456789	--> chỉ số vị trí
		Scanner ip = new Scanner(System.in);
		String text = "";
		
		do {
			System.out.println("Nhập số nguyên hợp lệ: ");
			text = ip.nextLine();
		
		} while (!isValidNumber(text));
		
		int n = Integer.parseInt(text);
		System.out.println("Nhập thành công");
	
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
		int textlength = input.length();
		if (textlength == 0) {
			return false;
		}
		for (int i = 0; i < textlength; i++) {
			char letter = input.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
}
