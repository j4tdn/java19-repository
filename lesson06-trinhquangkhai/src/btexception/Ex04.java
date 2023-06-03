package btexception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Enter the number");
				int num = ip.nextInt();
				ReadNumber(num);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid number!Please try again");
				continue;
			}
		}

	}

	private static String ReadNumber(int num) {
		String st = "";
		String[] one = { "Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín" };
		String[] ten = { "Mười", "Hai Mươi", "Ba Mươi", "Bốn Mươi", "Năm Mươi", "Sáu Mươi", "Bảy Mươi", "Tám Mươi",
				"Chín Mươi" };
		String[] hundred = { "Một Trăm", "Hai Trăm", "Ba Trăm", "Bốn Trăm", "Năm Trăm", "Sáu Trăm", "Bảy Trăm",
				"Tám Trăm", "Chín Trăm" };
		if (num < 10) {
			System.out.println(one[num]);
		} else if (num < 20) {
			if (num == 15) {
				st = "Mười Lăm";
			} else if (num == 10) {
				st = "Mười";
			} else if(num > 10){
				st = "Mười" + one[num];
			}

		} else if (num < 100) {
			int tendigit = (num / 10);
			int onedigit = num % 10;
			if (onedigit == 0) {
				st = ten[tendigit];
			} else {
				st = ten[tendigit] + " " + one[onedigit];
			}
		} else if (num < 1000) {
			int tendigit = (num / 10) % 10;
			int onedigit = num % 10;
			if (tendigit == 0 && onedigit == 0) {
				st = hundred[num];
			} else if (num % 100 < 10) {
				st = hundred[num] + " LẺ " + one[onedigit];
			} else if (num % 100 < 20) {
				st = hundred[num] + " Mười " + one[onedigit];
			} else {
				st = hundred[num] + ten[tendigit] + " " + one[onedigit];
			}
		}
		return st.trim();
	}

}
