package code300;

import java.util.Scanner;

public class Ex10 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Nhập n: ");
	int n = ip.nextInt();
	System.out.println("result -> " + climbstair(n));
}
public static int fibonanci(int n) {
	int f0 = 0;
	int f1 = 1;
	int fn = 1;
	if(n < 0 ) {
		return -1;
		
	}else if(n == 0 || n == 1) {
		return n;
	}else {
		for(int i = 2; i < n; i++) {
			f0 = f1;
			f1 = fn;
			fn = f0 + f1;
		}
	}
	return fn;
}
private static int climbstair(int n ) {
	if(n == 0) {
		return 0;
	}else {
		return fibonanci(n + 1);
	}
}
}
