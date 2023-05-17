package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth_TryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int currentYear = Year.now().getValue();
		System.out.println("=======");
		System.out.println("current year: " + currentYear);
		
		int yob = 0;
		
		do {
			try {
				System.out.print("Enter year of birth: ");
				yob = Integer.parseInt(ip.nextLine());
			break;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("Please enter valid number(s): ");
			}
		}while(true);
		
		int yourAge = currentYear - yob + 1;
		System.out.println("your age: " + yourAge);
		System.out.println("=======");
		ip.close();
		
		/*
		 * JVM ném ra khi code bị lỗi tại dòng 21
		 * Exception in thread "main" java.lang.NumberFormatException: For input string: "asd"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.parseInt(Integer.java:786)
	at validate_trycatch.Ex01YearOfBirth.main(Ex01YearOfBirth.java:21)
			
		 */
		/*
		 * Thay vì dừng chương trình khi bị ngoại lệ thì:
		 * 	In thông tin lỗi và yêu cầu người dùng thao tác 
		 * 	Tối đa n lần -> thoát chương trình
		 *  
		 */
	}

}

