package view;

import java.util.Scanner;

import exception.custom.NumberValidator;

public class Ex01FirstDegreeEquation {
	public static void main(String[] args) {
		String coefficientA ;
		String coefficientB ;
		
		Scanner ip = new Scanner(System.in);
		
		NumberValidator numberValidator = new NumberValidator();
		
		do {
			System.out.print("Please Enter Number A: "); 
			coefficientA = ip.nextLine();
			System.out.print("\nPlease Enter Number B: "); 
			coefficientB = ip.nextLine();
			try {
				if(numberValidator.validateType(coefficientA,coefficientB)) {
					if(numberValidator.zeroValidate(Double.parseDouble(coefficientA)))
						break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(">>> Please enter valid number(s)");
		}while(true);
		Double result = -Double.parseDouble(coefficientB)/Double.parseDouble(coefficientA);
		System.out.println("Result is : " + Math.round(result * 100.0) / 100.0);
	}
}
