package homework;

import java.util.Scanner;

public class Ex01 {
      public static void main(String[] args) {
		/*
Bài 1: Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ (tối đa 5 lần)
VD: Nhập N = abc  báo lỗi, yêu cầu nhập lại

= 4  true
= 6  true
= 7  false
—------------
-Nhập từ bàn phím : dùng scanner
-khai báo: String N = 
-kiểm tra bội của 2:   N%2 == 0 ⇒ if  => N là số nguyên
-nhập lại tối đa 5 lần: dùng vòng lặp?? */

		 Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			String str = scanner.nextLine();
			// System.out.println(str);
			if (isNumber(str)) {
				int num = Integer.parseInt(str);
				if (isMultiplesOfTwo(num)) {
					System.out.println("true");
				} else {
					System.out.println("false");
				}
				break;
			}
			System.out.println("Please input a number 🙂 ");
		}
		
	}

	public static boolean isMultiplesOfTwo(int number) {
		return number % 2 == 0;
	}

	public static boolean isNumber(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < '0' || s.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
}

