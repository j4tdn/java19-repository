package btexception;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	
	FirstEquation();
	
	
}
private static int FirstEquation() {
	Scanner ip = new Scanner(System.in);
	int x = 0;
	while(true) {
		try {
	System.out.println("Nhập hệ số a: ");
	int a = Integer.parseInt(ip.nextLine());
	if(a == 0) {
		throw new ArithmeticException();
		
	}
	System.out.println("Nhập hệ số b: ");
	int b = Integer.parseInt(ip.nextLine());
	System.out.println("Phương trình vừa nhập là: "+ a + "x " + "+ " + b + " = 0" ); 
	if(b == 0 ) {
		System.out.println("Phương trình vô số nghiệm");
	}else {
		x = (-b)/a;
		System.out.println("Nghiệm của phương trình là: " + x);
		break;
	}
	
	}catch(NumberFormatException e) {
		System.out.println("Nhập sai dữ liệu");
		continue;
		
	}catch(ArithmeticException ae) {
		System.out.println("a không thể là 0");
		break;
	}
		
		
		}
	return x;
}
}
