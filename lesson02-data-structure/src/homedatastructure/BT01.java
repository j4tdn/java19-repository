package homedatastructure;

import java.util.Scanner;

public class BT01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int N = 0;
		int count = 0;

		while (count < 5) {
			System.out.print("Nhap vao so nguyen duong N: ");
			N = input.nextInt();

			if (N <= 0) {
				System.out.println("N khong hop le. Vui long nhap lai!");
				count++;
			} else {
				break;
			}
		}

		if (count == 5) {
			System.out.println("Da nhap sai toi da 5 lan. Ket thuc chuong trinh!");
			System.exit(0);
		}

		boolean isMultipleOf2 = false;

		if (N % 2 == 0) {
			isMultipleOf2 = true;
		}

		if (isMultipleOf2) {
			System.out.println(N + " la boi cua 2");
		} else {
			System.out.println(N + " khong la boi cua 2");
		}
	}
}
