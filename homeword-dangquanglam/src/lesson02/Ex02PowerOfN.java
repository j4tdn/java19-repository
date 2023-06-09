package lesson02;

import utils.IoUntils;

public class Ex02PowerOfN {
	public static void main(String[] args) {
		int number = IoUntils.input("Enter Number = ");
		System.out.println(number + " is power of " + PowerOf2(number));
	}
	
	private static boolean PowerOf2(int number) {
		double rlog = Math.log(number)/Math.log(2);
		return rlog == (int)rlog;
	}
}
