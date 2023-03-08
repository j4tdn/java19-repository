package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		//cho(scanner or gán sẵn vào biến) 
		
		//cho 1 số Nguyên dươngN --> kiểm tra N chẵn hay lẽ
		//nếu chẵn: inra
		//nếu lẽ không làm gì cả
		Random rd = new Random();
		int n = rd.nextInt(12);
		System.out.println("giá trị n: " + n);
		
		//boolean isEven = (n % 2 == 0);
		//if(expression == true) --> if(expression)
		//if(expression == false) --> if(!expression)
		
		//if (isEven)     --> nhận biến
		//if (n % 2 == 0) --> nhận biểu thức
		//if (isEven(n))  --> nhận hàm
		if (n % 2 == 0) {
			System.out.println("Biến isEven là số chẵn");
		}
		System.out.println("kết thúc chương trình");
		
		System.out.println("\n=============\n");
		
		
		if (isEven(n)) {
			System.out.println("Biến isEven là số chẵn");
		}
		System.out.println("kết thúc chương trình");
		System.out.println("\n=============\n");
		
		
		//cho 1 chuỗi String password --> kiểm tra độ dài password
		//nếu >=8 --> hợp lê
		//<8 --> có ít nhất là 8 ký tự, vui lòng nhập lại
		
		String passWord = "cpky123";
		int length = passWord.length();
		System.out.println("passWord length:"+ length);
		if (length >= 8) {
			System.out.println("hợp lệ");
		}else {
			System.out.println("passWord phải có ít nhất là 8 ký tự, vui lòng nhập lại");
		}
		
		System.out.println("\n=============\n");
		
		//ĐTB của học sinh
		//[0,5)     yếu
		//[5,6.5)   TB
		//[6.5,8)   khá
		//[8,10]    giỏi
		//float avgPoint = rd.nextFloat()*10;
		BigDecimal avgPBigDecimal = BigDecimal.valueOf(rd.nextFloat()*10).setScale(1,RoundingMode.HALF_UP);
		float avgPoint = avgPBigDecimal.floatValue();
		System.out.println("avgPoint: " + avgPoint);
		
		if (avgPoint < 5) {
			System.out.println("Học lực yếu");
		}else if(avgPoint < 6.5) {
			System.out.println("Học lực TB");
		}else if(avgPoint < 8) {
			System.out.println("Học lực khá");
		}else {
			System.out.println("Học lực giỏi");
		}
		
		System.out.println("\n=============\n");
		
		//thay thế if else bằng toán tử 3 ngôi (simple case )
		String passWord2 = "0123467894";
		System.out.println("passWord2 length:"+ passWord2.length());
		System.out.println(passWord2.length() >= 8 ? "hợp lệ" : "passWord phải có ít nhất là 8 ký tự, vui lòng nhập lại");
		
		System.out.println("\n=============\n");
		
		System.out.println("giá trị n: " + n);
		System.out.println(isEven(n) ? "Biến isEven là số chẵn" : "số lẽ");
		
		System.out.println("\n=============\n");
		
		
		System.out.println("avgPoint: " + avgPoint);
		System.out.println(avgPoint < 5 ? "Học lực yếu" 
										: avgPoint < 6.5 ? "Học lực TB" 
										: avgPoint < 8   ? "Học lực khá"
										: "Học lực giỏi");
		
		System.out.println("kết thúc chương trình");
	}
	
	private static boolean isEven(int input) {
		return input % 2 == 0;
	}
}
