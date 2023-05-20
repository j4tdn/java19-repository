package excercise;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				int a = sc.nextInt();
				int b = sc.nextInt();
				if(a == 0) {
					throw new IllegalArgumentException("Denominator must different from 0");
				}
				System.out.println("Calc --> " + (-b/a));
				break;
			} catch (ArithmeticException | IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
