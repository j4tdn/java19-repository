package demo;

public class Ex01 {
	public static boolean isPower(int num, int base) {
	    if (num == 1) {
	        return true;
	    } else if (num < 1) {
	        return false;
	    } else {
	        double log = Math.log(num) / Math.log(base);
	        return Math.abs(log - Math.round(log)) < 1e-10;
	    }
	}
	/*public static void main(String[] args) {
	    int num = 64;
	    int base = 4;
	    if (isPower(num, base)) {
	        System.out.println(" true" );
	    } else {
	        System.out.println(" false" );
	    }
	}*/
}
