package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

/**
 * enter year of birth (integer <= current year)
 * ==>
 * @author HP
 *
 */
public class Ex01YearOfBirth_Validate {
	public static void main(String[] args) {
		
		//[0-9]--> chuoi co phai la 1 so nguyen hay khong
		//\d   --> chuoi co phai la 1 so nguyen hay khong
		//{1,} --> yeu cau 1 hoac nhieu ky tu
		// +   --> yeu cau 1 hoac nhieu ky tu 
		
		System.out.println("1 --> " + ("5").matches("[0-4]"));
		System.out.println("2 --> " + ("2").matches("[0-9]"));
		System.out.println("3 --> " + ("3").matches("\\d"));
		System.out.println("4 --> " + ("3").matches("[0-9]{1,}"));
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****************\n");
		
		int currentYear = Year.now().getValue();
		System.out.println("curreent year: " + currentYear);
		
		System.out.println("\nEnter year of birth: ");
		
		String yobAsString = "";
		
		//validate yobAsString la 1 chuoi so hop le
		//truoc khi convert sang int
		
		do {
			yobAsString = sc.nextLine();
			if (yobAsString.matches("\\d+")) {
				break;
			}
			System.out.println("\nplease enter valid number(s): ");
		} while (true);
		
		int yob = Integer.parseInt(yobAsString);
	
		System.out.println("\n---------------");
		
		int yourAge =  currentYear - yob + 1;
		System.out.println("\nyour age --> " + yourAge);
		
		System.out.println("\n*****************");
		
		/*
		 * JVM nem ra khi code bi loi tai dong 22
		 * Exception in thread "main" java.lang.NumberFormatException: For input string: "mothaiba"
			at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
			at java.base/java.lang.Integer.parseInt(Integer.java:668)
			at java.base/java.lang.Integer.parseInt(Integer.java:786)
			at validate_trycatch.Ex01YearOfBirth.main(Ex01YearOfBirth.java:22)
			
		 */
	}
}
