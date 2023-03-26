package homework;

import java.util.Scanner;

public class Ex2 {

	private static boolean isPowerTwo(int n) {
		if (n == 0 || n == 1)
			return true;
		int x = n / 2;
		int y = n % 2;
		if (y == 1)
			return false;
		return isPowerTwo(x);
	}

	public static void main(String[] args) {
		Ex1 ex = new Ex1();
		Scanner sc = new Scanner(System.in);
		String str;
		int countErr = 0;
		do {
			System.out.println("Enter number: ");
			str = sc.nextLine();
			if (!ex.checkNumber(str)) {
				System.out.println("Enter number >= 0: ");
				System.out.println();
			}
			countErr++;
			if (countErr >= 5) {
				System.out.println("You entered wrong " + countErr + "times");
				return;
			}
		} while (!ex.checkNumber(str));
		int number = Integer.parseInt(str);
		if(isPowerTwo(number)) {
			System.out.println(number + " is a power of two");
		}else {
			System.out.println(number + " is not a power of two");
		}
//		long start = System.currentTimeMillis();
//		// --> số millis tính từ unix-time epoch time (mốc thời gian) 1.1.1970
//		System.out.println(isPowerTwo(number));
//		System.out.println("duration x -->: "+ (System.currentTimeMillis() - start) + " ms");
	}

}
