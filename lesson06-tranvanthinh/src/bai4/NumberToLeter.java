package bai4;

public class NumberToLeter {

	static String[] numberLeter = { "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười" };
//	static String[] unit = { "đơn vị", "nghìn", "triệu", "tỷ" };

	public static void main(String[] args) {
		System.out.println(readNumber(211));
	}

	public static String readNumber(int num) {
		String result = "";
		if (num == 0) {
			result += "không";
		} else if (num <= 10) {
			result = numberLeter[num]; // n <= 10			
		} else if (num > 10 && num < 20) { // 10 < n < 20
			result += "Mười ";
			result += numberLeter[(num % 10)];
		} else if (num >= 20 && num < 100) { // 20 <= n < 100
			result += numberLeter[(int) (num * 0.1)] + " mươi ";
			if (num % 10 != 1) {
				if (num % 10 == 1) {
					result += "mốt";
				} else {
					result += numberLeter[num % 10];
				}
			}
		}

		else {
			result += numberLeter[(int) (num * 0.01)] + " trăm ";

			num = num % 100;
			if (num != 0) {
				if ((int) (num * 0.1) > 1) {
					result += numberLeter[(int) (num * 0.1)] + " mươi ";
				} else if ((int) (num * 0.1) == 0) {
					result += "lẻ ";
				} else {
					result += "mười ";
				}				
			}
			
			if (num % 10 != 0) {
				if (num % 10 == 1 && (int) (num * 0.1) > 1) {
					result += "mốt";
				} else {
					result += numberLeter[num % 10];
				}
			}
		}

		return result;
	}
}
