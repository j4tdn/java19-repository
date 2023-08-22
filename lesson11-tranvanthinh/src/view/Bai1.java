package view;

import util.InputUtil;

public class Bai1 {

	public static void main(String[] args) {
		System.out.print("Nhập n: ");
		int n = InputUtil.InputNumber();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i <= n / 2 + 1) {
					if (j <= i || j >= n - i + 1)
						System.out.print(j + " ");
					else
						System.out.print("  ");
				}
				else {
					if (j >= i || j <= n - i + 1)
						System.out.print(j + " ");
					else
						System.out.print("  ");

				}
			}
			System.out.println("");
		}
	}

}
