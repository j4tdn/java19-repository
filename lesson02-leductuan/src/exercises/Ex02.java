package exercises;

import java.util.Scanner;

public class Ex02 {

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
		if (isExpOf2(n)==1) System.out.println("True");
		else System.out.println("False");
		
	}

	public static boolean checkInt(String input) {
		for (int i = 0; i < input.length()-1; i++) {
			if (input.charAt(i) < '0' || input.charAt(i) > '9')
				return false;
		}
		return true;
	}

	public static int isExpOf2(int input) {
		if(input==0) return 0;
		else if(input==1||input==2) return 1;
		else if (input%2==0) {
			input=input/2;
			return isExpOf2(input);
		}
		return 0;
	}
}
