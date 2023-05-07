package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

/**
 * Requirements: Enter year of birth (int & <= current year) : Calculate age of
 * candidate.
 * 
 * @author USER
 *
 */
public class Ex01YearOfBirth_TryCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=============================\n");

		int currentYear = Year.now().getValue();
		System.out.println("Current Year: " + currentYear);

		int yob = 0;
		System.out.print("\nEnter year of birth: ");
		do {
			try {
				yob = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				// convention: catch specific exception --> know reason why?
				// Default: JVM call e.printStackTrace() to print/throw exception.
				e.printStackTrace();
				// ATE.PPIntstackiPacet);
				System.out.print("\nPlease enter valid number: ");
			}
		} while(true);

		System.out.println("\n---------------\n");

		int yourAge = currentYear - yob + 1;
		System.out.println("Your age --> " + yourAge);

		System.out.println("\n=============================");
		sc.close();
	}
}
/*
 * Exception in thread "main" java.lang.NumberFormatException: For input string: "ád"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at validate_trycatch.Ex01YearOfBirth.main(Ex01YearOfBirth.java:23)
	
	--> Thay vì dừng chương trình khi bị ngoại lệ 
 */
  
 

