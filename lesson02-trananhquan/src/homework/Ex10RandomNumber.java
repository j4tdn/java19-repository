package homework;

import java.util.Random;

public class Ex10RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Random rd = new Random();
		int count = 1;
		arr[0] = 10 + rd.nextInt(11);

		boolean flag;
		while (true) {
			flag = true;
			int num = 10 + rd.nextInt(11);
			for (int i = 0; i < count; i++) {
				if (num == arr[i]) {
					flag = false;
				}
			}

			if (flag) {
				arr[count] = num;
				count++;
			}

			if (count == 5)
				break;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
