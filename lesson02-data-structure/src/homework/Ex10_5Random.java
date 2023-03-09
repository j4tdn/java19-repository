package homework;

import java.lang.reflect.Array;
import java.util.Random;

public class Ex10_5Random {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = { 0, 0, 0, 0, 0 };
		for (int i = 0; i < 5; i++) {
			int a = rd.nextInt(10) + 20;
			for (int z = 0; z < arr.length; z++) {
				if (a == arr[z]) {
					break;
				}
			}
		}
		for (int q = 0; q < arr.length - 1; q++)
			System.out.print(arr[q] + " ");
	}
}
