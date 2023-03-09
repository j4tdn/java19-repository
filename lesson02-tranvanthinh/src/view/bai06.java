package view;

import java.util.Scanner;

public class bai06 {
	public static void main(String[] args) {
		int a,b,c;
		a = enterNum("Nhập a: ");
		b = enterNum("Nhập b: ");
		c = enterNum("Nhập c: ");
		int max = ( c > ((a>b) ? a : b) ) ? c : ((a>b) ? a : b) ;
		int min = ( c < ((a<b) ? a : b) ) ? c : ((a<b) ? a : b) ;
		System.out.println("Số lớn nhất: " + max);
		System.out.print  ("Số nhỏ nhất: " + min);
	}
	
	private static int enterNum(String text) {
		String num;
		while(true) {
			Scanner ip = new Scanner(System.in);
			System.out.print(text);
			num = ip.nextLine();
			if(!bai01.validNumber(num)) {
				System.out.println("Not valid number, type again!!");
			}
			else {
				int temp = Integer.parseInt(num);
				if(temp >= 20 || temp < 0) {
					System.out.println("Out of range condition");
				}
				else {
					break;
				}
				break;
			}
		}
		return Integer.parseInt(num);
	}
}
