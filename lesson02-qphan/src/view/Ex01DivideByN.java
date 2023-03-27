package view;

import java.util.Scanner;

import utils.IoUtils;

/**
 Bài 1: Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
 Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ (tối 
 đa 5 lần)
 VD: Nhập N = abc  báo lỗi, yêu cầu nhập lại
 = 4  true
 = 6  true
 = 7  false
 */
public class Ex01DivideByN {
	public static void main(String[] args) {
		int n = IoUtils.input("Nhập N: ");
		
		// Kiểm tra có phải là bội của 2 không
		System.out.println(n + " is divided by 2 ? --> " + isDividedBy2(n));
	}
	
	private static boolean isDividedBy2(int n) {
		return n % 2 == 0;
	}
	
	// +acd
	// +89j
	// 767
	
}
