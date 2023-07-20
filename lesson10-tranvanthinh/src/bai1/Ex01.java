package bai1;

import java.util.Arrays;
import java.util.Map;

public class Ex01 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 3, 1};
//		int[] a = {7, 8, 8, 6, 2, 5, 1};
		System.out.println("Removed duplicate: " + Arrays.toString(removeDuplicates(a)));
		compairHalfAvg(a);
		System.out.println("Third Max: " + thirdMax(a));
	}
	
	public static int[] removeDuplicates(int a[]){
		boolean[] isDup = new boolean[a.length];
		int count = 0;
        for(int i = 0; i < a.length; i++) {
        	for(int j = 0; j < a.length; j++) {
        		if(i != j)
	        		if(a[i] == a[j]) {
	        			isDup[i] = true;
	        		}
        	}
        }
        int[] rs = new int[a.length];
        for(int i = 0; i < a.length; i++ ) {
        	if(!isDup[i]) {
        		rs[count++] = a[i];
        	}
        }
        return Arrays.copyOfRange(rs, 0, count);
    }
	
	public static void compairHalfAvg(int[] a) {
		int n = a.length % 2 == 0 ? a.length / 2  : a.length / 2 - 1;
		double firstHalf = 0;
		double lastHalf = 0;
		for( int i = 0; i < n; i++) {
			firstHalf += a[i];
			lastHalf += a[a.length - 1 - i];
		}
		
		System.out.println("First Half: "+ firstHalf / n + ", " + "Last Half: " + lastHalf / n );
	}
	
	public static int thirdMax(int[] a) {
		Arrays.sort(a);
		int count = 1;
		for( int i = a.length - 1; i>= 0; i--) {
			if(count == 3) {
				return a[i];
			}
			if(a[i-1] < a[i] ) count ++;
		}
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
