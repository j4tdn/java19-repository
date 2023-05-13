package view;

public class Ex05 {

	public static void main(String[] args) {
		System.out.println(findLargestNumber("12abu02muzk586cyx4568"));

	}

	private static int findLargestNumber(String s) {
		int largestNumber = 0;
		int temp = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				temp = temp * 10 + Character.getNumericValue(s.charAt(i));
			} else {
				largestNumber = Math.max(largestNumber, temp);
				temp = 0;
			}
		}
		largestNumber = Math.max(largestNumber, temp);
		return largestNumber;
	}

}
