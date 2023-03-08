package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfIfElse {
	public static void main(String[] args) {
		// cho(nhập từ bàn phím || tạo biến và gán sẵn giá trị) 1 số nguyên dương N -> kiểm tra chẵn hay lẻ
		
		// nếu như là số chẵn thì in ra
		// nếu là số lẻ thì ko làm gì cả
		Random rd = new Random();
		int n = rd.nextInt(12);
		System.out.println("Giá trị của n: " + n);
		
		
		// if (isEven == true) -> if (isEven)
		// if (isEven == false) -> if(!expression)
		
		// if(isEven) -> nhận biến
		// if(n % 2 == 0) -> nhận biểu thức
		// if(isEven(n)) -> nhận hàm
		
		// boolean isEven = (n % 2 == 0) và if (isEven) = if(n % 2 == 0)
		if (n % 2 == 0) {
			System.out.println("Biến n là số chẵn");
		}
		// cho 1 chuỗi kí tự(mật khẩu) -> kiểm tra xem độ dài của mật khẩu đã thỏa mãn nhu cầu chưa
		// nếu độ dài mật khẩu >= 8 -> hợp lệ
		// nếu độ dài < 8 -> mật khẩu có ít nhất 8 kí tự, vui lòng nhập lại
		String password = "cpky12";
		int length = password.length();
		System.out.println("Password length: " + length );
		if (length >= 8) {
			System.out.println("Mật khẩu hợp lệ");
		}
		else {
			System.out.println("Mật khảu có ít nhất là 8 kí tự, vui lòng nhập lại");
		}
		System.out.println("\n================");
		BigDecimal avgPointBd = BigDecimal.valueOf(rd.nextFloat() * 10).setScale(1, RoundingMode.HALF_UP);
		float avgPoint = avgPointBd.floatValue(); // [0,10]
		System.out.println("avgPoint: " + avgPoint);
		if(avgPoint < 5) {
			System.out.println("Học lực yếu");
		}else if (avgPoint < 6.5) {
			System.out.println("Học lực trung bình");
		}else if (avgPoint < 8) {
			System.out.println("Học lực khá ");
		}else {
			System.out.println("Học lực giỏi");
		}
		//(expression) ? statement_if_true : statement_if_false
		String message1st = isEven(n) ? "Biến n là số chẵn:" :"";
		System.out.println("VD1: message -> " + message1st);
		
		String message2nd = password.length() >=8 ? "Mật khẩu hợp lệ" : "Mật khẩu có ít nhất 8 kí tự, vui lòng nhập lại";
		System.out.println("VD 2: message -> " + message2nd);
		String message3rd = (avgPoint < 5) ? "Học lực yếu" 
											:(avgPoint < 6.5) ? "Học lực trung bình" 
											:(avgPoint < 8)   ? "Học lực khá" 
											:				    "Học lực giỏi" ;
		System.out.println("VD3: message -> " + message3rd);
		System.out.println("Kết thúc chương trình");
	}
	private static boolean isEven(int input) {
		return input % 2 == 0;
		
		
	}
	

}
