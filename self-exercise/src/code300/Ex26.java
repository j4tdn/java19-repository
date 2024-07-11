package code300;

import java.util.Scanner;

public class Ex26 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Nhập a: ");
	double a = ip.nextInt();
	System.out.println("Nhập b: ");
	double b = ip.nextInt();
	System.out.println("Nhập c: ");
	double c = ip.nextInt();
	System.out.println("Nhập d: ");
	double d = ip.nextInt();
	System.out.println("Nhập n: ");
	double n = ip.nextInt();
	double twopow = Math.pow(2, n - 2);
	double negpow = Math.pow(-1, n - 2);
	double Gn = 0;
	double npow = (3 - Math.sqrt(17)/2);
	double n2pow = (3 + Math.sqrt(17)/2);
	double l = ((-2*a + (3 + Math.sqrt(17))*b)/2*Math.sqrt(17)) * Math.pow(npow, n);
	double k = (b - (-2*a + (3 + Math.sqrt(17))*b)/2*Math.sqrt(17)) * Math.pow(n2pow, n);
	double Fn = k + l;
	
	if(n > 1) {
		Gn = ((d + c)*7*twopow/3) + ((2d-c)/3)*negpow;
	}else if(n == 1) {
		Gn = c + d;
	}else if(n == 0) {
		Gn = d;
	}
	
	System.out.println((Fn + Gn));
			
}
}
