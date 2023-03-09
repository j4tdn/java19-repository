package view;

import java.util.Scanner;

public class BaiTap05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so can kiem tra : ");
		String n = scanner.nextLine();
		while(true) {
			if(!checkString(n) ) {
				if(Integer.parseInt(n)>=10)
				break;
			}
			
				System.out.print("Nhap lai so can kiem tra : ");
				n = scanner.next();
			
		}
		char[] chars = new char[n.length()];
		for (int i=0; i<n.length(); i++) {
			chars[i] = n.charAt(i);
		}
        
        System.out.print(checkSDX(chars));
        scanner.close();
	}
	
	static boolean checkSDX(char[] chars) {
		boolean check = false;
		
        for(int i =0; i< chars.length/2;i++) {
        	if(chars[i] == chars[chars.length-1-i]) {
        		check =true;
        	}
        	else {
        		check =false;
        		break;
        	}
        }
        return check;
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
