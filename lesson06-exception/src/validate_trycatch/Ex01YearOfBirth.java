package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

/*/
 * Yeu cau: Nhap vao nam sinh(so nguyen && <= nam hien tai)
 *        : Tinh tuoi cua ung vien
 * 
 */
public class Ex01YearOfBirth {
    public static void main(String[] args) {
		
    	Scanner ip = new Scanner(System.in);
    	
    	System.out.println("===(^-^)===\n");
    	int currentYear = Year.now().getValue();
    	
    	System.out.println("Current year: " + currentYear);
    	
    	System.out.print("\nEnter year of birth: ");
    	int yob = Integer.parseInt(ip.nextLine());
    	
    	int yourAge = currentYear - yob + 1;
    	System.out.println("Your age --->" + yourAge);
    	
    	System.out.println("\n===(^-^)===\n");
        ip.close();
        
        /*/
         * Thay vi dung chuong trinh khi bi ngoai le
         * --> In thong tin loi ra va yeu cau nguoi dung thao tac lai
         * Toi da 3 lan --> thoat chuong trinh
         */
	}
}
