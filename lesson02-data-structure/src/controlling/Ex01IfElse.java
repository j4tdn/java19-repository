package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {

	public static void main(String[] args) {
		// cho(nhập từ bàn phím(scanner) || tạo biến vài gán sẵn) 1 số nguyên dương N
		// --> Kiểm tra N chẵn hay lẻ
		// nếu như là số chẵn thì in ra
		// nếu là số lẻ ko làm gì cả
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int n = rd.nextInt(12);

		// isEven == true --> if(isEven)
		// isEven == false --> if(!isEven)
		// boolean isEven = (n % 2 == 0) || if(isEven) --> if(n % 2 == 0);

		// if(isEven) --> nhận biến
		// if(n % 2 == 0) --> nhận biểu thức
		// if(isEvent(n)) --> nhận hàm
		if(isEvent(n)) {
			System.out.println(+ n + " :là số chẵn");
		} else {
			System.out.println(+ n + " :là số lẻ");
		}

		System.out.println("\n===========================\n");

		// cho một chuỗi kí tự(mật khẩu) --> kiểm tra xem độ dãi của mật khẩu đã thoả
		// mãn yêu cầu chưa
		// If ĐỘ DÀI MẬT KHẨU LỚN HƠN = 8 --> mật khẩu oke
		// nếu độ dài < 8 --> mật khẩu có ít nhất là 8 kí tự
		System.out.println("Nhập giá trị password");
		String password = sc.nextLine();

		int length = password.length();
		System.out.println("Password length: " + length);

		// Boolean isGreaterThan8 = (length >=8)
		if (length >= 8 == true) {
			System.out.println("Mật khẩu oke");
		} else {
			System.out.println("Mật khẩu phải có ít nhất là 8 kí tự, vui lòng nhập lại");
		}

		System.out.println("\n===========================\n");

		// Cho đầu vào điểm trung bình của học sinh
		// Nếu DTB < 5 --> HỌC LỰC YẾU
		// Nếu DTB [5, 6,5) --> HỌC LỰC TRUNG BÌNH
		// Nếu DTB [6,5, 8.0) --> HỌC LỰC KHÁ
		// Nếu DTB [8.0, 10) --> HỌC LỰC GIỎI

		// Scale(1) --> [0.0, 10.0) --> expect: [0.0, 10.0]
		// float avgPoint = rd.nextFloat() * 10;
		BigDecimal avgPointBd = BigDecimal.valueOf(rd.nextFloat() * 10).setScale(1, RoundingMode.HALF_UP);
		float avgPoint = avgPointBd.floatValue();

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

		// thay thế if else .. else.. if bằng toán tử 3 ngôi
		// nên làm cho trường hợp đơn giản
		// (expression) ? statement_if_true : statement_if_false;

		String message1 = isEvent(n) ? "Biến n là số lẽ" : "";
		System.out.println("Message1: " + message1);

		String message2 = password.length() >= 8 ? "Mật khẩu hợp lệ"
				: "Mật khẩu phải có ít nhất là 8 kí tự, vui lòng nhập lại";
		System.out.println("Message2: " + message2);
		
		String message3 = avgPoint < 5 ? "Học lực yếu" : avgPoint < 6.5 ? "Học lực trung bình" : avgPoint < 8 ? "Học lực khá" : "Học lực giỏi";
		System.out.println("Message3: " + message3);
	}

	private static boolean isEvent(int input) {
		return input % 2 == 0;
	}

}
