package view;

import java.util.Scanner;

public class bai08 {
	public static void main(String[] args) {
		solve();
	}
	public static boolean isPrime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++){
	        if(n % i == 0){
	            return false;
	        }
	    }
		return true;
	}
	private static void solve() {
		Scanner ip = new Scanner(System.in);
		int count = 0;
		do {
			System.out.print("Enter N: ");
			String num = ip.nextLine();
			if(!bai01.validNumber(num)) {
				System.out.println("Not valid number, type again!!");
				count++;
			}
			else {
				int validNum = Integer.parseInt(num);
				if(isPrime(validNum)) System.out.println("Is Prime");
				else System.out.println("Is not Prime");
				count = 0;
			}
			if(count == 5) System.out.println("Over time to enter");
		} while (count<5);
	}
}
