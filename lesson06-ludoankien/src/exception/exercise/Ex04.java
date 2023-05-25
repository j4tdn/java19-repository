package exception.exercise;

public class Ex04 {
	private static final String[] ones = { "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };

	private static final String[] tens = { "", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi",
			"bảy mươi", "tám mươi", "chín mươi" };

	private static final String[] teens = { "mười", "mười một", "mười hai", "mười ba", "mười bốn", "mười năm",
			"mười sáu", "mười bảy", "mười tám", "mười chín" };

	public static String readNumber(int number) {
		if (number < 0 || number > 999) {
			throw new IllegalArgumentException("Số không hợp lệ. Hãy nhập số trong khoảng từ 0 đến 999.");
		}

		if (number == 0) {
			return "không";
		}

		String result = "";

		int hundredsDigit = number / 100;
		int tensDigit = (number % 100) / 10;
		int onesDigit = number % 10;

		if (hundredsDigit > 0) {
			result += ones[hundredsDigit] + " trăm ";
		}

		if (tensDigit > 1) {
			result += tens[tensDigit] + " ";
			if (onesDigit > 0) {
				result += ones[onesDigit];
			}
		} else if (tensDigit == 1) {
			if (onesDigit == 0) {
				result += tens[tensDigit];
			} else {
				result += teens[onesDigit];
			}
		} else {
			result += ones[onesDigit];
		}

		return result.trim();
	}

	public static void main(String[] args) {
		int number = 6;
		String text = readNumber(number);
		System.out.println("Số " + number + " được đọc là: " + text);
	}
}
