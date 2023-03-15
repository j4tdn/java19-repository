import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		String text;
		int n = 0;
		for(int i = 1; i <= 5; i++){ 
			System.out.println("Nhập số nguyên n(hợp lệ): ");
			text = ip.nextLine();
			if(isValidNumber(text) == true) {
				n = Integer.parseInt(text);	
			}
			if(i == 5) {
				System.out.println("Đã nhập sai quá 5 lần!");
				System.exit(0);
			}
			if (isValidNumber(text) == true && isPrime(n) == true) {
				break;
			}

			System.out.println("Nhập thành công n = " + n);
			System.out.println(isPrime(n) ? "N là số nguyên tố " : "N không phải là số nguyên tố");
		}
	}

	public static boolean isPrime(int input) {
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
			if (!Character.isDigit(letter))
				return false;
		}
		return true;
	}
}
