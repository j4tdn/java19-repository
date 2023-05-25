package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

/*
 *  yêu cầu : nhập vào năm sinh (số nguyên & <= năm hiện tại)
 *  tính tuổi của ứng viên
 */
public class Ex01YearOfBirth_TryCatch {
     public static void main(String[] args) {
    	 Scanner ip = new Scanner(System.in);
    	 
    	 System.out.println("==_==***==_==\n");
    	 
    	 int currentYear = Year.now().getValue();
    	 System.out.println("Current year :"+currentYear);
    	 
    	 
    	
    	
    	 
    	 int yob = 0;
    	 System.out.println("\nEnter year of birth :");
    	 do {
    		 try {
        		 
        		 yob = Integer.parseInt(ip.nextLine());
        		 break;
    		} catch (NumberFormatException nfe) {
    			// default generated code --> Exception
    			// --> bắt được mọi lỗi trong java Exception
    			// --> convention : khuyến khích catch đúng exception
    			// để biết lỗi , nguyên nhân vì sao phải catch
    			// exception cha có thể bắt exception con
    			// nếu khi k bắt lỗi --> JVM ném ra 1 đoạn mã đỏ
    			// mặc định JVM sẽ gọi hàm e.printStackTrace để in lỗi
    			System.out.println(" Please enter valid number :");
    		}
    	 } while (true);
    	 
     }
}
