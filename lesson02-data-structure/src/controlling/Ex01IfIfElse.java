package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfIfElse {
	public static void main(String[] args) {
		// cho (Nhận từ bàn phím(scanner)|| tạo ra một biến gán giá trị ko cần nhập)

		// cho 1 số nguyên dương N --> Kiểm tra N là chẳn hay lẽ
		// nếu là chắn thì in ra
		// nếu là lẻ thì không làm gì cả

		Random rd = new Random();
		int n = rd.nextInt(12);
		System.out.println("Giá trị n --> " + n);

		// boolean isEven = (n % 2 == 0);
		// expression--> nhận vào 1 biến kiểu true|false
		// và cũng có thể vào 1 biểu thức, hàm trả về true false
		// if(expression) --> expression : boolean
		// if (expression == true ) --> if(expression)
		// if (expression == false ) --> if(!expression)

		// if(isEven) --> nhận biến
		// if(n % 2 == 0) --> nhận biểu thức
		// if(isEven(n)) --> nhận hàm

		// boolean isEven = (n%2 == 0) và if (isEven) --> if()
		if (isEven(n)) {
			System.out.println("Biến isEven là số chẳn");
		}

		// cho 1 chuỗi kí tự(mật khẩu) --> kiểm tra xem độ dài của mật khẩu đã thỏa mãn
		// yêu cầu chưa
		// nếu độ dài mật khẩu >= 8 --> mật khẩu hợp lệ
		// nếu độ dài < 8 --> mật khẩu có ít nhất 8 kí tự, vui lòng nhập lại

		String password = "cpky12";
		int length = password.length();
		System.out.println("password length : " + length);

		// boolean isGreaterThen8 = (length >= 8);

		if (length >= 8) {
			System.out.println("Mật khẩu hợp lệ");
		} else {
			System.out.println("Mật khẩu có ít nhất 8 kí tự,vui lòng nhập lại");

		}
		System.out.println("\n================\n");
		// cho đầu vào điểm trung bình của học sinh, yêu cầu[0, 10]
		// nếu DTB [0, 5) ---> học lực yếu
		// nếu DTB [5, 6.5) ---> học lực trung bình
		// nếu DTB [6.5, 8.0) ---> học lực khá
		// nếu DTB [8.0, 10) ---> học lực giỏi

		// scale(1)
		;// [0.#####, 10.0) --> expect: [0.0, 10.0]
		BigDecimal avgPointBd = BigDecimal.valueOf(rd.nextFloat() * 10).setScale(1, RoundingMode.HALF_UP);
		float avgPoint = avgPointBd.floatValue();// [0, 10]

		System.out.println("avgPoint: " + avgPoint);

		if (avgPoint < 5) {
			System.out.println("Học lực yếu");
		} else if (avgPoint < 6.5) {
			System.out.println("Học lực trung bình");
		} else if (avgPoint < 8) {
			System.out.println("Học lực khá ");
		} else {
			System.out.println("Học lực giỏi");
		}
		
		String message3rd = (avgPoint <5) ? "Học lực yếu" :(avgPoint < 6) ? "Học lực trung bình" :
			(avgPoint <8) ? "Học lực khá" : "Học lực giỏi";	
		System.out.println("VD3 message: " + message3rd);
		 
		
		
		
		System.out.println("\n=============\n");
		
		// thay thế else ... else ... if bằng toán tử 3 ngôi
		//nên làm cho trường hợp đơn giản
		//(expression) ? statement_ì_true : statement_if_false;
		
		String message1st = isEven(n) ? "Biến isEven là số chẳn" : " "; 
		System.out.println("VD1 message: " + message1st);
		
		String message2nd = password.length() >= 8 ? "Mật khẩu hợp lệ " : "Mật khẩu không hợp lệ , vui lòng nhập lại";	
		System.out.println("VD2 message : " + message2nd);
		
		
		System.out.println("kết thúc chương trình");
	}

	// even: chẵn
	// odd: lẻ
	private static boolean isEven(int input) {
		return input % 2 == 0;
	}

}
