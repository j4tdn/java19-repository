package Bai2;

public class Bai2Demo {
	public static void main(String[] args) {
		int finalVal = 44;
		while (finalVal != 1 && finalVal != 4) {
            finalVal = isNumHappy(finalVal);
        }
        if (finalVal == 1) {
            System.out.println("Is a Happy Number");
        } else {
            System.out.println("Is not a Happy Number");
        }
	}
	
	
	public static int isNumHappy(int num) {
        int rem = 0, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem);
            num = num / 10;
        }
        return sum;
    }
}
