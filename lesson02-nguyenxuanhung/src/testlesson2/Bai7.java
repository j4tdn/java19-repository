package testlesson2;

import java.util.Scanner;

public class Bai7 {
	public static void convertBinary(int num) {

		int binary[] = new int[40];
//		int[] binary = null;

		int index = 0;
		if(num == 0) {
			System.out.println(0);
		}
		while (num > 0) {

			binary[index++] = num % 2;

			num = num / 2;

		}
		
		for (int i = index - 1; i >= 0; i--) {

			System.out.print(binary[i]);

		}

	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("------Convert Demacial to Binary-------");
		System.out.print("Input n (Demacial): ");
		int n = scanner.nextInt();
		System.out.print("Binary ==> ");
		convertBinary(n);
	}
}
