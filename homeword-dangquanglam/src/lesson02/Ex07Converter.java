package lesson02;

import java.util.Arrays;

import utils.IoUntils;

public class Ex07Converter {
	public static void main(String[] args) {
		int N = IoUntils.input("Nhập N = ");
		System.out.println(N + " Covent " + Arrays.toString(convert(N)));
	}

	private static int[] convert(int decimal) {
		int[] binary = new int[4];
		int running = binary.length - 1;
		while (decimal != 0) {
			int mod = decimal % 2;
			decimal = decimal / 2;
			binary[running--] = mod;
		}

		return binary;
	}
}
