package ex1234;

import java.util.Arrays;

public class Ex04FindUniqueNumbers {
	public static void main(String[] args) {
		int[] a = {3, 15, 21, 0, 15, 17, 21};
		
		
		Ex04FindUniqueNumbers ex04 = new Ex04FindUniqueNumbers();
		System.out.println("--> " + Arrays.toString(ex04.getLeastCommonMultiple(a)));
	}
	
	private int[] getLeastCommonMultiple(int[] a) {
		int lengthA = a.length;
		for(int i = 0; i < lengthA ; i ++) {
			for(int j = i + 1; j < lengthA; j ++) {
				if(a[i] == a[j]) {
					a[i] = a[i + 1];
					a[j] = a[j + 1];
					i--;
					j--;
					lengthA --;
					break;
				}
			}
		}
		return a;
	}
}
