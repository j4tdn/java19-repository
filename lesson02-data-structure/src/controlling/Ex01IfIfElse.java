package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfIfElse {
	public static void main(String[] args) {
		Random rd = new Random();
		 int n = rd.nextInt(12);
		 boolean isEven = (n % 2 == 0);
		 
		 if (isEven == true) {
			 System.out.println("n chẵn");
		 }
		 else System.out.println("n lẻ");
		 
		 
		 String password = "123456";
		 System.out.println("Password length: "+ password.length());
		 if (password.length() >= 8) {
			 System.out.println("Hợp lệ");
		 }
		 else {
			 System.out.println("Mật khẩu ít nhất 8 kí tự");
		 }
		 
		 BigDecimal avgPointBd = BigDecimal.valueOf(rd.nextFloat() * 10).setScale(1, RoundingMode.HALF_UP);
		 float avgPoint = avgPointBd.floatValue();
		 System.out.println("avgPoint: " + avgPoint);
		 
		 if( avgPoint < 5) {
			 System.out.println("Học lực yếu");
		 } else if( avgPoint < 6) {
			 System.out.println("Học lực trung bình");
		 } else if( avgPoint < 8) {
			 System.out.println("Học lực khá");
		 } else {
			 System.out.println("Học lực giỏi");
		 }
		 
		 
	}
}
