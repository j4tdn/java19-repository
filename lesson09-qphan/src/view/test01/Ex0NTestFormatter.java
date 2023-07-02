package view.test01;

public class Ex0NTestFormatter {
	
	private static final int DEFAULT_SEPRATED_SPACES = 5;
	
	public static void main(String[] args) {
		String[][] a2D = { 
				{ "123"  , "123"    , "123456" }, // row[0]
				{ "12345", "1234567", "123" },    // row[1]
				{ "12"   , "12345"  , "123" }     // row[2]
		};
		printTable(a2D);
		
		System.out.println("\n==========================\n");
		
		printTableWithSignSeparator(a2D);
	}
	
	private static void printTableWithSignSeparator(String[][] a2D) {
		int[] maxLengthByColumn = findMaxLengthForEachColumn(a2D);
		int rowLength = a2D[0].length;
		int contentLength = 0;
		for (int rowI = 0; rowI < a2D.length; rowI++) {
			String content = "| ";
			for (int colI = 0; colI < rowLength; colI++) {
				String spaces = generateSpaces(maxLengthByColumn[colI] - a2D[rowI][colI].length()) + " | ";
				content = content + a2D[rowI][colI] + spaces;
			}
			contentLength = content.length();
			printSeparatedLine(contentLength);
			System.out.println(content);
			
		}
		printSeparatedLine(contentLength);
	}
	
	
	private static void printTable(String[][] a2D) {
		int[] maxLengthByColumn = findMaxLengthForEachColumn(a2D);
		int rowLength = a2D[0].length;
		for (int rowI = 0; rowI < a2D.length; rowI++) {
			for (int colI = 0; colI < rowLength; colI++) {
				String spaces = generateSpaces(maxLengthByColumn[colI] - a2D[rowI][colI].length() + DEFAULT_SEPRATED_SPACES);
				System.out.print(a2D[rowI][colI] + spaces);
			}
			System.out.println();
		}
	}
	
	private static void printSeparatedLine(int length) {
		for (int i = 0; i < length - 1; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	private static String generateSpaces(int amount) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < amount; i++) {
			sb.append(" ");
		}
		return sb.toString();
	}
	
	private static int[] findMaxLengthForEachColumn(String[][] a2D) {
		int[] maxLengthByColumn = new int[a2D.length];
		int rowLength = a2D[0].length;
		for (int colI = 0; colI < rowLength; colI++) {
			int maxLength = 0;
			for (int row = 0; row < a2D.length; row++) {
				if (a2D[row][colI].length() > maxLength) {
					maxLength = a2D[row][colI].length();
				}
			}
			maxLengthByColumn[colI] = maxLength;
		}
		return maxLengthByColumn;
	}
}
