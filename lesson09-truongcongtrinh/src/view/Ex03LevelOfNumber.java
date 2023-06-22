package view;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex03LevelOfNumber {
	private static final Scanner sc = new Scanner(System.in);
	private static TreeMap<Integer, Integer> map = new TreeMap<>();

	public static void main(String[] args) {
		int n = 0;
		do {
			System.out.print("Enter number of elements: ");
			try {
				n = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Invalid Input!");
			}
			if(n>3 && n<20) {
				break;
			}
			System.out.println("The number of element must be from 4 -> 19!");
		} while(true);
		System.out.print("Enter arrays: ");
		int a[] = new int[n];
		inputArray(a);
		System.out.println(Arrays.toString(getLevelOfNumber(a)));
	}

	private static int[] getLevelOfNumber(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int level = 0;
			for (int j = 1; j < a[i]; j++) {
				if (a[i] % j == 0) {
					level++;
				}
			}
			map.put(level, a[i]);
		}

		int[] result = new int[a.length];
		int index = 0;
		for (int key : map.keySet()) {
			result[index++] = map.get(key);
		}
		return result;
	}

	private static void inputArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
	}
}
