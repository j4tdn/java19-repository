package utils;

import java.util.Scanner;

public class IoUntils {
	private IoUntils() {
	}
	public static boolean isPositiveNber(String nAsString) {
		if (nAsString.isEmpty()) {
			return false;
		}
		char firstLetter = nAsString.charAt(0);
		int i = 0;
		if (firstLetter == '+') {
			i = 1;
		}
		for (; i < nAsString.length(); i++) {
			if (!Character.isDigit(nAsString.charAt(i))) {
				return false;
			}
		}
		return (Integer.parseInt(nAsString) > 0);
	}

	public static int input(String prefix) {
		Scanner ip = new Scanner(System.in);

		String nAsString = null;
		int wrongTimes = 0;

		do {
			System.out.print(prefix);
			nAsString = ip.nextLine();
			if (isPositiveNber(nAsString)) {
				break;
			}
			System.out.println("N không hợp lệ");
			wrongTimes++;
			if (wrongTimes == 3) {
				System.out.println("Bạn đã sai quá 3 lần . Vui lòng nhập lại");
			}
			if (wrongTimes == 5) {
				System.out.println("Bạn đã sai quá 5 lần . Thoát chương trình");
				System.exit(0);
			}

		} while (true);
		ip.close();
		return (Integer.parseInt(nAsString));
	}

}
