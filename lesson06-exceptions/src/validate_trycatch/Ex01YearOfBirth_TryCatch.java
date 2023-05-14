package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

/**
 * enter year of birth (integer <= current year) ==>
 * 
 * @author HP
 *
 */
public class Ex01YearOfBirth_TryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("*******************************\n");

		int currentYear = Year.now().getValue();
		System.out.println("curreent year: " + currentYear);

		int yob = 0;

		do {
			try {
				System.out.println("\nEnter year of birth: ");
				yob = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("\nplease enter valid number(s)!!!");
			}
		} while (true);

		System.out.println("\n========RESULT========");

		int yourAge = currentYear - yob + 1;
		System.out.println("\nyour age --> " + yourAge);

		System.out.println("\n*******************************");

		/*
		 * JVM nem ra khi code bi loi tai dong 22 Exception in thread "main"
		 * java.lang.NumberFormatException: For input string: "mothaiba" at
		 * java.base/java.lang.NumberFormatException.forInputString(
		 * NumberFormatException.java:67) at
		 * java.base/java.lang.Integer.parseInt(Integer.java:668) at
		 * java.base/java.lang.Integer.parseInt(Integer.java:786) at
		 * validate_trycatch.Ex01YearOfBirth.main(Ex01YearOfBirth.java:22)
		 * 
		 */
	}
}
