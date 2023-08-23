import java.util.Arrays;
import java.util.Scanner;

public class test {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Nhập số hàng");
	int row = ip.nextInt();
	System.out.println("Nhập số cột");
	int col = ip.nextInt();
	int[][] array = new int[row][col];
	System.out.println("Nhập các phần tử của mảng");
	for(int i = 0; i < row; i ++ ) {
		for(int j = 0; j< col; j ++) {
			System.out.println("Nhập phần tử [ " + i + " ][ "+ j + " ]" );
			array[i][j] = ip.nextInt();
		}
	}
	System.out.println("Mảng đã nhập: ");
	for(int i = 0; i < row; i++) {
		for(int j = 0; j < col; j++) {
			System.out.println(Arrays.toString(array));
		}
		System.out.println();
	}
	testPrint(array);
	}

private static void testPrint(int [][]array) {
	for(int row = 0; row < array.length; row++) {
		for(int col = 0; col < row; col++) {
			System.out.println("result -> " + col);
		}
	}
}
}
