package ex02;

import java.util.Scanner;

public class IsSpecialNumber {
	
	private IsSpecialNumber() {
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		do {
			try {
				check = true;
				System.out.print("Enter n: ");
				int n = Integer.parseInt(sc.nextLine());
				if(isSpecialNumber(n)) {
					System.out.println(n + "--> is a SpecialNumber" );
				} else System.out.println(n + "--> is not a SpecialNumber" );
			} catch (NumberFormatException e) {
				check = false;
				e.printStackTrace();
				System.out.println(">>> Invalid Number! <<<");
			}
		} while(!check);
		sc.close();
	}
	
	public static void main(String[] args) {
		new IsSpecialNumber();
	}

	
	
	private static boolean isSpecialNumber(int n) {
		int i = 1;
		while (n > 0) {
			n -= i++;
		}
		if (n == 0)
			return true;
		return false;
	}

}
