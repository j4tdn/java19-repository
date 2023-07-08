package test;


import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Nhập số thứ nhất: ");
	int n = ip.nextInt();
	
	
	System.out.println("\nNhập số thứ hai: ");
	int m = ip.nextInt();
	
	
	System.out.println(EquivalentElement(DivisorOfaNumber(n), DivisorOfaNumber(m)));
	
	
	DivisorOfaNumber(n);
}
public static int[] DivisorOfaNumber(int n) {
	int[] number = new int[1156];
	int[] primes = new int[1156];
	int index = 0;
	for(int i = 1; i <= n; i++) {
		if(n % i == 0) {
		number[index++] = i ;
}
}
	//System.out.println(Arrays.toString(number));
	
	index = 0;
	//System.out.println("\n======================\n");
	for(int num : number) {
		if(isPrime(num)) {
			primes[index++] = num ;
		}
	}
	//System.out.println(Arrays.toString(primes));
	
	return primes;
}

public static String EquivalentElement(int[] M, int[] N) {
	String result = "";
	
			for(int i = 0; i < M.length; i++) {
				if(M[i] != N[i] ) {
					return result = "no";
				}
			}
			 result = "yes";
		//System.out.println("result -> " + result);
	
	return result;
}
	
public static boolean isPrime(int input) {
	if(input == 1) {
		return false;
		
		}else {
	for (int i = 2; i <= input/2; i++) {
		if (input % i == 0) {
			return false;
		}
	}
}
	return true;
	}
}
