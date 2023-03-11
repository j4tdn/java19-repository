package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Integer i = 0;
		String n;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter an integer: ");
			n = sc.nextLine();
			if (++i == 5)
				break;
		} while (!Ex01.isValidIntNumber(n));
		System.out.println(calFraction(Integer.parseInt(n)));
	}
	
	public static Integer calFraction(int n) {
		if(n == 0) return 1;
		if(n == 1) return 1;
		return calFraction(n-1) * n;
	}
}
