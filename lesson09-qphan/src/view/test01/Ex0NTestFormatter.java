package view.test01;

import java.util.Arrays;

public class Ex0NTestFormatter {
	public static void main(String[] args) {
		String[][] a2D = { 
				{ "1aaaaaa",   "2yyyyyy",       "32222222" }, // row[0]
				{ "12",        "2uuuuuuuuuuuu", "3ttttttttttttttt" }, // row[1]
				{ "1aaaaaa33", "2yyyyyy",       "3mmmmmmmm22222" } // row[2]
		};

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
		
		System.out.println("\n\n");
		
		int defaultSeparateSpaces = 20;
		
		for (int colI = 0; colI < rowLength; colI++) {
			for (int row = 0; row < a2D.length; row++) {
				String spaces = generateSpaces(maxLengthByColumn[colI] - a2D[row][colI].length() + defaultSeparateSpaces);
				
				// System.out.println("value: " + a2D[row][colI]);
				// System.out.println("value length: " + a2D[row][colI].length());
				// System.out.println("max as col: " + maxLengthByColumn[colI]);
				// System.out.println("plus spaces --> " + (maxLengthByColumn[colI] - a2D[row][colI].length() + defaultSeparateSpaces));
				
				System.out.print(a2D[colI][row] + spaces);
			}
			System.out.println();
		}
		
	}
	
	private static String generateSpaces(int amount) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < amount; i++) {
			sb.append(" ");
		}
		return sb.toString();
	}
}
