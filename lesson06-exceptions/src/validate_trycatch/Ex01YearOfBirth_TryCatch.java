package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

/**
 * Yêu cầu: Nhập vào năm sinh (số nguyên & <= năm hiện tại) Tính tuổi của ứng
 * viên
 * 
 * @author Admin
 *
 */
public class Ex01YearOfBirth_TryCatch {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int currentYear = Year.now().getValue();
		System.out.println("=======");
		System.out.println("current year: " + currentYear);

		// đặt đoạn mã có khả năng ngoại lệ vào khối try

		int yob = 0;
		System.out.print("Enter year of birth: ");
		do {

			try {
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException nfe) {
				// default generated code --> Exception
				// bắt được mọi java exception
				// convention: khuyến khích catch đúng lỗi
				// để biết lỗi, nguyên nhân
				// exception cha có thể bắt exception con

				// Khi JVM bắt lỗi có đoạn mã đỏ:
				// dùng hàm:
				// nfe.printStackTrace();

				System.out.println("Please enter valid number");
			}
		} while (true);
		int yourAge = currentYear - yob + 1;
		System.out.println("your age: " + yourAge);
		System.out.println("=======");
		ip.close();

		/*
		 * JVM ném ra jhi code bị lỗi tại dòng 21 Exception in thread "main"
		 * java.lang.NumberFormatException: For input string: "asd" at
		 * java.base/java.lang.NumberFormatException.forInputString(
		 * NumberFormatException.java:67) at
		 * java.base/java.lang.Integer.parseInt(Integer.java:668) at
		 * java.base/java.lang.Integer.parseInt(Integer.java:786) at
		 * validate_trycatch.Ex01YearOfBirth.main(Ex01YearOfBirth.java:21)
		 * 
		 */
		/*
		 * Thay vì dừng chương trình khi bị ngoại lệ thì: In thông tin lỗi và yêu cầu
		 * người dùng thao tác Tối đa n lần -> thoát chương trình
		 * 
		 */
	}

}
