package test1;

import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Nhập số xâu chuỗi: ");
	int n = ip.nextInt();
	for(int i = 0; i < n; i++) {
		System.out.println("Nhập chuỗi thứ " + (i+1) + ": ");
		String s = ip.nextLine();
	}
}
}