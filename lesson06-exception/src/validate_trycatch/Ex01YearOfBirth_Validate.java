package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth_Validate {
	public static void main(String[] args) {

		System.out.println("1 -> " + ("a").matches("[0-9]"));
		System.out.println("2 -> " + ("5").matches("[0-9]"));
		System.out.println("3 -> " + ("&").matches("[0-9]"));
		System.out.println("4 -> " + ("%").matches("\\d"));
		System.out.println("5 -> " + ("9").matches("[0-9]{3,5}"));
		System.out.println("5 -> " + ("18").matches("[0-9][0-9]"));
		System.out.println("5 -> " + ("18").matches("[0-9]{2}"));
		System.out.println("5 -> " + ("13243").matches("\\d+"));
		Scanner ip = new Scanner(System.in);

		System.out.println("=======\n");
		int currentYear = Year.now().getValue();
		System.out.println("current year: " + currentYear);

		System.out.println("\nEnter year of birth: ");
		String yobAssString = ip.nextLine();
		// validate... là 1 chuỗi số hợp lệ trước khi
		// convert sang int bằng hàm Integer.parseInt()
		do {
			yobAssString = ip.nextLine();
			// stringVariable.matches(regular expression || regex pattern || biểu thức chính
			// quy)
			// biểu thức chính quy(string): là 1 bộ/tập hợp các cú pháp/ từ điển để kiểm tra
			// VD: yêu cầu kiểm tra chuỗi yob... có phải là 1 chuỗi số hợp lệ hay không
			// chuỗi số hợp lệ: ít nhất là 1 kí tự >=
			if (yobAssString.matches("\\d+")) {
				break;
			}
			System.out.println("Please enter valid number(s): ");
		} while (true);
		int yob = Integer.parseInt(yobAssString);
		System.out.println("\n------ Result ------");

		int yourAge = currentYear - yob + 1;
		System.out.println("\nYour age: " + yourAge);

		System.out.println("\n=====");
		ip.close();
	}
// Thay vì dùng chương trình khi bị ngoại lệ
//-> In thông tin lỗi ra và yêu cầu người dùng thao tác lại
}