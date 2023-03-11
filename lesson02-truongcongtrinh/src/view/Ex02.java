package view;

import java.util.Scanner;

public class Ex02 {
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
		if(isPowerOf2(Integer.parseInt(n))) System.out.println(n + " la luy thua cua 2");
		else System.out.println(n+ " la khong luy thua cua 2");
	}
	
	public static boolean isPowerOf2(Integer number) {
		if(number == 1) return true;
		Double s = (Math.log(number)/Math.log(2));
		if(Ex01.isValidIntNumber(s.toString())) return true;
		return false;
	}

	
}
