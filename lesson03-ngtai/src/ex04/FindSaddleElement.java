package ex04;

public class FindSaddleElement {
	public static void main(String[] args) {

		// Input
		int[] Array = { 47, 47, 36, 23, 43, 31, 46, 7, 29 };
		SaddleElementAttribute s1 = new SaddleElementAttribute(3, 3, Array);

		// Code
		int rowNumber = s1.getN();
		int columnNumber = s1.getM();
		int[] ArrayA = s1.getA();

		System.out.println(
				"Array A have the saddle element, true or false --> " + saddleElement(columnNumber, rowNumber, ArrayA));
	}

	public static boolean saddleElement(int columnNumber, int rowNumber, int[] A) {
		boolean saddleE = false;
		int minOfRow = 0;
		int maxOfColumn = 0;
		int positionColumnOfMinElement = 0;
		int numberSameColumn = 0;
//		47 47 36
//		23 43 31
//		46 7 29

		// compare numbers in row
		for (int i = 1; i <= rowNumber; i++) {
			minOfRow = A[((i - 1) * 3 + 1) - 1];
			for (int j = 2; j <= columnNumber; j++) { // j is column number
				if (minOfRow > A[((i - 1) * 3 + j) - 1]) { // ((i - 1) * 3 + j - 1) là vị trí của phần tử
					minOfRow = A[((i - 1) * 3 + j) - 1];
					positionColumnOfMinElement = j; // gán cột mà min đang ở (j) trước khi thoát block scope
				}
			}
			maxOfColumn += minOfRow;
			// compare numbers in column
			for (int j = 1; j <= rowNumber; j++) { // j is row number to take element of rows and same column to be
													// compare (find max of column) with min element of row on present
				if (i == j) {
					continue;
				}
				numberSameColumn = A[((j - 1) * 3 + positionColumnOfMinElement) - 1];
				if (maxOfColumn < numberSameColumn) {

					maxOfColumn = numberSameColumn;
				}
			}
			if (maxOfColumn == minOfRow) {
				saddleE = true;
			}
		}

		return saddleE;
	}
}
