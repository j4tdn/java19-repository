package homework;

import java.util.Scanner;

public class Ex01 {
	public static boolean isMultipleOfTwo (int a) {
		if (a % 2 ==0) {
			return true;
		}else
		return false;
	}
	public static boolean checkInt (String input) {
		for (int i =0; i< input.length()-1;i++) {
			if (input.charAt(i)<'0'|| input.charAt(i) >'9')
				return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		 try (Scanner sc = new Scanner(System.in)) {
			int n, count = 0;
	        boolean isValid = false;

	        do {
	            System.out.print("Nhập một số nguyên dương N: ");
	            n = sc.nextInt();
	            count++;
	            if (n > 0) {
	                isValid = true;
	            } else {
	                System.out.println("Số N không hợp lệ. Vui lòng nhập lại.");
	            }
	        } while (!isValid && count < 5);

	        if (isValid) {
	            if (isMultipleOfTwo(n)) {
	                System.out.println(n + " là bội của 2.");
	            } else {
	                System.out.println(n + " không phải là bội của 2.");
	            }
	        } else {
	            System.out.println("Quá số lần cho phép. Kết thúc chương trình.");
	        }
		}
	    }
}
