package exercises;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		int n;
		System.out.print("Nhập số nguyên dương N: ");
		Scanner ip = new Scanner(System.in);
		n = ip.nextInt();
		int[] array = new int[16];
		int i = 0;
		while (n > 0) {
			array[i] = n % 2;
			n /= 2;
			i++;
		}

		while (i > 0) {
			i--;
			System.out.print(array[i]);
		}
	}
}
