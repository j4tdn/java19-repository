package ex04;

public class Ex04 {
	private static final String[] ONES = { "", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín" };

	private static final String[] TENS = { "", "Mười", "Hai mươi", "Ba mươi", "Bốn mươi", "Năm mươi", "Sáu mươi",
			"Bảy mươi", "Tám mươi", "Chín mươi" };

	private static final String[] SPECIALS = { "", "Mười", "Mười", "Trăm" };

	public static String readNumber(int n) {
		if (n < 0 || n > 999) {
			return "Số không hợp lệ";
		}

		if (n == 0) {
			return "Không";
		}

		StringBuilder result = new StringBuilder();

		int hundreds = n / 100;
		int tens = (n / 10) % 10;
		int ones = n % 10;

		if (hundreds > 0) {
			result.append(ONES[hundreds]).append(" Trăm");
		}

		if (tens == 0 && ones > 0) {
			result.append(" Lẻ ").append(ONES[ones]);
		} else if (tens == 1) {
			result.append(" ").append(SPECIALS[tens]);
			if (ones > 0) {
				result.append(" ").append(ONES[ones]);
			}
		} else {
			result.append(" ").append(TENS[tens]);
			if (ones > 0) {
				result.append(" ").append(ONES[ones]);
			}
		}

		return result.toString().trim();
	}

	public static void main(String[] args) {
		int[] numbers = { 6, 5, 25, 101, 321, 820, 219 };

		for (int number : numbers) {
			System.out.println(number + " => " + readNumber(number));
		}
	}
}
