package exercises;

import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(11) + 10;
		int b = random.nextInt(11) + 10;
		int c = random.nextInt(11) + 10;
		int d = random.nextInt(11) + 10;
		
		System.out.println("S="+a+"+"+b+"+"+c+"+"+c+"= "+sumFact(a, b, c, d));
	}

	public static long fact(int n) {
		long fact = 1;
		for (int i = n; i > 1; i--) {
			fact = fact * i;
		}
		return fact;
	}
	public static long sumFact(int a,int b,int c, int d) {
		return (fact(a)+fact(b)+fact(c)+fact(d));
	}
}
