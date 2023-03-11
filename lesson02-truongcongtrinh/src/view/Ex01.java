package view;

import java.util.Scanner;

public class Ex01 {
	public static boolean isValidIntNumber(String number) {
		for (int i = 0; i < number.length(); i++) {
			if(number.length()>=3 && number.charAt(number.length()-1)=='0' && number.charAt(number.length()-2)=='.') return true;
			if (!Character.isDigit(number.charAt(i)) || Math.ceil(Double.parseDouble(number))!=Math.floor(Double.parseDouble(number)) )
				return false;
		}
		return true;
	}

	public static boolean isEvenNumber(Integer number) {
		if (number % 2 != 0)
			return false;
		return true;
	}

	public static void main(String[] args) {
		Integer i = 0;
		String n;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter an integer: ");
			n = sc.nextLine();
			if (++i == 5)
				break;
		} while (!isValidIntNumber(n));
		if (isEvenNumber(Integer.parseInt(n)))
			System.out.println("N la boi cua 2");
		else
			System.out.println("N la khong boi cua 2");
	}
}
