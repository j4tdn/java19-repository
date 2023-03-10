package homework;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n;
			boolean isValid = false;

			do {
			    System.out.print("Nhập một số nguyên dương N: ");
			    n = sc.nextInt();
			    if (n > 0) {
			        isValid = true;
			    } else {
			        System.out.println("Số N không hợp lệ. Vui lòng nhập lại.");
			    }
			} while (!isValid);

			if (isPowerOfTwo(n)) {
			    System.out.println(n + " là lũy thừa của 2.");
			} else {
			    System.out.println(n + " không phải là lũy thừa của 2.");
			}
		}
    }
	public static boolean isPowerOfTwo(int a) {
		if(a == 0 || a == 1) return true;
		int x = a / 2;
		if(a % 2 == 1) return false;
		return isPowerOfTwo(x);
}


 public static boolean checkInt(String input) {
	for (int i = 0; i < input.length()-1; i++) {
		if (input.charAt(i) < '0' || input.charAt(i) > '9')
			return false;
	}
	return true;
}
}
