package exercises;

import java.util.Scanner;

public class Ex03 {

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
		System.out.println(n+"!= "+fact(n));

	}

	public static boolean checkInt(String input) {
		for (int i = 0; i < input.length()-1; i++) {
			if (input.charAt(i) < '0' || input.charAt(i) > '9')
				return false;
		}
		return true;
	}
	
	public static int fact(int n) {
		int fact=1;
		for (int i=n;i>1;i--) {
			fact=fact*i;
		}
		return fact;
	}
}
