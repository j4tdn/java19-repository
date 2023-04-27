package bai3;

public class MaxNumberValid {
	public static void main(String[] args) {
		System.out.println(getMaxValidNumber("12abu02muzk586cyx"));
	}
	public static int getMaxValidNumber(String s) {
	    int largestNumber = 0;  // số tự nhiên hợp lệ lớn nhất trong chuỗi
	    int currentNumber = 0;  // số hiện tại đang được xây dựng từ chuỗi
	    boolean inNumber = false;  // biến đánh dấu xem có đang xây dựng số hay không

	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);

	        if (Character.isDigit(c)) {
	            currentNumber = currentNumber * 10 + Character.getNumericValue(c);
	            inNumber = true;
	        } else {
	            if (inNumber && currentNumber > largestNumber) {
	                largestNumber = currentNumber;
	            }
	            currentNumber = 0;
	            inNumber = false;
	        }
	    }

	    // Kiểm tra số cuối cùng nếu có
	    if (inNumber && currentNumber > largestNumber) {
	        largestNumber = currentNumber;
	    }

	    return largestNumber;
	}
}
