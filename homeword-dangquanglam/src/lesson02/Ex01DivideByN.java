package lesson02;

import java.util.Scanner;

import utils.IoUntils;

public class Ex01DivideByN {

	public static void main(String[] args) {
		int n = IoUntils.input("Nhập N = ");
		System.out.println(n + " is divides by 2 --> " + isDividesBy2(n));

	}

	private static boolean isDividesBy2(int n) {
		return n % 2 == 0;
	}
}
