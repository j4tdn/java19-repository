package homework;

import java.util.Arrays;
import java.util.Random;

public class Ex10_5Random {
	public static void main(String[] args) {
		int running = 5;
		Random rd = new Random();
		int count = 0;
		int[] pickedNumbers = new int[running];
		while(true) {
			int temp = rd.nextInt(11) + 20;
			if(isExists(temp, pickedNumbers)) {
				continue;
			}
			pickedNumbers[count++] = temp;
			if(count == running) break;
		}
		System.out.println(Arrays.toString(pickedNumbers));
	}

	public static boolean isExists(int checkingElement, int[] elements) {
		for (int i = 0; i < elements.length; i++) {
			if (checkingElement == elements[i]) {
				return true;
			}
		}
		return false;
	}
}

