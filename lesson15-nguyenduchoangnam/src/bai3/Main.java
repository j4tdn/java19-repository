package bai3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập chuỗi thứ nhất: ");
		String chuoi1 = scanner.nextLine().toLowerCase().replaceAll("\\s", "");

		System.out.print("Nhập chuỗi thứ hai: ");
		String chuoi2 = scanner.nextLine().toLowerCase().replaceAll("\\s", "");

		boolean daoNgu = kiemTraDaoNgu(chuoi1, chuoi2);

		if (daoNgu) {
			System.out.println("Hai chuỗi là đảo ngữ của nhau.");
		} else {
			System.out.println("Hai chuỗi không phải là đảo ngữ của nhau.");
		}
	}

	public static boolean kiemTraDaoNgu(String chuoi1, String chuoi2) {
		if (chuoi1.length() != chuoi2.length()) {
			return false;
		}

		int[] demKiTu1 = new int[26];

		for (char kiTu : chuoi1.toCharArray()) {
			if (Character.isLetter(kiTu)) {
				int index = kiTu - 'a';
				demKiTu1[index]++;
			}
		}

		for (char kiTu : chuoi2.toCharArray()) {
			if (Character.isLetter(kiTu)) {
				int index = kiTu - 'a';
				demKiTu1[index]--;

				if (demKiTu1[index] < 0) {
					return false;
				}
			}
		}

		for (int dem : demKiTu1) {
			if (dem != 0) {
				return false;
			}
		}

		return true;
	}
}
