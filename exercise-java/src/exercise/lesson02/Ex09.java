package exercise.lesson02;

public class Ex09 {
	public static void main(String[] args) {
		 int count = 0;
	        int number = 2;
	        
	        while (count < 200) {
	            if (isPrime(number)) {
	                count++;
	            }
	            number++;
	        }
	        
	        System.out.println("Số nguyên tố thứ 200 là: " + (number-1));
	    }

	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	}
}
