package controling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfIfElse {
	public static void main(String[] args) {
		//cho(nhập từ bàn phím(scanner) || tạo biến và gán giá trị không cần nhập
		
		//cho 1 số nguyên dương N --> kiểm tra N chẵn hay lẻ
		//nếu như là số chẵn thì in ra
		//nếu là số lẻ thì không làm gì cả
		Random rd = new Random();
		
		int n = rd.nextInt(12);
		System.out.println("Gia tri n --> "+ n);
		
		//boolean isEven = (n %2 == 0);
		/*
		 * expression --> nhận vào 1 biến kiểu true | false
		 * và cũng có thể nhận vào 1 biểu thức,hàm trả về true false
		 * 
		 * if(expression) --> expression:boolean
		 * if(expression == true) --> if(expression)
		 * if(expression == false) --> !if(expression)
		 * 
		 * if(isEven)  --> nhận biến
		 * if(n%2 == 0) --> nhận biểu thức
		 * if(isEven(n) --> nhận hàm
		 */
		if (isEven(n)) {
			System.out.println("Bien n la so chan");
		}
		
		
		//cho 1 chuỗi kí tự(mật khẩu) -->kiểm tra xem độ dài của mật khẩu đã thỏa mãn yêu cầu chưa
		//nếu độ dài mật khẩu >= 8 --> mật khẩu hợp lệ
		//nếu độ dài mật khẩu <8 --> mật khẩu có ít nhất 8 kí tự, vui lòng nhập lại
		String password = "abc123";
		int length = password.length();
		System.out.println("Password length: "+ length);
		
		if(length >= 8) {
			System.out.println("Mat khau hop le");
		} else {
			System.out.println("Mat khau co it nhat 8 ki tu, vui long nhap lai");
		}
		System.out.println("\n=====================\n");	
		//cho đầu vào điểm tb của học sinh, yêu cầu [0,10]
		//(0,5) --> học lực yếu
		//[5,6.
		
		//float avgPoint = rd.nextFloat() * 10;
		BigDecimal avgPointBd = BigDecimal.valueOf(rd.nextFloat() * 10).setScale(1, RoundingMode.HALF_UP);
		float avgPoint = avgPointBd.floatValue();
		System.out.println(avgPoint);

		if (avgPoint < 5) {
			System.out.println("Hoc luc yeu");
		} else if (avgPoint < 6.5) {
			System.out.println("Hoc luc trung binh");
		} else if (avgPoint < 8) {
			System.out.println("Hoc luc kha");
		} else {
			System.out.println("Hoc luc gioi");
		}
		System.out.println("\n=====================\n");
		
		
		//thay thế if else else if bằng toán tử 3 ngôi
		//nên làm cho những trường hợp đơn giản
		//(expression) ? statement_if_true : statement_if_false;
		
		String message1st = isEven(n) ? "Bien n la so chan" : "";
		System.out.println("VD 1: message -->" + message1st);
		
		String message2nd = password.length() >= 8 ? "Mat khau hop le" : "Mat khau co it nhat 8 ki tu, vui long nhap lai";
		System.out.println("VD 2: message1st --> " + message2nd);
		System.out.println("\n=====================\n");
		
		

		
		System.out.println("Ket thuc chuong trinh");
	}
	private static boolean isEven(int input) {
		return input % 2 == 0;
	}
}
