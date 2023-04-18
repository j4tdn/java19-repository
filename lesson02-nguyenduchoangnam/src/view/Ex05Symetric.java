package view;

public class Ex05Symetric {
	public static void main(String[] args) {
		int[] tests = {8, 2320000, 10, 123, 23432, 234432, 787, 8892};
		
		for (int test: tests) {
			// System.out.println("+ is " + test + " a symetric number --> " + isSymetric(String.valueOf(test)));
			System.out.println("+ is " + test + " a symetric number --> " + isSymetric(test));
		}
	}
	
	// Cách 1: Tìm số nghịch đảo của số hiện tại
	// Nếu số nghịch đảo = số hiện tại --> số đối xứng
	private static boolean isSymetric(int input) {
		if (input < 10) {
			System.out.println(">>>> " + input + " is invalid --> At least 2 digits !");
			return false;
		}
		int original = input;
		// B1: Tìm số đối xứng
		int foundSym = 0;
		boolean foundNonZero = false;
		String zeros = ""; // 00
		while(input != 0) {
			if (!foundNonZero) {
				if (input % 10 == 0) {
					zeros += "0";
				} else {
					foundNonZero = true;
				}
			}
			foundSym = foundSym*10 + input%10; // foundSym(232)
			input = input/10; // input(0)
		}
		System.out.println(original + ">----<" + (zeros + foundSym));
		
		// B2: So sánh với số hiện tại
		return foundSym == original;
	}
	
	// Cách 1: Chuyển int -> string --> kiểm tra xem string 
	// có phải là chuỗi đối xứng ko
	// Cặp đối xứng --> i và length - i - 1
	/*
	private static boolean isSymetric(String input) {
		int length = input.length();
		if (length < 2) {
			System.out.println(">>>> " + input + " is invalid --> At least 2 digits !");
			return false;
		}
		for (int i = 0; i < length/2; i++) {
			char left = input.charAt(i);
			char right = input.charAt(length - i - 1);
			if (left != right) {
				return false;
			}
		}
		return true;
	}
	*/
}
