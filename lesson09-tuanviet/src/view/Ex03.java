package view;

public class Ex03 {
	public static void main(String[] args) {
	    int[] arr = {8, 5, 9, 20};
	    sortArrayByLevel(arr);
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i]);
	    }
	}

	public static void sortArrayByLevel(int[] arr) {
	    for (int i = 0; i < arr.length - 1; i++) {
	        for (int j = 0; j < arr.length - i - 1; j++) {
	            if (getLevel(arr[j]) > getLevel(arr[j+1])) {
	                int temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	            }
	        }
	    }
	}

	public static int getLevel(int num) {
	    int count = 0;
	    for (int i = 1; i <= num; i++) {
	        if (num % i == 0) {
	            count++;
	        }
	    }
	    return count;
	}

}
