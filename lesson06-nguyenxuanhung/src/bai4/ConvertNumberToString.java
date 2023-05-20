package bai4;

public class ConvertNumberToString {
	public static void main(String[] args) {
		String res = readNumber(123);
		System.out.println(res);
	}

	public static String readNumber(int number) {
		String[] units = { "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười", "mười một",
				"mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín" };
		String[] tens = { "", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi",
				"chín mươi" };

		if (number < 0 || number > 999) {
			throw new IllegalArgumentException("Số không hợp lệ. Hãy nhập số từ 0 đến 999.");
		}

		if (number == 0) {
			return "không";
		}

		String result = "";

		int hundreds = number / 100;
		int tensDigit = (number % 100) / 10;
		int unitsDigit = number % 10;

		if (hundreds > 0) {
			result += units[hundreds] + " trăm";
		}

		if (tensDigit > 0) {
			if (hundreds > 0) {
				result += " ";
			}
			result += tens[tensDigit];
		}

		if (unitsDigit > 0) {
			if (tensDigit > 1) {
				result += " ";
			}
			result += units[unitsDigit];
		}

		return result;
	}

}
