package demo;

public class Ex02 {
	public static boolean isSpecialNumber(int n) {
	    int sum = 0;
	    for (int i = 1; i <= n; i++) {
	        sum += i;
	        if (sum == n) {
	            return true;
	        } else if (sum > n) {
	            return false;
	        }
	    }
	    return false;
	}
	
	/* public static void main(String[] args) {
	    int num = 6;
	    if (isSpecialNumber(num)) {
	        System.out.println(num + " true");
	    } else {
	        System.out.println(num + " false");
	    }
	}*/
}
