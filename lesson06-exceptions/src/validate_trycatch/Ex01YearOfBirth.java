package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

/**
 * Yêu cầu: Nhập vào năm sinh(số nguyên & <= năm hiện tại)
 *        : Tính tuổi của ứng viên
 * 
 * @author qphan
 */
public class Ex01YearOfBirth {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("==__== *** ==__==\n");
		
		int currentYear = Year.now().getValue();
		System.out.println("Current year: " + currentYear);
		
		System.out.print("\nEnter year of birth: ");
		int yob = Integer.parseInt(ip.nextLine());
		
		System.out.println("\n----- Result -----");
		
		int yourAge = currentYear - yob + 1;
		System.out.println("\nYour age --> " + yourAge);
		
		System.out.println("\n==__== *** ==__==");
		
		ip.close();
		
		/*
		 JVM ném ra khi code bị lỗi tại dòng Ex01YearOfBirth.java:23
		 ------------------------
		 Exception in thread "main" java.lang.NumberFormatException: For input string: "mothaiba"
			at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
			at java.base/java.lang.Integer.parseInt(Integer.java:668)
			at java.base/java.lang.Integer.parseInt(Integer.java:786)
			at validate_trycatch.Ex01YearOfBirth.main(Ex01YearOfBirth.java:23)
			
			Thay vì dừng chương trình khi bị ngoại lệ
			--> In thông tin lỗi ra và yêu cầu người dùng thao tác lại
			--> Tối đa 3 lần --> thoát chương trình
		 */
	}
}
