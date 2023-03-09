package view;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		int a = validNumber();
		int b = validNumber();
		int c = validNumber();
		int max = findMax(a, b, c);
		int min = findMin(a, b, c);
		System.out.println("Max value of 3 number is " + max);
		System.out.println("Min value of 3 number is " + min);
		
	}
	
	private static int validNumber() {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập số nguyên dương n : " );
		String input = in.nextLine();
		int n = 0;
		if(!input.matches("\\d+")) {
			System.out.println("không đúng yêu cầu, cần nhập lại n!");
			System.exit(0);
		}else {
			n = Integer.parseInt(input);
			if(n < 0 || n >= 20) {
				System.out.println("không đúng yêu cầu, cần nhập lại n!");
				System.exit(0);
			}else {
				return n;
			}
		}
		return n;
	}
	
	private static int findMax(int a, int b, int c) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		return max;
	}
	
	private static int findMin(int a, int b, int c) {
		int min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		return min;
	}
}
