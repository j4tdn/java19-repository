package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int n = validNumber();
		boolean result = isPowerOfTwo(n);
		System.out.println(result);
		
	}

	private static int validNumber() {
		Scanner in = new Scanner(System.in);
		int n = 0;		
		for (int i = 0; i < 5; i++) {
			System.out.print("Hãy nhập số nguyên dương n: " );
			String input = in.nextLine();
			if(!input.matches("\\d+")) {
				System.out.println("N phải là một số nguyên dương");
			}else {
				n = Integer.parseInt(input);
				if(n <= 0) {
					System.out.println("N phải là một số nguyên dương");
				}else {
					return n;
				}
			}
		}
		System.out.println("Bạn đã nhập sai quá nhiều lần. Kết thúc chương trình!");
		System.exit(0);
		return n;
	}
	
	private static boolean isPowerOfTwo(int n) {
		if( 0 == n|| 1 == n ) return true;
		int x = n / 2;
		int y = n%2;
		if (1 == y) return false;
		return isPowerOfTwo(x);
	}
}
