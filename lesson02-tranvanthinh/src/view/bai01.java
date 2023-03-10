package view;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] args) {
		solve();
	}
	
	public static boolean validNumber(String num){
		if (num.length() == 0) return false;
		
		for(int i = 0; i< num.length(); i++) {
			if(!Character.isDigit(num.charAt(i))) return false;
		}
		return true;
	}
	
	private static void solve() {
		Scanner ip = new Scanner(System.in);
		int count = 0;
		do {
			System.out.print("Enter N: ");
			String num = ip.nextLine();
			if(!validNumber(num)) {
				System.out.println("Not valid number, type again!!");
				count++;
			}
			else {
				int validNum = Integer.parseInt(num);
				if( validNum % 2 == 0) System.out.println("Multiples of 2");
				else System.out.println("Not multiples of 2");
				count = 0;
			}
			if(count == 5) System.out.println("Over time to enter");
		} while (count<5);
	}
}
