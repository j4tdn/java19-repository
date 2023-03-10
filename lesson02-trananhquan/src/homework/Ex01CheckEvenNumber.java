package homework;

import java.util.Scanner;

public class Ex01CheckEvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countInput = 0;
		String num = "";

		do {
			System.out.print("Nhập số nguyên dương N = ");
			num = sc.nextLine();
			countInput++;
			if (countInput == 5) {
				System.out.println("Bạn đã nhập sai tối đa 5 lần! Kết thúc chương trình.");
				return;
			}
		} while (!Common.isPositiveInteger(num));

		if (isEvenNumber(Integer.parseInt(num))) {
			System.out.println(num + " là bội của 2.");
		} else {
			System.out.println(num + " không phải bội của 2.");
		}
	}

	private static boolean isEvenNumber(int input) {
		return input % 2 == 0;
	}

}
