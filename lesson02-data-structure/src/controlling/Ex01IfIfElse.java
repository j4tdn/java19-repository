package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfIfElse {
	public static void main(String[] args) {
		//cho (Nhập từ bàn phím(Scanner) || tạo biến và gán sẵn giá trị không cần nhập)
		
		
		//   cho  1 số nguyên dương N --> kiểm tra N chẳn hay lẻ
		//Nếu như là số chẳn thì in ra
		//Nếu như là số lẻ thì không làm gì cả
		
		Random rd = new Random();
		int n = rd.nextInt(12);
		System.out.println("n -----> " + n);
		
		boolean isEven = (n % 2 == 0);
		//System.out.println("n: " + n);
		//System.out.println("isEven: " + isEven);
		//expression--> nhận vào 1 giá trị true|false và cũng có thể nhận
		//vào 1 biểu thức, hàm trả về true false
		
		//if(expression)--> expression: boolean
		//if(expression == true)--> if(expression)
		//if(expression == false)--> if(!expression)	
		//boolean isEven = (n % 2 == 0) và
		//if (isEven) --> nhận biến
		//if(n % 2 == 0) --> nhận biểu thức
		//if (isEven(n)) --> nhận hàm
		if(isEven(n)) {
			System.out.println("Biến isEven là số chẵn");
		}
		
		
		//Cho 1 chuổi kí tự(mật khẩu)--> kiểm tra độ dài của mật khẩu đã thỏa mãn yêu cầu chưa
		//Nếu độ dài mật khẩu >= 8 --> mật khẩu hợp lệ
		//Nếu độ dài mật khẩu <8 --> mật khẩu có ít nhất 8 kí tự, vui lòng nhập lại;
		
		String password = "12325682356923";
		int lenght = password.length();
		System.out.println("Password lenght: " + lenght);
		
		//boolean isGreaterThan8 = lenght >= 8;
		if(lenght >= 8) {
			System.out.println("Mật khẩu hợp lệ");
		}
		else {
			System.out.println("Mật khẩu có ít hơn 8 kí tự , vui lòng nhập lại");
			
		}
		
		String message1st = isEven(n) ? "Biến isEven là số chẵn" : "";
		System.out.println("VD1 message: " +message1st);
			
		
		
		//(expression) ? statement if true : statement_if_false;
		String message2nd = password.length() >= 8 ? "Mật khẩu hợp lệ":"Mật khẩu có ít nhất 8 kí tự, vui lòng nhập lại";
		System.out.println("VD2 message: " + message2nd);
		
		
		System.out.println("\n===============");
		//cho đầu vào là điểm trung bình của học sinh, yêu cầu[0,10]
		//Nếu DTB [0,5.0) --> học lực yếu
		//Nếu DTB  [5,6.5) --> học lực trung bình
		//Nếu DTB  [6.5,8.0) --> học lực khá
		//Nếu DTB  [8,10] --> học lực giỏi
		//scale(1)-->[0.######,10.0)-->expect: [0.0,10.0]	
		BigDecimal avgPointBd = BigDecimal.valueOf(rd.nextFloat() * 10).setScale(1,RoundingMode.HALF_UP);
		float avgPoint = avgPointBd.floatValue();
		System.out.println("avgpoint: " + avgPoint);
		//System.out.println("avgPointBd: " + avgPointBd);
		
		if( avgPoint <5) {
			System.out.println("Học lực yếu");
		}else if(avgPoint <6.5){
			System.out.println("Học lực trung bình");
		}else if(avgPoint <8){
			System.out.println("Học lực khá");
		} else {
			System.out.println("Học lực giỏi");
		}
		
		System.out.println("\n=========");
		//1st :first
		//2nd :second
		//3rd :third
		String message3rd = (avgPoint <5) ? "Học lực yếu"
											:(avgPoint <6.5) ? "Học lực trung bình"
											:(avgPoint <8)?	"Học lực khá" : "Học lực giỏi";
		System.out.println("message3rd --> " + message3rd );
										
		
		
	
		
		
		System.out.println("Kết thúc chương trình");
	}
	//even: chẵn
	//odd: lẻ
	private static boolean isEven(int input) {
		return input % 2 == 0;
	}

}
