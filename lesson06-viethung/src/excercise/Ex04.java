package excercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
	static int z = 0;
	static char[] x;

	private static char[] eachNumber(int n) {
		if (n == 0) {
			return Arrays.copyOfRange(x, 0, z);
		}
		int a = n % 10;
		n = n / 10;
		x[z++] = (char) ('0' + a);
		return eachNumber(n);
	}

	private static String readNumber(char[] c) {
		z = 0;
		String s = "";
		int n = c.length;
		for (int i = n - 1; i >= 0; i--) {
			if (i == 0 && c[i] == '0') {
				s += "mươi";
				return s;
			}
			switch (c[i]) {
			case '0':
				if (n == 3 && c[1] == '0') {
					s += "lẻ ";
				} else
					s += "không ";
				break;
			case '1':

				if (n > 1 && i == 0) {
					if (c[1] == '0' || c[1] == '1') {
						s += "một";
					} else
						s += "mốt";
				} else if (i == 1) {
					s += "mười ";
				} else
					s += "một ";
				break;
			case '2':
				s += "hai ";
				break;
			case '3':
				s += "ba ";
				break;
			case '4':
				s += "bốn ";
				break;
			case '5':
				if (n > 1 && i == 0) {
					s += "lăm";
				} else
					s += "năm ";

				break;
			case '6':
				s += "sáu ";
				break;
			case '7':
				s += "bảy ";
				break;
			case '8':
				s += "tám ";
				break;
			case '9':
				s += "chín ";
				break;
			}
			if (i == 2 && n > 2) {
				s += "trăm ";
			}
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			x = new char[1000];
			z = 0;
			System.out.println("Enter a number: ");
			int a = 0;
			try {
				a =  Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid number, please re-enter !!!");
			}
			x = eachNumber(a);
			if (x.length <= 3 && x.length > 0) {
				break;
			} else
				System.out.println("Invalid number, please re-enter !!!");
		} while (true);

		String s = readNumber(x);
		String first = s.substring(0, 1);
		String remaining = s.substring(1, s.length());
		System.out.println(first.toUpperCase() + remaining);
	}
}
