package ex01toex04;

public class Ex04 {
	public static void main(String[] args) {
		int[] a1 = {1, 5, 8, 9, 2, 5, 9};
		int[] a2 = {4, 2, 6, 6, 4, 15, 1};
		System.out.println(sum(a1));
		System.out.println(sum(a2));
	}
	
	public static int sum(int[] a) {
		int sum = 0;
	    int min = a[0];
	    int max = a[0];
	    int[] b= new int[a.length];
	    for (int i = 1; i < a.length; i++) {
	        if (a[i] < min) {
	            min = a[i];
	        }
	        if (a[i] > max) {
	            max = a[i];
	        }
	    }
	    

	    return sum;
	}
}
