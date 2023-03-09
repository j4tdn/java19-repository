package view;

public class bai03 {
	public static void main(String[] args) {
		int n = 10;
		System.out.println("Factorial of "+ n + " : " + factorialCal(n));
	}
	public static long factorialCal(int n) {
		for(int i = n-1; i>=2; i--) {
			n *= i;
		}
		return n;
	}
}
