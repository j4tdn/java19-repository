package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfElse {

	public static void main(String[] args) {
		// cho nhập từ bàn phím (scanner) hoặc tạo biến cho sẵn giá trị
		// cho 1 số nguyên dương N --> kiểm tra N chẵn hay lẻ
		// nếu như chẵn thì in ra
		// nếu lẻ thì ko làm chi cả
		Random rd = new Random();
		int n = rd.nextInt(12);
		System.out.println("Giá trị n:" + n);
		// boolean isEven =(n%2==0);
		if (isEven(n)) {
			System.out.println("Biến n là số chẵn ");
		}
		// cho 1 chuỗi kí tự (mật khẩu )--> kiểm tra độ dài của mk đã thỏa mãn hay chưa
		// nếu độ dài mk >=8 thì mk hợp lệ
		// nếu độ dài <8 --> nhập lại
		String password ="cpky2hgkdfj";
		
		int length = password.length();
		if(length>=8) {
			System.out.println("Mật khẩu hợp lệ");
		}
		else 
			System.out.println("Mật khẩu không hợp lệ. Vui lòng nhập lại!!");
		
		//DTB
		
		
		BigDecimal avgPointBd = BigDecimal.valueOf(rd.nextFloat()*10).setScale(1, RoundingMode.HALF_UP);
		float avgPoint =avgPointBd.floatValue();
		System.out.println("AvgPoint: "+avgPoint );
		if(avgPoint<5) {
			System.out.println("Học lực yếu");
		} else if(avgPoint<6.5) {
			System.out.println("Học lực trung bình");
		} else if(avgPoint<8) {
			System.out.println("Học lực khá");
		} else 
			System.out.println("Học lực giỏi");
		
		
		// (expression) ? statement_if_true : statement_if_false;
		String massage =password.length()>=8 ?"Mật khẩu hợp lệ":"Mật khẩu không hợp lệ, vui lòng nhập lại";
		System.out.println(massage);
	  	System.out.println("Kết thúc chương trình");
	  	
	}

	private static boolean isEven(int input) {
		return input % 2 == 0;
	}

}
