package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

public class Ex02YearOfBirth {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("");
		int currentYear = Year.now().getValue();
		System.out.println("Current year: " + currentYear);
		
		int yob = 0;
		System.out.print("Enter year of birth: ");
//		int yob = Integer.parseInt(ip.nextLine());
		do{
			try {
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception");
			}
		} 
		while(true);
		int yourAge = currentYear - yob + 1;
		
		System.out.println("Your age --> "+ yourAge);
		

		
	}
}
