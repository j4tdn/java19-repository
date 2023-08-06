package view;

import java.util.Arrays;

public class Ex01ArrayHandling {
	public static void main(String[] args) {
		Integer[] numbers = { 1, 2, 3, 4, 3, 1 };

		// 1. Loại bỏ những phần tử trùng nhau VD: {1,2,3,4,3,1} Kết quả: {2,4}
		System.out.print("removeDuplicatedElements\n\n" + Arrays.toString(numbers) + " --> ");
		System.out.println(Arrays.toString(removeDuplicatedElements(numbers)));

		// 2. So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối
		// cùng
		System.out.println("\n\nCompare Average\n\n" + Arrays.toString(numbers) + " --> " + compareAvg(numbers));

		// 3. Tìm số lớn thứ 3 trong mảng. Lưu ý trường hợp các phần tử lớn nhất trùng
		// nhau VD: {7 8 8 8 6 2 5 1} Kết quả: 6
		Integer[] testNumber = { 7, 8, 8, 8, 6, 2, 5, 1 };
		System.out.print("\n\nThe Third Biggest Element\n\n" + Arrays.toString(testNumber) + " --> ");
		try {
			System.out.print(findThirdBiggestElement(testNumber));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}

	public static Integer[] removeDuplicatedElements(Integer[] numbers) {
		boolean[] isDuplicated = new boolean[numbers.length];

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					isDuplicated[i] = isDuplicated[j] = true;
				}
			}
		}

		int indexCounter = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			if (isDuplicated[i] == false) {
				numbers[indexCounter++] = numbers[i];
			}
		}

		return Arrays.copyOfRange(numbers, 0, indexCounter);
	}

	public static String compareAvg(Integer[] numbers) {
		Integer firstHalfSum = 0, firstHalfElement = 0;
		Integer secondHalfSum = 0, secondHalfElement = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (i < numbers.length / 2) {
				firstHalfElement++;
				firstHalfSum += numbers[i];
			} else {
				secondHalfElement++;
				secondHalfSum += numbers[i];
			}
		}

		if ((firstHalfSum / firstHalfElement) > (secondHalfSum / secondHalfElement)) {
			return "First Half Average > Second Half Average";
		} else if ((firstHalfSum / firstHalfElement) == (secondHalfSum / secondHalfElement)) {
			return "First Half Average = Second Half Average";
		} else
			return "First Half Average < Second Half Average";
	}

	public static Integer findThirdBiggestElement(Integer[] numbers) {
		Arrays.sort(numbers);
		numbers = removeDuplicatedElements(numbers);
		if (numbers.length < 3) {
			throw new IllegalArgumentException("Cannot find the third biggest b/c array less than 3 different value");
		} else
			return numbers[numbers.length - 2];
	}

}
