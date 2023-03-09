package exercises;

import java.util.Scanner;

public class Ex08 {

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
		System.out.println(isPrime(n));
	}
	
	public static boolean checkInt(String input) {
		for (int i = 0; i < input.length()-1; i++) {
			if (input.charAt(i) < '0' || input.charAt(i) > '9')
				return false;
		}
		return true;
	}
	
	public static boolean isPrime(int input) {
		if(input==0||input==1) return false;
		else
		for(int i=2;i<input;i++) {
			if(input%i==0) return false;
		}
		return true;
	}

}
