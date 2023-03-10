package homework;

import java.util.Scanner;

public class Ex03 {
	public static boolean checkDigit(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) < '0' || s.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
	public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int n;
			boolean isValid = false;

			do {
			    System.out.print("Nhập một số nguyên dương N: ");
			    n = sc.nextInt();
			    if (n >= 0) {
			        isValid = true;
			    } else {
			        System.out.println("Số N không hợp lệ. Vui lòng nhập lại.");
			    }
			} while (isValid);

			long result = factorial(n);
			System.out.println(n + "! = " + result);
		}
    }
}
