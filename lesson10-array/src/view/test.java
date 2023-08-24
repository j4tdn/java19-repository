package view;

import functional.test1;

public class test {
	public static void main(String[] args) {
		int a = 5, b = 6;
		System.out.println(haha(5, 6, (t1, t2) -> t1 * t2));
		
	}
	public static int sum(int a, int b) {
		return a + b;
	}
	public static int haha(int a, int b, test1 test) {
		return test.operate(a, b);
	}
}
