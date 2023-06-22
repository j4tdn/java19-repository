package ex03;

import java.util.Arrays;

public class LevelOfNaturalNumber {
	public static void main(String[] args) {
		int[] arrays = {8,5,9,20};
		arrangeNumber(arrays);
		System.out.println("Result -->" + Arrays.toString(arrays));
	}
	
	public static void arrangeNumber(int[] a) {
        Integer[] level = new Integer[a.length];
        for (int i = 0; i < a.length; i++) {
            level[i] = getLevel(a[i]);
        }

        // Sắp xếp mảng theo level tăng dần
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (level[i] > level[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    int tempLevel = level[i];
                    level[i] = level[j];
                    level[j] = tempLevel;
                }
            }
        }
	}
	
	public static int getLevel(int n) {
		int levelOfN = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
            	levelOfN++;
            }
        }
        return levelOfN;

	}
}
