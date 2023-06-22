package ex02;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public static void main(String[] args) {
		int n = 44;
		System.out.println("Result --> " + isHappyNumber(n));
	}
	public static boolean isHappyNumber(int n) {
		Set<Integer> valuesOther1 = new HashSet<Integer>();
	    while (n != 1) {
	        int sum = 0;
	        while (n != 0) {
	            int digit = n % 10;
	            sum += digit * digit;
	            n /= 10;
	        }
	        n = sum;
	        if (valuesOther1.contains(n)) {
	            return false;
	        } else {
	        	valuesOther1.add(n); 
	        }
	    }
	    return true; 
	}
}
