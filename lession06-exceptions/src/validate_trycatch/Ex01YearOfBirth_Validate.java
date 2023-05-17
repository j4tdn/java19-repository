package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

/**
 * Yêu cầu : Nhập vào năm sinh (số nguyên 
 * & <= năm hiện tại : tính số tuổi của ứng viên hiện tại)
 * @author ADMIN
 *
 */
public class Ex01YearOfBirth_Validate {
	public static void main(String[] args) {
		
		// [0-9] --> chuỗi có phải là 1 số nguyên hay không
		// \d	 --> chuỗi có phải là 1 số nguyên hay không
		// {1,}  --> yêu cầu 1 hoặc nhiều ký tự
		// +  	 --> yêu cầu 1 hoặc nhiều ký tự
		
		System.out.println("1--> " + ("a").matches("[0-9]"));
		System.out.println("2--> " + ("5").matches("[0-9]"));
		System.out.println("3--> " + ("&").matches("[0-9]"));
		System.out.println("4--> " + ("977").matches("\\d+"));
		
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("==__== *** ==__==\n");
		int currentYear = Year.now().getValue();
		System.out.println("Current year : " + currentYear);
		
		System.out.print("\nEnter year of birth: ");
		String yobAsString = "";
		// validate yobAsString là 1 chuỗi số hợp lệ 
		// trước khi convert sang int bằng hàm Integer.pareInt(...)
		do {
			yobAsString = ip.nextLine();
			if(yobAsString.matches("\\d+")) {
				break;
			}
			System.out.println(">>> Please enter valid number(s): ");
		}while(true);
		int yob = Integer.parseInt(yobAsString);
		
		System.out.println("\n---------------");
		int yourAge = currentYear - yob +1;
		System.out.println("\nYou age --> " + yourAge);
				
		System.out.println("==__== *** ==__==\n");
		ip.close();
	}
	
	/*
	 * Exception in thread "main" java.lang.NumberFormatException: For input string: "ghjh"
		at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
		at java.base/java.lang.Integer.parseInt(Integer.java:665)
		at java.base/java.lang.Integer.parseInt(Integer.java:781)
		at validate_trycatch.Ex01YearOfBirth.main(Ex01YearOfBirth.java:21)
		
		Thay vì dừng chương trình thì in thông tin lỗi và yêu 
		cầu người dùng thao tác lại
	 * */
}
