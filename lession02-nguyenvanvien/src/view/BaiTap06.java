package view;

import java.util.Scanner;

public class BaiTap06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap a : ");
		int a = enterValue();
		System.out.print("\nNhap b : ");
		int b = enterValue();
		System.out.print("\nNhap c : ");
		int c = enterValue();

		if(a>= b) {
			if(b>=c) {
				System.out.println("max " + a);
				System.out.println("min " + c);
			}
			else {
				if(a<=c) {
					System.out.println("max " +c);
					System.out.println("min " +b);
				}
			}
		}
		else {
			if(a>=c) {
				System.out.println("max " +b);
				System.out.println("min " +c);
			}
			else {
				if(a<=c) {
					System.out.println("max " +c);
					System.out.println("min " +a);
				}
			}
		}
		scanner.close();
	}
	
	static int enterValue() {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		while(true) {
			if(!checkString(str)) {
				if(Integer.parseInt(str)>=0)
				break;
			}
				System.out.print("Nhap lai so : ");
				str = scanner.next();
			
		}
		scanner.close();
		return Integer.parseInt(str);
		
	}
	
	static boolean checkString(String s) {
		boolean check = true;
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i) >='0' && s.charAt(i) <='9'){
				check= false;
			}
			else {
				check = true;
				break;
			}
		}
		return check;
	}
}
