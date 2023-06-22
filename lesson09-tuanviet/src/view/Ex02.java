package view;

public class Ex02 {
	public static void main(String[] args) {
		int num = 44;
	    boolean isHappy = isHappyNumber(num);
	    if (isHappy) {
	        System.out.println(num + " là số hạnh phúc");
	    } else {
	        System.out.println(num + " không phải là số hạnh phúc");
	    }
	}
	
	public static boolean isHappyNumber(int num) {
	    int[] str = new int[];
	    int index = 0;
	    while (num != 1 && !contains(str, num)) {
	        str[index++] = num;
	        num = getSumOfSquares(num);
	    }
	    return num == 1;
	}

	private static boolean contains(int[] arr, int num) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == num) {
	            return true;
	        }
	    }
	    return false;
	}

	private static int getSumOfSquares(int num) {
	    int sum = 0;
	    while (num != 0) {
	        int digit = num % 10;
	        sum += digit * digit;
	        num /= 10;
	    }
	    return sum;
	}
}
