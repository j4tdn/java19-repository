package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth_Validate {
	public static void main(String[] args) {
		System.out.println("\\");
		//[0-9]	--> chuỗi có phải số nguyên ko
		//\d 	--> chuỗi có phải số nguyên ko
		// --> [0-9] ~ \d
		// bỏ dấu \ ban đầu => \\d
		//{1,} 	--> yêu cầu 1 hay nhiều kí tự
		//+ 	--> yêu cầu 1 hay nhiều kí tự
		System.out.println("1 -->" + ("a").matches("[0-9]"));
		System.out.println("2 -->" + ("5").matches("[0-9]"));
		System.out.println("3 -->" + ("&").matches("[0-9]"));
		System.out.println("4 -->" + ("&").matches("[0-9]"));
		System.out.println("5 -->" + ("&").matches("[0-9]"));
		System.out.println("===");
		System.out.println("1 -->" + ("a").matches("\\d"));
		System.out.println("2 -->" + ("5").matches("\\d"));
		System.out.println("3 -->" + ("&").matches("\\d"));
		System.out.println("4 -->" + ("&").matches("\\d"));
		System.out.println("5 -->" + ("&").matches("\\d"));
		System.out.println("===");
		System.out.println("5 -->" + ("19").matches("[1-8][0-9]"));
		System.out.println("5 -->" + ("08").matches("[1-8][0-9]"));
		System.out.println("5 -->" + ("148").matches("[1-8]{3}"));
		System.out.println("5 -->" + ("14834").matches("[1-8]{3,5}"));
		System.out.println("5 -->" + ("1434128731").matches("[1-8]{1,}"));
		System.out.println("5 -->" + ("14934128731").matches("\\d+"));
	
		Scanner ip = new Scanner(System.in);
		int currentYear = Year.now().getValue();
		System.out.println("=======");
		System.out.println("current year: " + currentYear);
		System.out.print("\nEnter year of birth: ");
		
		String yobAsString = "";
		//validate yobAsString là 1 chuỗi số hợp lệ trước khi
		//convert sang int 
		
		do {
			yobAsString = ip.nextLine();
			//stringVariable.matches(regular expression || regex pattern || biểu thức chính quy)
			// biểu thức chính quy (string): là 1 bộ/ tập hợp các cú pháp / từ điển để kiểm tra 
			//tính hợp lệ của 1 chuỗi string
			
			//VD: kiểm tra có phải chuỗi số hợp lệ hay ko?
			//chuỗi số hợp lệ: ít nhất 1 kí tự
			//					tất cả phải là số nguyên
			if (yobAsString.matches("\\d+")) {
				break;
			}
			System.out.println("please enter valid number(s): ");
		} while (true);
		
		int yob = Integer.parseInt(yobAsString);
		int yourAge = currentYear - yob + 1;
		System.out.println("your age: " + yourAge);
		System.out.println("=======");
		ip.close();
		
		/*
		 * JVM ném ra jhi code bị lỗi tại dòng 21
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

