package view;

public class Ex03FactorialOfNumber {
	public static void main(String[] args) {
		int n = 5;
		
		System.out.println("Fact of " + n + " is: " + countFactOfNumber(n));
	}

	public static int countFactOfNumber(int number) {
		int factorial = 1;
		for (int i = number; i >= 1; i--) {
			factorial *= i;
		}
		return factorial;
	}
}
