package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

/**
 * Yêu cầu: Nhập vào năm sinh(số nguyên & <= năm hiện tại)
 *        : Tính tuổi của ứng viên
 * 
 * @author qphan
 */
public class Ex01YearOfBirth_Validate {
	
	public static void main(String[] args) {
		
		// [0-9] --> chuỗi có phải là 1 số nguyên không
		// \d    --> chuỗi có phải là 1 số nguyên không
		// {1,}  --> yêu cầu 1 hoặc nhiều kí tự
		// +     --> yêu cầu 1 hoặc nhiều kí tự
		System.out.println("1 --> " + ("a").matches("[0-9]"));
		System.out.println("2 --> " + ("2").matches("[5-9]"));
		System.out.println("3 --> " + ("&").matches("[0-9]"));
		System.out.println("4 --> " + ("%").matches("\\d"));
		System.out.println("5 --> " + ("9").matches("\\d"));
		System.out.println("6 --> " + ("1834").matches("[0-9]{3,5}")); // 09 --> 19
		System.out.println("7 --> " + ("3456789").matches("\\d+"));
		
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("==__== *** ==__==\n");
		
		int currentYear = Year.now().getValue();
		System.out.println("Current year: " + currentYear);
		
		System.out.print("\nEnter year of birth: ");
		String yobAsString = "";
		// validate yobAsString là 1 [chuỗi]số hợp lệ trước khi
		// convert sang int bằng hàm Integer.parseInt(...)
		do {
			yobAsString = ip.nextLine();
			// stringVariable.matches(regular expression || regex pattern || biểu thức chính quy)
			// biểu thức chính quy(string): là 1 bộ/tập hợp các cú pháp/từ điển để kiểm tra
			// tính hợp lệ của 1 chuỗi(string) --> học kỹ trong bài String
			
			// VD: Yêu cầu kiểm tra chuỗi yobAsString có phải là 1 chuỗi số hợp lệ hay ko
			// chuỗi số hợp lệ: ít nhất là 1 kí tự >= 1 kí tự
			//                  tất cả phải là số nguyên
			if (yobAsString.matches("\\d+")) {
				break;
			}
			System.out.print("Please enter valid number(s): ");
		} while(true);
		
		int yob = Integer.parseInt(yobAsString);
		
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