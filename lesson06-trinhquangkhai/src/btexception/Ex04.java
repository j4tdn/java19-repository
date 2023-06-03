package btexception;


import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = Integer.valueOf(ip.nextInt());
	readNumber(num);
}
private static String[] readNumber( int number) {
	String digits [] = {
			"Không", "Một", "Hai", "Ba", " Bốn",
			"Năm", "Sáu", "Bảy", "Tám", "Chín", "Mười",
			"Mười Một", "Mười Hai", "Mười Ba", "Mười Bốn",
			"Mười lăm ", "Mười Sáu", "Mười Bảy", "Mười Tám",
			"Mười Chín"
	};
	String ten[] = {
			"Hai Mươi", "Ba Mươi", "Bốn Mươi", "Năm Mươi", "Sáu Mươi",
			"Bảy Mươi", "Tám Mươi","Chín Mươi"
	};
	if(number < 20) {
		System.out.println(digits[number]);
	}else if(number < 100) {
		int tendigits = number/10;
		int onedigits = number%10;
		if(onedigits == 0) {
			System.out.println(ten[tendigits]);
		}else {
			System.out.println(ten[tendigits] + " " + digits[onedigits]);
		}
	}else {
		int hundredDigits = number/100;
		int tendigits = (number/10)%10;
		int onedigits = number % 10;
		if(tendigits == 0 && onedigits == 0) {
			System.out.println(digits[hundredDigits] + "Một Trăm");
		}else if(tendigits == 0) {
			System.out.println(digits[hundredDigits] + "Một Trăm" + digits[onedigits]);
		}else if(tendigits == 1) {
			System.out.println(digits[hundredDigits] + "Một Trăm" + digits[tendigits * 10 + onedigits]);
		}else if(onedigits == 0) {
			System.out.println(digits[hundredDigits] + "Một Trăm" + ten[tendigits]);
		}else {
			System.out.println(digits[hundredDigits] + "Một Trăm" + ten[tendigits] + " " + digits[onedigits]);
		}
	}
	
	return digits;
	
}
}

