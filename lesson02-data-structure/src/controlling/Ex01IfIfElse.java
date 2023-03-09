package controlling;

import java.util.Random;

public class Ex01IfIfElse {

	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(12);
		System.out.println("Giá trị n --> "+ n);
		boolean isEven = (n % 2 == 0);
		if(isEven) {
			System.out.println("");
		}

	}

}
