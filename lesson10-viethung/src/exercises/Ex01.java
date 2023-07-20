package exercises;

import java.lang.reflect.Array;
import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 5, 5, 6, 6, 7, 1 };
		// int[] output = removeDuplicates(input);
		compareHalve(input);
		thirdBigest(input);
		// System.out.println("Output: " + Arrays.toString(output));
	}

	public static int[] removeDuplicates(int[] input) {
		int[] arr = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			arr[i] = input[i];
		}
		Arrays.sort(arr);
		int[] list = new int[input.length];
		int[] output = new int[input.length];
		int running = 0;
		for (int i = 1; i < input.length; i++) {
			if (arr[i] == arr[i - 1]) {
				list[running++] = arr[i];
			}
		}

		list = Arrays.copyOfRange(list, 0, running);
		System.out.println(Arrays.toString(list));
		running = 0;
		for (int number : arr) {
			boolean flag = false;
			for (int each : list) {
				if (number == each) {
					flag = true;
				}
			}
			if (!flag) {
				output[running++] = number;
			}
		}
		return Arrays.copyOfRange(output, 0, running);
	}

	private static void compareHalve(int[] input) {
		int[] arr = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			arr[i] = input[i];
		}
		int[] first = new int[input.length / 2];
		int[] second = new int[input.length - first.length];
		first = Arrays.copyOfRange(arr, 0, arr.length / 2);
		second = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
		int sum1 = 0;
		int sum2 = 0;
		for (int number : first) {
			sum1 += number;
		}
		for (int number : second) {
			sum2 += number;
		}
		sum1 = sum1 / first.length;
		sum2 = sum2 / second.length;
		System.out.print("firstHalf " + Arrays.toString(first) + " ");
		if (sum1 == sum2) {
			System.out.print("== ");
		} else if (sum1 > sum2) {
			System.out.print("> ");
		} else
			System.out.print("< ");

		System.out.println("secondHalf " + Arrays.toString(second) + " ");
	}

	public static void thirdBigest(int input[]) {
		int n = input.length;
		int arr[] = new int[n];
		int temp[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = - input[i];
		}
		Arrays.sort(arr);
		int running = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] != arr[i + 1]) {
				temp[running++] = arr[i];
				if(running == 3) {
					System.out.println(-temp[2]);
				}
			}
		}
	}
}