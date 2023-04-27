package bai2;

public class SpecialNumber {
	
	public static void main(String[] args) {
		
		System.out.println(isSpecialNumber(10));
	}
	
	public static boolean isSpecialNumber(int n) {
	    int sum = 0;
	    for (int i = 1; i <= n; i++) {
	        sum += i;
	        if(sum == n) {
	        	return true;
	        }
	    }
	    return false;
	}

	
}
