package homework;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
		 * Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N
		 * không hợp lệ (tối đa 5 lần) VD: Nhập N = abc  báo lỗi, yêu cầu nhập lại
		 * 
		 * = 4  true = 6  true = 7  false
		 */
		System.out.println("Bài 2: Viết chương trình(hàm) kiểm tra số nguyên N có phải là lũy thừa của 2 hay không\r\n"
				+ "Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ\r\n"
				+ "(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ\r\n"
				+ "VD: Nhập N = abc  báo lỗi, yêu cầu nhập lại\r\n"
				+ "\r\n"
				+ "= 4  true\r\n"
				+ "= 6  false\r\n"
				+ "= 8  true\r\n"
				+ "= 9  false");
		Random rd = new Random();
		long result = 0L;		
		for (int i = 0; i < 5; i++) {
			
		int n = 10 + rd.nextInt(11);
		result += Ex3.factorial(n);
		System.out.print(n +"!" );
		if (i < 4) {
		System.out.print(" + " );
		}
		}
		System.out.print(" = " + result );
		
	}


}
