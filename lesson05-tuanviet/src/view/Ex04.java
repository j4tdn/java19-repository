package view;

public class Ex04 {
	public static void main(String[] args) {
		int[] a = {1, 5, 8, 9, 2, 5, 9};
		System.out.println(sum(a));
	}
	private static int sum(int[] a) {
		int min = a[0];
	    int max = a[0];
	    for (int i = 1; i < a.length; i++) {
	        if (a[i] < min) {
	            min = a[i];
	        }
	        if (a[i] > max) {
	            max = a[i];
	        }
	    }
	    int sum = 0;
	    for (int i = 0; i < a.length; i++) {
	        if (a[i] != min && a[i] != max) {
	            boolean distinct = true;
	            for (int j = 0; j < i; j++) {
	                if (a[i] == a[j]) {
	                    distinct = false;
	                    break;
	                }
	            }
	            if (distinct) {
	                sum += a[i];
	            }
	        }
	    }
	    return sum;
	}


}
	


