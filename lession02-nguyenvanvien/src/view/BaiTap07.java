package view;

import java.util.Scanner;

public class BaiTap07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		System.out.println(chuyendoi(num));
		scanner.close();
	}
	
	private static String chuyendoi(int num) {
		String result = "";
		
		while(true) {
	
		
			if(num %2 == 0) {
				result +='0';
			}
			else {
				result +='1';
			}
			if(num == 1) {
				break;
			}
			num = (int)num/2;
		
		
		}
		String kq ="";
		for(int i = result.length()-1; i>=0; i--) {
			kq+=result.charAt(i);
		}
	
		return kq;
	}
}
