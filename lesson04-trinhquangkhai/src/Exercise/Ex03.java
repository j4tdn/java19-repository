package Exercise;

import java.util.Scanner;

public class Ex03 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	
	System.out.println("Nhập chiều cao của tam giác: ");
	int h = ip.nextInt();
	display(h);
	
}
public static long factorialcaculus(int n) {
	long factorial = 1;
	if(n == 0 || n == 1) {
		return factorial;
	}else {
		for(int i = 2; i <= n; i++) {
			factorial = factorial * i;
		}
	}
	return factorial;

}
private static void display(int n) {
	
	for(int i = 0; i <= n; i++ ) {
		for(int j = 0; j <= i; j++) 
			System.out.print((factorialcaculus(i))/(factorialcaculus(j)*factorialcaculus(i-j)) + " ");
			System.out.println("");
		
	}
}
}
