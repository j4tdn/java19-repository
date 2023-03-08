package exercise.lesson02;

import java.math.BigInteger;

public class Ex04 {
	public static void main(String[] args) {
		BigInteger S = BigInteger.ZERO;
		
		for (int a = 10; a <= 20; a++) {
			for (int b = 10; b <= 20; b++) {
				for (int c = 10; c <= 20; c++) {
					for (int d = 10; d <= 20; d++) {
						BigInteger aFactorial = BigInteger.ONE;
						BigInteger bFactorial = BigInteger.ONE;
						BigInteger cFactorial = BigInteger.ONE;
						BigInteger dFactorial = BigInteger.ONE;
						
						 for (int i = 2; i <= a; i++) {
	                            aFactorial = aFactorial.multiply(BigInteger.valueOf(i));
	                        }
						 for (int i = 2; i <= b; i++) {
	                            bFactorial = bFactorial.multiply(BigInteger.valueOf(i));
	                        }
						 for (int i = 2; i <= c; i++) {
	                            cFactorial = cFactorial.multiply(BigInteger.valueOf(i));
	                        }
						 for (int i = 2; i <= d; i++) {
	                            dFactorial = dFactorial.multiply(BigInteger.valueOf(i));
	                        }
						 
						 S = S.add(aFactorial).add(bFactorial).add(cFactorial).add(dFactorial);
					}
				}
			}
		}
		System.out.println("Tổng: " + S);
	
	}
}
