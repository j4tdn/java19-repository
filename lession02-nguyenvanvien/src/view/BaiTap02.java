package view;
import java.util.Scanner;

public class BaiTap02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so can kiem tra : ");
		String n = scanner.nextLine();
		while(true) {
			if(!checkString(n)) {
				if(Integer.parseInt(n)>0)
				break;
			}
			else {
				System.out.print("Nhap lai so can kiem tra : ");
				n = scanner.next();
			}
		}
		System.out.print("\n" + luythua(Integer.parseInt(n)));
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
	
	static boolean luythua(int n) {
		int sodu = 0;
		while(true) {
			if(n<2) {
				break;
			}
			else {
				if(n %2 ==1) {
					return false;
				}
				sodu = n%2;
				n = n/2;
			}
		}
		if(sodu ==0) {
			return true;
		}
		return false;
	}
}

