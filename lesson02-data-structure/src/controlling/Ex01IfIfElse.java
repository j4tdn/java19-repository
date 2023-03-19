package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfIfElse {
	public static void main(String[] args) {
		// cho(nhập từ bàn phím(scanner) || tạo biến và gán sẵn giá trị ko cần nhập)
		
		// cho 1 số nguyên dương N --> kiểm tra N chẵn hay lẻ
		// nếu như là số chẵn thì in ra
		// nếu là số lẻ thì ko làm gì cả
		Random rd = new Random();
		
		int n = rd.nextInt(12);
		System.out.println("Giá trị n --> " + n);
		
		// boolean isEven = (n % 2 == 0);
		// expression --> nhận vào 1 biến kiểu true|false 
		// và cũng có thể nhận vào 1 biểu thức, hàm trả về true false
		
		// if (expression) --> expression: boolean
		// if (expression == true)  --> if (expression)
		// if (expression == false) --> if (!expression)
		
		// if(isEven)     --> nhận biến
		// if(n % 2 == 0) --> nhận biểu thức
		// if(isEven(n))  --> nhận hàm
		
		// boolean isEven = (n % 2 == 0) và if (isEven) --> if(n % 2 == 0)
		if (isEven(n)) {
			System.out.println("Biến n là số chẵn");
		}
		
		
		// cho 1 chuỗi kí tự(mật khẩu) --> kiểm tra xem độ dài của mật khẩu đã thỏa mãn yêu cầu chưa
		// nếu độ dài mật khẩu >= 8 --> Mật khẩu hợp lệ
		// nếu độ dài < 8 --> mật khẩu có ít nhất là 8 kí tự, vui lòng nhập lại
		String password = "cpk5tty12";
		int length = password.length();
		
		System.out.println("Password length: " + length);
		
		// boolean isGreaterThan8 = (length >= 8);
		if (length >= 8) {
			System.out.println("Mật khẩu hợp lệ");
		} else {
			System.out.println("Mật khẩu có ít nhất là 8 kí tự, vui lòng nhập lại");
		}
		
		System.out.println("\n===================\n");
		// cho đầu vào điểm trung bình của học sinh, yêu cầu [0, 10]
		// nếu DTB [0, 5)     --> Học lực yếu
		// nếu DTB [5, 6.5)   --> Học lực trung bình
		// nếu DTB [6.5, 8.0) --> Học lực khá
		// nếu DTB [8, 10]    --> Học lực giỏi
		
		// scale(1) --> [0.#####, 10.0) --> expect: [0.0, 10.0]
		BigDecimal avgPointBd = BigDecimal.valueOf(rd.nextFloat() * 10).setScale(1, RoundingMode.HALF_UP);
		float avgPoint = avgPointBd.floatValue(); // [0, 10]
		System.out.println("avgPoint: " + avgPoint);
		
		if (avgPoint < 5) {
			System.out.println("Học lực yếu");
		} else if (avgPoint < 6.5) {
			System.out.println("Học lực trung bình");
		} else if (avgPoint < 8) {
			System.out.println("Học lực khá");
		} else {
			System.out.println("Học lực giỏi");
		}
		
		System.out.println("\n==================\n");
		
		// thay thế if else .. else ... if bằng toán tử 3 ngôi
		// nên làm cho trường hợp đơn giản
		// (expression) ? statement_if_true : statement_if_false;
		
		
		String message1st = isEven(n) ?  "Biến n là số chẵn" : "";
		System.out.println("VD 1: message --> " + message1st);
		
		String message2nd = password.length() >= 8 ? "Mật khẩu hợp lệ" : "Mật khẩu có ít nhất là 8 kí tự, vui lòng nhập lại";
		System.out.println("VD 2: message --> " + message2nd);
		
		// 1st: first
		// 2nd: second
		// 3rd: third
		String message3rd = (avgPoint < 5) ? "Học lực yếu" 
										   : (avgPoint < 6.5) ? "Học lực trung bình" 
										   : (avgPoint < 8)   ? "Học lực khá"
										   : "Học lực giỏi";
		System.out.println("VD 3: message --> " + message3rd);
		
		
		System.out.println("Kết thúc chương trình");
	}
	
	// even: chẵn
	// odd: lẻ
	private static boolean isEven(int input) {
		return input % 2 == 0;
	}
}
