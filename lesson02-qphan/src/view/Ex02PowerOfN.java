package view;

import utils.IoUtils;

public class Ex02PowerOfN {
	public static void main(String[] args) {
		int number = IoUtils.input("Enter number: ");
		
		System.out.println("is " + number + " power of 2: " + isPowerOf2(number));
		
		System.out.println("\n");
		
		System.out.println("is " + number + " power of 2: " + isPowerOf2Log(number));
	}
	
	private static boolean isPowerOf2Log(int n) {
		/* 
		 2^x = n
		 -> x = log(n)/log(2)
		 + if x là số nguyên --> n là lũy thừa của 2
		 + if x là số thập phân --> n k phải là lũy thừa của 2
		 VD: n = 8, x = log(8)/log(2) = 3
		     n = 7, x = log(7)/log(2) = 2..729
		     
		     --> 3 3.0 3.00 3.000 --> số nguyên
		         3.0001 --> ko phải
		 */
		double rlog = Math.log(n)/Math.log(2);
		
		System.out.println("rlog --> " + rlog);
		
		// Nếu 1 số là round up = round down --> SN
		
		return rlog == (int)rlog;
	}
	
	// 1/4 is power of 1/2
	// Tests whether is n power of 2
	private static boolean isPowerOf2(int n) {
		// 9
		// 8 4 2 1
		while(n != 1) {
			if (n % 2 != 0) {
				return false;
			}
			n/=2;
		}
		return true;
	}
}