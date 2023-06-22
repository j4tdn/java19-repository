package ex03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03LevelNumber {
	public static void main(String[] args) {
		int[] arr = {8,5,9,20};
		int[] sorted = sortByLevel(arr);
		System.out.println(Arrays.toString(sorted));
	}
	public static int level(int n) {
	    int count = 0;
	    for (int i = 1; i <= n; i++) {
	        if (n % i == 0) {
	            count++;
	        }
	    }
	    return count;
	}
    public static int[] sortByLevel(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (level(arr[j]) > level(arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
