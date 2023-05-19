package ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadNumberDemo {
private static final Map<Integer, String> NUMBER_CONVERT = new HashMap<Integer, String>() {
		private static final long serialVersionUID = 1L;
{
			put(0, "Không");
			put(1, "Một");
			put(2, "Hai");
			put(3, "Ba");
			put(4, "Bốn");
			put(5, "Năm");
			put(6, "Sáu");
			put(7, "Bảy");
			put(8, "Tám");
			put(9, "Chín");
			put(10, "Mười");
			put(11, "Mười một");
			put(20, "Hai Mươi");
			put(30, "Ba Mươi");
			put(40, "Bốn Mươi");
			put(50, "Năm Mươi");
			put(60, "Sáu Mươi");
			put(70, "Bảy Mươi");
			put(80, "Tám Mươi");
			put(90, "Chín Mươi");
		}
	};


	private ReadNumberDemo() {
		Scanner sc = new Scanner(System.in);
		int number = 0;

		do {
			try {
				System.out.print("Enter n: ");
				number = Integer.parseInt(sc.nextLine());
				System.out.print(number + " --> ");
				System.out.println(readNumbers(number));

				System.out.print("Do you want exit [y/n]: ");
				String confirm = sc.nextLine().toLowerCase();
				if (confirm.equalsIgnoreCase("y")) {
					System.out.println(">>>>>Byeeee!<<<<<");
					break;
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		} while (true);
		sc.close();
	}
	public static void main(String[] args) {
		new ReadNumberDemo();
	}

	private static String readNumbers(int number) {

		if (number < 0 || number > 999) {
			throw new IllegalArgumentException("Your number must in [0,999]");
		}

		StringBuilder resString = new StringBuilder();

		if (NUMBER_CONVERT.containsKey(number))
			return NUMBER_CONVERT.get(number);

		if (number >= 100) {
			resString.append(NUMBER_CONVERT.get(number / 100) + " Trăm ");
			number %= 100;
			if (number <= 9) {
				resString.append("Linh | Lẻ " + NUMBER_CONVERT.get(number));
			}
		}

		if (number > 9) {
			if (NUMBER_CONVERT.containsKey(number)) {
				return resString.append(NUMBER_CONVERT.get(number)).toString();
			} else {
				resString.append(NUMBER_CONVERT.get(number - number % 10));
				number %= 10;
				if (number == 1) {
					resString.append(" Mốt");
				} else if (number == 5) {
					resString.append(" Lăm");
				} else if (number > 0) {
					resString.append(" " + NUMBER_CONVERT.get(number));
				}
			}
		}

		return resString.toString();
	}

}
