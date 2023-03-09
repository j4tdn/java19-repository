package exercises;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		String text1;
		String text2;
		String text3;
		do {
			System.out.print("Nhập số nguyên dương a: ");
			text1 = ip.nextLine();
		} while (checkNum(text1) == false);

		int a = Integer.parseInt(text1);
		do {
			System.out.print("Nhập số nguyên dương b: ");
			text2 = ip.nextLine();
		} while (checkNum(text2) == false);

		int b = Integer.parseInt(text2);
		do {
			System.out.print("Nhập số nguyên dương c: ");
			text3 = ip.nextLine();
		} while (checkNum(text3) == false);

		int c = Integer.parseInt(text1);
		
		System.out.println("Số lớn nhất:"+numMax(a, b, c));
		System.out.println("Số nhỏ nhất:"+numMin(a, b, c));
		
	}

	public static boolean checkNum(String input) {
		if (input.length() > 2)
			return false;
		else if (input.length() == 1)
			return true;
		else if (input.charAt(0) >= '2')
			return false;
		else
			return true;
	}
	public static int numMax(int a, int b, int c) {
		int max;
		if(a>b) max=a;
		else max=b;
		if(max<c) max=c;
		return max;
	}
	public static int numMin(int a, int b, int c) {
		int min;
		if(a<b) min=a;
		else min=b;
		if(min>c) min=c;
		return min;
	}
	
}
