package view;

import java.util.Scanner;

public class BaiTap08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so can kiem tra : ");
		String n = scanner.nextLine();
		int count = 1;
		while(true) {
			if(count ==5) {
				System.exit(1);
			}
			if(!checkString(n) ) {
				if(Integer.parseInt(n)>0)
				break;
			}
		
				System.out.print("Nhap lai so can kiem tra : ");
				n = scanner.next();
				count++;
			
		}
		
		System.out.print(checkPrime(Integer.parseInt(n)));
		scanner.close();
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
	
	static boolean checkPrime(int num) {
		for(int i=2; i <=Math.sqrt(num);i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
}
