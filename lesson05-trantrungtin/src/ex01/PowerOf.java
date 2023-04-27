package ex01;

public class PowerOf {
	public static void main(String[] args) {
		System.out.println(isPowerOf(4, 2));
		System.out.println(isPowerOf(2, 4));
		System.out.println(isPowerOf(2, 3));
		
	}

	public static boolean isPowerOf(int num1, int num2) {
		double check;
		if (num1 < num2) {
			// Check multiples of 2, log2 n = loge n / loge 2
			check = Math.log(num2) / Math.log(num1);
			
		} else {
			check = Math.log(num1) / Math.log(num2);
			
		}
		return check % 1 == 0;
	}
}
