package view.kf;

/**
 * Tìm số tự nhiên hợp lệ lớn nhất trong chuỗi. 
 * Biết rằng chuỗi chỉ gồm các ký tự số và chữ cái không dấu.
 * 
 * 12abu02muzk586cyx --> 586
 * Uyk892nn1234uxo2  --> 1234
 * 
 * Phân tích:
 * Input: String s = "12abu02muzk586cyx"
 * Khai báo biến String temp = ""; // "586" (int) temp = ""
 * int max = 0 -> 12 --> 586
 * 
 * Cách 1:
 * =============
 * Duyệt từ kí tự trong chuỗi
 *     Nếu kí tự là số --> + vào chuỗi
 *     Nếu kí tự ko phải là chuỗi
 *       + kiểm tra temp(int) với max, nếu > max thì gán lại cho max
 *       + gán temp = ""
 * Cách 2:
 * =============
 * Gọi í from, until, subString(s, from, until)
 * 
 * Cách 3:
 * =============
 * String#split(kiTuCanCat)
 * "a-b-c".split("-") --> String[] tokens = {"a", "b", "c"};
 * 
 * @author qphan
 */
public class Ex03LargestValidNumber {
	public static void main(String[] args) {
		// ""
		// abc
		// 123
		// 12abu02muzk586cyx
		
		// String tmp
		// int validFrom
		// int validUntil
		
		// abc123
		// 123abc
		
		String[] arrayOfString = {
				"      ",
				"12ab,*u02muzk586cyx",
				"abc4--56x789k999",
				"aaaaaaa",
				"11111111",
				"bbb222",
				"222bbb",
		};
		
		for(String s: arrayOfString) {
			try {
				int max = getValidMaxNumber(s);
				System.out.println(s + " ----> " + max);
			} catch (IllegalArgumentException e) {
				System.out.println(s + " ---> " + e.getMessage());
			}
			
		}
	}
	
	// 80/20
	// abc456x789k999
	private static int getValidMaxNumber(String text) {
		text = text.trim();
		if (text == null || text.isEmpty() || text.matches("[\\D]+")) {
			throw new IllegalArgumentException("data is invalid");
		}
		
		// Cắt theo 1 hoặc nhiều kí tự thường
		int max = Integer.MIN_VALUE;
		String[] tokens = text.split("[\\D]+");
		for (String token: tokens) {
			if (token.isEmpty()) {
				continue;
			}
			int digit = Integer.parseInt(token);
			if (max < digit) {
				max = digit;
			}
		}
		return max;
	}
}
