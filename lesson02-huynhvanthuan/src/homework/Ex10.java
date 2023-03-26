package homework;

import java.util.ArrayList;
import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		Random rd = new Random();
//		while (arr.size() < 5) {
//			int random = 10 + rd.nextInt(11);
//			if (!arr.contains(random)) {
//				arr.add(random);
//			}
//		}
//		System.out.println(arr);

		int[] arr = new int[5];
		int count = 0;
		int temp = 0;
		int flag = 0;
		Random rd = new Random();
		for (int i = 0; i < arr.length; i++) {
			while (true) {
				flag = 0;
				int number_random = 10 + rd.nextInt(11);
				for (int j = 0; j <= count; j++) {
					if (number_random == arr[j]) {
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					arr[i] = number_random;
					count++;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
