package view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		int n = 10;
		int[] arr = generateRandomArray(n);

		System.out.println("Mảng số nguyên ban đầu:");
		printf(arr);
		System.out.println();
		System.out.println("Mảng số nguyên sau khi lọc:");
		int[] result = filter(arr);
		printf(result);
		System.out.println();
		
		double arr1 = calculateAverage(arr, 0, n / 2);
        double arr2 = calculateAverage(arr, n / 2, n);

        System.out.println("Giá trị trung bình của n/2 phần tử đầu tiên: " + arr1);
        System.out.println("Giá trị trung bình của n/2 phần tử cuối cùng: " + arr2);

        if (arr1 > arr2) {
            System.out.println("Giá trị trung bình của n/2 phần tử đầu tiên lớn hơn n/2 phần tử cuối cùng.");
        } else if (arr1 < arr2) {
            System.out.println("Giá trị trung bình của n/2 phần tử đầu tiên nhỏ hơn n/2 phần tử cuối cùng.");
        } else {
            System.out.println("Giá trị trung bình của n/2 phần tử đầu tiên bằng giá trị trung bình của n/2 phần tử cuối cùng.");
        }
        
        System.out.println();
        int thirdLargest = findThirdLargest(arr);
        System.out.println("Số lớn thứ ba trong mảng: " + thirdLargest);
	}

	private static int[] generateRandomArray(int n) {
		int[] arr = new int[n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = random.nextInt(10);
		}
		return arr;
	}

	private static int[] filter(int[] arr) {
		List<Integer> listResult = new ArrayList<>();
		Set<Integer> listUnique = new HashSet<>();

		for (Integer num : arr) {
			if (listUnique.add(num)) {
				listResult.add(num);
			}
		}

		int[] result = new int[listResult.size()];
		for (int i = 0; i < listResult.size(); i++) {
			result[i] = listResult.get(i);
		}
		return result;
	}

	public static double calculateAverage(int[] arr, int start, int end) {
		double sum = 0;
		for (int i = start; i < end; i++) {
			sum += arr[i];
		}
		return sum;
	}

	private static void printf(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	private static int findThirdLargest(int[] arr) {
        int max1 = Integer.MIN_VALUE; 
        int max2 = Integer.MIN_VALUE; 
        int max3 = Integer.MIN_VALUE; 

        for (int num : arr) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max3 = max2;
                max2 = num;
            } else if (num > max3 && num < max2) {
                max3 = num;
            }
        }

        return max3;
    }

}
