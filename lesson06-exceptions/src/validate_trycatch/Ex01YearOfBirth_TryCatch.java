package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth_TryCatch {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("==__== *** ==__==\n");
		
		int currentYear = Year.now().getValue();
		System.out.println("Current year: " + currentYear);
		
		
		
		// đoạn code Integer.parseInt(ip.nextLine()) có khả năng
		// xảy ra ngoại lệ
		// đặt đoạn mã vào khối try
		int yob = 0;
		System.out.print("\nEnter year of birth: ");
		
		do {
			try {
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException nfe) {
				// default generated code --> Exception
				// --> bắt được mọi lỗi ở trong Java Exception
				// --> convention: khuyến khích catch đúng exception
				// để biết lỗi, nguyên nhân lỗi nào vì sao phải catch
				// Exception cha có thể bắt Exception con
				
				// Nếu khi mình ko bắt lỗi --> JVM ném ra đoạn mã đỏ đỏ
				// Mặc định JVM sẽ gọi hàm e.printStackTrace để in lỗi
				// nfe.printStackTrace();
				System.out.print("Please enter valid number: ");
			}
		} while(true);
		
		
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