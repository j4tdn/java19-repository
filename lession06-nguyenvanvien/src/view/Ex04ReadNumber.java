package view;

import java.util.Scanner;

import exception.custom.NumberValidator;

public class Ex04ReadNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		NumberValidator numberValidator;
		String number;
		do {
			System.out.print("Please Enter Number : ");
			number = scanner.nextLine();
			numberValidator = new NumberValidator();
			try {
				if (numberValidator.validateNumber(number, number.length())) {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (true);
		readNumber(number);
	}

	private static void readNumber(String number){
		String[] firstNumber = {"không","một","hai","ba","bốn","năm","sáu","bảy","tám","chín"};
		String[] twoNumber = {"không","mốt","hai","ba","tư","lăm","sáu","bảy","tám","chín"};
		switch (number.length()){
		case 1: {
			System.out.println(firstNumber[Integer.parseInt(number)]);
			break;
		}
		case 2: {
			if(number.equals("10")) 
			{
				System.out.println("mười");
				break;
			}
			String num = firstNumber[convertCharToInt(number.charAt(0))] + " mươi ";
			if (number.charAt(1) != '0')
				num += twoNumber[convertCharToInt(number.charAt(1))];
			System.out.println(num);
			break;
		}
		case 3: {
			String num = firstNumber[Integer.parseInt(number)/100] + " trăm ";
			if(number.charAt(1) =='0'){
				if (number.charAt(1) !='0')
					num += " lẻ ";
			}
			else num += firstNumber[convertCharToInt(number.charAt(1))]+" mươi ";
			if(number.charAt(1) !='0'){
				num +=twoNumber[convertCharToInt(number.charAt(1))];
			}
			System.out.println(num);
			break;
		}
		}
	}
	private static int convertCharToInt(char charNum) {
		return Integer.parseInt(String.valueOf(charNum));
	}
}
