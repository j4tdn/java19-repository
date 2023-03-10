package homework;

public class Ex08CheckPrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(11));

	}

	public static boolean isPrimeNumber(int n) {
	    if (n < 2){
	        return false;
	    }       
	     
	    if (n == 2){
	        return true;
	    }
	     
	     
	    for (int i = 3; i <= n / 2; i += 1){
	        if (n % i == 0){
	            return false;
	        }   
	    }
	     
	    return true;
	}
}
