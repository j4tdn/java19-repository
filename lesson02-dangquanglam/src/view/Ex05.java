package view;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so nguyen duong N (>= 10): ");
		int N = sc.nextInt();

		// Chuyen so N sang chuoi
		String strN = Integer.toString(N);

		// Tao doi tuong StringBuilder va dao nguoc chuoi
		StringBuilder sb = new StringBuilder(strN);
		sb.reverse();

		// So sanh chuoi kieu String khi chuyen N sang chuoi vs chuoi dao nguoc
		boolean isSymmetric = strN.equals(sb.toString());

		if (isSymmetric) {
			System.out.println(N + " la so doi xung");
		} else {
			System.out.println(N + " khong la so doi xung");
		}
	}
}
