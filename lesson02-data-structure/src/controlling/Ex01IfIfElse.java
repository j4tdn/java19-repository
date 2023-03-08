package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfIfElse {

	public static void main(String[] args) {
		// cho (nhập từ bàn phím (scanner)||tạo biến gán sẵn) 1 số nguyên dương N -->
		// kiểm tra N chẵn hay lẻ
		// Nếu chẵn thì in ra
		// nếu lẻ thì ko làm gì cả
		Random rd = new Random();

		int n = rd.nextInt(12);
		System.out.println("Giá trị n: " + n);
		// boolean isEven = (n%2 == 0);

		// if (expression); expression nhận vào biến kiểu true/false hoặc hàm trả về
		// true/false
		// if (expression == true) --> if (expression)
		// if (expression == false) --> if (!expression)
		// if (isEven == true) {
		// if (n%2 == 0) {
		if (isEven(n)) {
			System.out.println("n là số chẵn");
		}

		// Cho 1 chuỗi kí tự(mật khẩu)
		// Kiểm tra độ dài mật khẩu thỏa mãn yêu cầu chưa
		// Nếu độ dài >= 8 --> mk hợp lệ
		// Nếu độ dài < 8 --> Mật khẩu có ít nhất 8 kí tự, vui lòng nhập lại
		String password = "cpkyddd12";
		int length = password.length();
		System.out.println("password length: " + length);
		if (length >= 8) {
			System.out.println("Mật khẩu hợp lệ");
		} else {
			System.out.println("Mật khẩu có ít nhất 8 kí tự, vui lòng nhập lại");
		}

		// if (length < 8) {
		// System.out.println("Mật khẩu có ít nhất 8 kí tự, vui lòng nhập lại");
		// }
		System.out.println("\n ============ \n");
		// cho đầu vào là điểm trung bình của học sinh
		// nếu DTB [0, 5) -->học lực yếu
		// nếu DTB [5, 6.5) -->học lực trung bình
		// nếu DTB [6.5, 8) -->học lực khá
		// nếu DTB [8, 10) -->học lực giỏi

		BigDecimal avgPointBd = BigDecimal.valueOf(rd.nextFloat() * 10).setScale(1, RoundingMode.HALF_UP);
		float avgPoint = avgPointBd.floatValue(); // [0, 10]
		System.out.println("avg point: " + avgPoint);

		if (avgPoint < 5) {
			System.out.println("Học lực yếu");
		} else if (avgPoint < 6.5) {
			System.out.println("Học lực trung bình");
		} else if (avgPoint < 8) {
			System.out.println("Học lực khá");
		} else {
			System.out.println("Học lực giỏi");
		}

		System.out.println("\n ============ \n");
		// Thay If-IfElse bằng toán tử 3 ngôi
		// Nên làm cho trường hợp đơn giản
		// expression ? statement_if_true : statement_if_false

		String message1st = isEven(n) ? "n là số chẵn" : "";
		System.out.println("vd1: " + message1st);

		// String message2nd = length >= 8 ? "Mật khẩu hợp lệ" : "Mật khẩu có ít nhất 8
		// kí tự, vui lòng nhập lại";
		System.out.println("vd2: " + (length >= 8 ? "Mật khẩu hợp lệ" : "Mật khẩu có ít nhất 8 kí tự, vui lòng nhập lại"));

		String message3rd = (avgPoint < 5) ? "học lực yếu"
				: (avgPoint < 6.5) ? "học lực trung bình" 
						: (avgPoint < 8) ? "học lực khá" 
								: "học lực giỏi";
		
		System.out.println("vd3: " + message3rd);

		System.out.println("kết thúc chương trình");
	}

	private static boolean isEven(int input) {
		return input % 2 == 0;
	}
}
