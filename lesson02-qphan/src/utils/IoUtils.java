package utils;

import java.util.Scanner;

public class IoUtils {

	private IoUtils() {
	}
	
	// truyền điều kiện --> strategy pattern
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
			System.out.println(">>>>> N không hợp lệ");
			wrongTimes++;
			if (wrongTimes == 3) {
				System.out.println("Số lần nhập sai tối đa là 5 lần");
			} else if (wrongTimes == 5) {
				System.out.println("Nhập sai vượt quá 5 lần ! Thoát chương trình ...");
				System.exit(0);
			}
		} while (true);
		ip.close();
		return Integer.parseInt(nAsString);
	}

	public static boolean isPositiveNber(String test) {
		if (test.isEmpty()) {
			return false;
		}
		char firstLetter = test.charAt(0);
		int i = 0;
		if (firstLetter == '+') {
			i = 1;
		}
		for (; i < test.length(); i++) {
			if (!Character.isDigit(test.charAt(i))) {
				return false;
			}
		}
		return (Integer.parseInt(test) > 0);
	}

}
