
import java.util.Scanner;
public class Exercise3 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	int n;
	n = ip.nextInt();
	System.out.println("nhập số nguyên n" + n);
	System.out.println("giai thừa của" +n+ "là: " +Exercise3.factorialcaculus(n));
	
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

}
