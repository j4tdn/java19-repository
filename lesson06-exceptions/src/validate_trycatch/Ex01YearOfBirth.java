package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

/**
 * Yêu cầu: Nhập vào năm sinh
 * 			Tính tuổi của sinh viên 
 *
 */
public class Ex01YearOfBirth {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	
	System.out.println("=======\n");
	int currentYear = Year.now().getValue();
	System.out.println("current year: " + currentYear);
	
	System.out.println("\nEnter year of birth: ");
	int yob = Integer.parseInt(ip.nextLine());
	
	System.out.println("\n------ Result ------");
	
	int yourAge = currentYear - yob + 1;
	System.out.println("\nYour age: " + yourAge);
	
	System.out.println("\n=====");
	ip.close();
}
// Thay vì dùng chương trình khi bị ngoại lệ
//-> In thông tin lỗi ra và yêu cầu người dùng thao tác lại
}
