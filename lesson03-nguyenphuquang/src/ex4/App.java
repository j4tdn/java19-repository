package ex4;

import java.util.Scanner;
public class App {
	/* obsolete, please see App2

	public static void main(String[] args) {
		
	//	System.out.println("Nhập kích thước ma trận M(row) * N(column)");
		Scanner ip = new Scanner(System.in);
		int row = 3;
		int column = 3;
		MatrixElements[] matrix = new MatrixElements[row*column];
		int counter = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				
			System.out.println("Nhập phần tử hàng "+ i + " cột " + j);
			matrix[counter] = new MatrixElements(i,j, Integer.parseInt(ip.nextLine()));
			System.out.println(matrix[counter++]);
			}
		}
		System.out.println("Ma trận đã nhập là:");
		
		for (int i = 0; i < row; i++) {
			for (MatrixElements id : matrix) {
				if (id.getRow()==i) {
					System.out.print(id.getValue()+"\t");
				}
			}
			System.out.println("\n");
		}
		

		
	}

	
	 */
}