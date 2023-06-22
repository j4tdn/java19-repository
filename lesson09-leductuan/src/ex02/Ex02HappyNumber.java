package ex02;

import java.util.Scanner;

public class Ex02HappyNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String text;
		int count = 0;
		do {
			if (count > 4) {
				System.out.println("Nhập quá số lần quy định");
				System.out.println("Chương trình kết thúc");
				System.exit(0);
			}
			System.out.print("Nhập số nguyên dương N: ");
			text = ip.nextLine();
			count += 1;
		} while (checkInt(text) == false);
		
		int n = Integer.parseInt(text);
		if(isHappyNumber(n)) {
			System.out.println(n+" là số hạnh phúc");
		}
		else System.out.println(n+" không là số hạnh phúc");
	}
	public static boolean isHappyNumber(int n) {
	    if (n == 1) {
	        return true;
	    }
	    if (n == 4) {
	        return false;
	    }
	    int sum = 0;
	    while (n > 0) {
	        int digit = n % 10;
	        sum += digit * digit;
	        n /= 10;
	    }
	    return isHappyNumber(sum);
	}
	public static boolean checkInt(String input) {
		for (int i = 0; i < input.length()-1; i++) {
			if (input.charAt(i) < '0' || input.charAt(i) > '9')
				return false;
		}
		return true;
	}
}
