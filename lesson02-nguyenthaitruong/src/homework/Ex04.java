package homework;

import java.util.Random;

public class Ex04 {
	public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
	}
	 public static void main(String[] args) {
	        Random random = new Random();
	        int a = 10 + random.nextInt(11);
	        int b = 10 + random.nextInt(11);
	        int c = 10 + random.nextInt(11);
	        int d = 10 + random.nextInt(11);

	        long result = factorial(a) + factorial(b) + factorial(c) + factorial(d);

	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	        System.out.println("c = " + c);
	        System.out.println("d = " + d);
	        System.out.println("Tổng giải thừa của a, b, c và d là: " + result);
	    }
}
