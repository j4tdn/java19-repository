package homework;

import java.util.LinkedList;
import java.util.Random;

public class Ex04TotalFactorial {
	public static long calcFactorial(int a) {
		long result = 1;
		while (a > 0) {
			result *= a;
			a--;
		}
		return result;
	}
	public static long totalFactorial(LinkedList arr) {
		long result = 0;
		for (int i = 0; i < 4; i++) {
			int a = (int) arr.get(i);
			result += calcFactorial(a);
		}
		return result;
	}

	public static void main(String[] args) {
		LinkedList arr = new LinkedList<>();
		Random md = new Random();
		for (int i = 0; i < 4; i++) {
			int a = md.nextInt(11) + 10;
			arr.addFirst(a);
		}
		System.out.println(totalFactorial(arr));
	}
}
