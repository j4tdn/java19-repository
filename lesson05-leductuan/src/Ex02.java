import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) {
	int n;
	Scanner ip = new Scanner(System.in);
	System.out.println("nhập số nguyên: ");
	n = ip.nextInt();
	
	
	if(isSpecialNumber(n) == true) {
		System.out.println("Đó là số đặc biệt");
	}
}
private static boolean isSpecialNumber(int a) {
	int sum = 1;
	
	
	for(int i = 2; i < a; i++) {
		sum = sum + i;
		if(sum == a ) {
			return true;
		}else {
			return false;
		}
	}
	return true;
}
}
