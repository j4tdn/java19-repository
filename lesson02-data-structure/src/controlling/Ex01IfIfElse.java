package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfIfElse {
	public static void main(String[] args) {
		//cho(nhập từ bàn phím(scanner) || tạo và gán giá sẵn giá trị)
		
		//cho 1 số nguyên dương N --> kiểm tra N chẵn hay lẽ
		//nếu như là số chẵn thì in ra
		//nếu là số lẻ thì k làm gì cả
		Random rd = new Random();
		
		int n = rd.nextInt(12);
		System.out.println("Giá trị n: " + n);
		
		//boolean isEven = (n % 2 == 0);
		//expression --> nhập vào 1 biến kiểu true|false
		//và cũng có thể nhận vào 1 biểu thức, hàm trả về true false
		
		//if (expression) --> expression: boolean
		//if (expression == true) --> if (expression)
		//if (expression == false) --> if (!expression)
		
		//if(isEven)     --> nhận biến
		//if(n % 2 == 0) --> nhận biểu thức
		//if(isEven(n))  --> nhận hàm
		
		
		if (isEven(n)) {
			System.out.println("Biến n là số chẵn");
		}
		
		//cho 1 chuỗi kí tự(mật khẩu) --> kiểm tra độ dài của mật khẩu đã thoả mãn yêu cầu chưa
		//nếu độ dài mật khẩu >= 8 --> Mật khẩu hợp lệ
		//nếu độ dài mật khẩu < 8 --> mật khẩu có ít nhất là 8 kí tự, vui lòng nhập lại
		String password = "a1sdfghj";
		int length = password.length();
		
		System.out.println("password length: " + length);
		
		//boolean isGreaterThan8 = (length >= 8);
		if (length >= 8) {
			System.out.println("Mật khẩu hợp lệ");
		} else {
			System.out.println("mật khẩu có ít nhất là 8 kí tự, vui lòng nhập lại");
		}
		
		System.out.println("\n-----------------\n");
		//nếu ĐTB(0, 5) --> học lực yếu
		//nếu ĐTB(5, 6.5) --> học lực trung bình
		//nếu ĐTB(6.5, 8) --> học lực khá
		//nếu ĐTB(8, 10) --> học lực giỏi
		
		//scale(1) // [0.#####, 10.0) --> expect: [0.0, 10.0]
		BigDecimal avgPointBd = BigDecimal.valueOf(rd.nextFloat() * 10).setScale(1, RoundingMode.HALF_UP);
		float avgPoint = avgPointBd.floatValue();
		System.out.println("avgPoint: " + avgPoint);
		
		if (avgPoint < 5) {
			System.out.println("học lực yếu");
		} else if (avgPoint < 6.5) {
			System.out.println("học lực trung bình");
		} else if (avgPoint < 8) {
			System.out.println("học lực khá");
		} else {
			System.out.println("học lực giỏi");
		}
		System.out.println("\n-----------------\n");
		
		String message1st = isEven(n) ? "Biến n là số chẵn" : "";
		System.out.println("VD 1: message --> " + message1st);
		
		String message2nd = password.length() >= 8 ?"Mật khẩu hợp lệ" : "mật khẩu có ít nhất là 8 kí tự, vui lòng nhập lại";
		System.out.println("message2nd: " + message2nd);
		
		
		System.out.println("kết thúc chương trình");
	}
	
	//even: chẵn 
	//odd: lẻ 
	private static boolean isEven(int input) {
		return input % 2 == 0;
	}

}
