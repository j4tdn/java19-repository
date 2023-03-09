package view;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int n = validNumber();
		String stringN = Integer.toString(n);
		
        int leng = stringN.length();
        boolean flag = true;
		for (int i = 0; i < leng / 2; i++) {
            if (stringN.charAt(i) != stringN.charAt(leng - 1 - i)) {
                flag = false;
                break;
            }
        }
		if (flag) {
            System.out.println("Đây là số đối xứng.");
        } else {
            System.out.println("Đây không phải là số đối xứng.");
        }
	}
	
	private static int validNumber() {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập số nguyên dương n : " );
		String input = in.nextLine();
		int n = 0;
		if(!input.matches("\\d+")) {
			System.out.println("không đúng yêu cầu, cần nhập lại n!");
			System.exit(0);
		}else {
			n = Integer.parseInt(input);
			if(n < 10) {
				System.out.println("không đúng yêu cầu, cần nhập lại n!");
				System.exit(0);
			}else {
				return n;
			}
		}
		return n;
	}
	
}
