package homework;

import java.util.Scanner;

public class Ex06FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a, b, c;

		do {
			System.out.println("Nhập 3 số nguyên a, b, c:");
			System.out.print("- Nhập a = ");
			a = sc.nextLine();
			System.out.print("- Nhập b = ");
			b = sc.nextLine();
			System.out.print("- Nhập c = ");
			c = sc.nextLine();
		} while (!a.matches("[+-]?[0-9]+") || !b.matches("[+-]?[0-9]+") || !c.matches("[+-]?[0-9]+"));

		System.out.println("Số lớn nhất trong 3 số " + a + ", " + b + ", " + c + " là " + findMax(a, b, c));
	}

	private static int findMax(String a, String b, String c) {
		int aInt = Integer.parseInt(a);
		int bInt = Integer.parseInt(b);
		int cInt = Integer.parseInt(c);
		if (aInt >= bInt && aInt >= cInt)
			return aInt;
		if (bInt >= aInt && bInt >= cInt)
			return bInt;
		return cInt;
	}

}
