package homework;

public class Ex09 {
		public static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        int count = 0;
	        int num = 2;

	        while (count < 200) {
	            if (isPrime(num)) {
	                count++;
	                if (count == 200) {
	                    break;
	                }
	            }
	            num++;
	        }

	        System.out.println("Số nguyên tố thứ 200 là: " + num);
	    }
	}


