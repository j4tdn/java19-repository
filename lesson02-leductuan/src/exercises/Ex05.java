package exercises;

import java.util.Scanner;

public class Ex05 {

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
		if (isSymmetricalNumber(n)==1) System.out.println("True");
		else System.out.println("false");		
	}

	public static boolean checkInt(String input) {
		if (input.length() < 2)
			return false;
		for (int i = 0; i < input.length()-1; i++) {
			if (input.charAt(i) < '0' || input.charAt(i) > '9')
				return false;
		}
		return true;
	}

	public static int numReverse(int input) {
		int numrevese = 0;
		int lastnumber;
		while (input != 0) {
			lastnumber = input % 10;
			numrevese = (numrevese * 10) + lastnumber;
			input = input / 10;
		}
		return numrevese;
	}
	public static int isSymmetricalNumber(int input) {
		if(input==numReverse(input)) return 1;
		else return 0;
	}

}
