package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int n = validNumber();
		boolean result = check(n);
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
	
	private static boolean check(int n) {
		return n % 2 == 0;
	}
}
