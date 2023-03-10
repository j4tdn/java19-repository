package homework;

import java.util.Scanner;

public class Ex07DecimalToBinary {
	public static void arr(String a) {
		int b = 0;
		int i = 0;
		int z = Integer.parseInt(a);
		int temp = 0;
		while (z != 0) {
			b = z % 2;
			z /= 2;
			temp += b * (int) Math.pow(10, i);
			i++;
		}
		System.out.print(temp);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap so: ");
		String temp = sc.nextLine();
		arr(temp);
	}
}
