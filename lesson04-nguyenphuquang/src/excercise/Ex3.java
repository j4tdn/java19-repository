package excercise;

import java.util.Arrays;

public class Ex3 {

	public static void main(String[] args) {
		int n = 6;
		int[] row = new int[n + 2];
		int[] rowTemp = new int[n + 2];
		int running = 1;
		row[0] = 1;
		row[1] = 1;
		rowTemp[0] = 1;
		System.out.println(Arrays.toString(row));
		while (true) {
			if (row[n+1]!=0) {
				break;
			}
			
		while (running < row.length) {
			rowTemp[running] = row[running] + row[running-1];
			running++;
		}
		
		running = 1;
		row = Arrays.copyOfRange(rowTemp, 0, rowTemp.length);
		System.out.println(Arrays.toString(row));
	}
	}
}
