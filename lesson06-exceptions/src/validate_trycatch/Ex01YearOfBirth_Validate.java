package validate_trycatch;

import java.time.Year;
import java.util.Scanner;

/*
 *  yêu cầu : nhập vào năm sinh (số nguyên & <= năm hiện tại)
 *  tính tuổi của ứng viên
 */
public class Ex01YearOfBirth_Validate {
     public static void main(String[] args) {
    	 Scanner ip = new Scanner(System.in);
    	 
    	 System.out.println("==_==***==_==\n");
    	 
    	 int currentYear = Year.now().getValue();
    	 System.out.println("Current year :"+currentYear);
    	 
    	 
    	 System.out.println("\nEnter year of birth :");
    	 
    	 String yonAsString = ip.nextLine();
    	 // validate yonAsString là 1 CHUỖI số hợp lệ trước khi
    	 // convert sang int bằng hàm Integer.parseInt
    	 do {
    		 yonAsString = ip.nextLine();
    		 if(yonAsString.matches("\\d+")) {
    			 break;
    		 }
    		 System.out.println("Please enter validate number(s)");
    	 } while (true);
    	
    	 
    	 int yob = Integer.parseInt(ip.nextLine());
    	
    	 System.out.println("\n---------");
    	 
    	 int yourAge = currentYear - yob +1;
    	 System.out.println(" \nYou age -->"+yourAge);
    	 
    	 System.out.println("\n==_== *** ==_==");
    	 
    	 ip.close();
    	 
    	 /*
    	  * JVM ném ra khi code bị lỗi tại dòng Ex01YearOfBirth
    	   Exception in thread "main" java.lang.NumberFormatException: For input string: "mothaiba"
	          at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	          at java.base/java.lang.Integer.parseInt(Integer.java:668)
	          at java.base/java.lang.Integer.parseInt(Integer.java:786)
	          at validate_trycatch.Ex01YearOfBirth.main(Ex01YearOfBirth.java:21)
    	   
    	   thay vì dừng ct vì bị ngoại lệ
    	   --> In thông tin lỗi ra và yêu cầu người dùng thao tác lại
    	   --> tối đa 3 lần --> thoát ct
    	  */
    	 
     }
}
