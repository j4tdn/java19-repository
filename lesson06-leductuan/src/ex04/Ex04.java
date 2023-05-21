package ex04;

import java.util.Scanner;

public class Ex04 {	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập số cần đọc:");
		int n;
		n=ip.nextInt();
		try {
		    System.out.println(docSo(n));
		} catch (Exception e) {
		    System.out.println("Lỗi: " + e.getMessage());
		}
	}
	public static String docSo (int n) {
	    String[] donVi = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
	    String[] hangChuc = {"", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
	    String[] hangTram = {"", "một trăm", "hai trăm", "ba trăm", "bốn trăm", "năm trăm", "sáu trăm", "bảy trăm", "tám trăm", "chín trăm"};

	    if (n < 0 || n > 999) {
	        throw new IllegalArgumentException("Số phải nằm trong khoảng từ 0 đến 999.");
	    }

	    if (n == 0) {
	        return "không";
	    }

	    String result = "";

	    if (n >= 100) {
	        result += hangTram[n / 100] + " ";
	        n %= 100;
	    }

	    if (n >= 10 && n <= 19) {
	        result += "mười " + donVi[n % 10] + " ";
	    } else if (n >= 20) {
	        result += hangChuc[n / 10] + " ";
	        n %= 10;
	        if (n > 0) {
	            result += "lẻ " + donVi[n] + " ";
	        }
	    } else if (n > 0) {
	        result += donVi[n] + " ";
	    }

	    return result.trim();
	}
}
