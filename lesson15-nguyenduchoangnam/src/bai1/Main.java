package bai1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int soLanNhapSai = 0;
		double soThuc;

		while (true) {
			System.out.print("Nhập một số thực có phần thập phân khác 0: ");
			if (scanner.hasNextDouble()) {
				soThuc = scanner.nextDouble();
				double phanThapPhan = soThuc - Math.floor(soThuc);
				if (phanThapPhan != 0) {
					break;
				}
			}
			System.out.println("Số bạn nhập không hợp lệ.");
			scanner.nextLine();
			soLanNhapSai++;

			if (soLanNhapSai >= 3) {
				System.out.println("Bạn đã nhập sai quá 3 lần. Kết thúc chương trình.");
				System.exit(0);
			}
		}

		int mauSo = 1;
		while (Math.floor(soThuc * mauSo) != soThuc * mauSo) {
			soThuc *= 10;
			mauSo *= 10;
		}

		int ucln = timUCLN((int) soThuc, mauSo);
		int tuSo = (int) soThuc / ucln;
		mauSo = mauSo / ucln;

		System.out.println("Phân số tối giản của " + soThuc + " là: " + tuSo + "/" + mauSo);
	}

	public static int timUCLN(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
