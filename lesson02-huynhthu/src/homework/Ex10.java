package homework;

import java.util.Random;

public class Ex10 {
	public static void main(String[] args) {

		// Viết chương trình in ra 5 số nguyên ngẫu nhiên từ 20 đến 30 [20, 30]
		// Yêu cầu: 5 số ngẫu nhiên không được trùng nhau
		// không được trùng nhau ???F
		Random rd = new Random();
		int Number = 20 + rd.nextInt(11);
		for (int i = 0; i < 5; i++) {
			System.out.println("random number is: " + Number);

		}

	}
}
