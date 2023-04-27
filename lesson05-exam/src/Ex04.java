import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

	}

	private static int sum(int[] a, int n) {
		int sum = 0;
		
		int[] temp = new int[n];
		int j =0;
		for(int i = 0; i < n -1; i++) {
			if(a[i] != a[i + 1]) {
				temp[j++] = a[i]; 
			}
		}
		temp[j++] = a[n - 1];
		for(int i = 0 ; i < j; i++) {
			a[i] = temp[i];
		}
		return j;
	}
}
