package view;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = 10 + rd.nextInt(11);
		System.out.println(a);
		int b = 10 + rd.nextInt(11);
		System.out.println(b);
		int c = 10 + rd.nextInt(11);
		System.out.println(c);
		int d = 10 + rd.nextInt(11);
		System.out.println(d);
		
		long result1 = 1;
		long result2 = 1;
		long result3 = 1;
		long result4 = 1;
		
		for (int i = 1; i <= a; i++) {
			result1 *= i;
		}
		
		for (int i = 1; i <= b; i++) {
			result2 *= i;
		}
		
		for (int i = 1; i <= c; i++) {
			result3 *= i;
		}
		
		for (int i = 1; i <= d; i++) {
			result4 *= i;
		}
		
		System.out.println("Tổng giao thừa là : " + result1 + result2 + result3 + result4);
	}
}
