import java.util.Scanner;

public class Exercise6 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	int a;
	System.out.println("Nhập a: " );
	a = ip.nextInt();
	
	int b;
	System.out.println("Nhập b: " );
	b = ip.nextInt();
	
	int c;
	System.out.println("Nhập c: " );
	c = ip.nextInt();
	
	if(a > b && a > c) {
		System.out.println("số lớn nhất là: " + a);
	}else if (b > c && b > a) {
		System.out.println("số lớn nhất là: " + b);
	}else if (c > a && c > b){
		System.out.println("số lớn nhất là " + c);
	}
	if(a < b && a < c) {
		System.out.println("số bé nhất là: " + a);
	}else if (b < a && b < c) {
		System.out.println("số bé nhất là: " + b);
	}else if (c < a && c < b) {
		System.out.println("số bé nhất là: " + c);
	}
	
		
	
		
	}

}

