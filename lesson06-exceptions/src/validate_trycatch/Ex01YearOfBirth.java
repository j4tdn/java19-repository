package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth {
	public static void main(String[] args) {
		Scanner ip =new Scanner(System.in);
		int currentYear = Year.now().getValue();
		System.out.println("curent year: "+currentYear);
		System.out.println("Enter year of birth: ");
		int yob =Integer.parseInt(ip.nextLine());
		System.out.println("-------");

		
		
	}
}
