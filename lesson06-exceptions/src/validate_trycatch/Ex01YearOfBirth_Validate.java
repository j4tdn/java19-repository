package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth_Validate {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("\n=============================\n");
		int currentYear = Year.now().getValue();
		System.out.println("current year: " + currentYear);
		System.out.println("Enter year of birth: ");
		String  yobAsString = "";
		do {
			yobAsString = ip.nextLine();
			if(yobAsString.matches("\\d+")) {
				break;
			}
			System.out.println("Please enter valid number(s): ");
		}while(true);
		int yob = Integer.parseInt(yobAsString);
		 
		System.out.println("-------------");
		int yourAge = currentYear - yob + 1;
		
		System.out.println("yourAge --> " + yourAge);
		
		
		System.out.println("\n=============================\n");
		ip.close();
		/*
		 * Exception in thread "main" java.lang.NumberFormatException: For input string: "adsda"
			at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
			at java.base/java.lang.Integer.parseInt(Integer.java:665)
			at java.base/java.lang.Integer.parseInt(Integer.java:781)
			at validate_trycatch.Ex01YearOfBirth.main(Ex01YearOfBirth.java:14)
			
			Thay vi stop chuowng trinh khi bi ngoai le
			----> in ra thoong tin loi va yeu cau nguowi dung thao tac lai
			----> toi da 3 lan --> thoat chuong trinh
		 */
		
	}
}
