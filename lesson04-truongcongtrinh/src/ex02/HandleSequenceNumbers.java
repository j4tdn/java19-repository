package ex02;

import java.util.ArrayList;
import java.util.List;

public class HandleSequenceNumbers {
	public static void main(String[] args) {
		int[] numbers = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};

		List<Integer> divisibleBy7Not5 = new ArrayList<>();
		List<Integer> divisibleBy5Not7 = new ArrayList<>();
		List<Integer> notDivisibleBy5and7 = new ArrayList<>();
		List<Integer> divisibleBy5and7 = new ArrayList<>();

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 7 == 0 && numbers[i] % 5 != 0) {
				divisibleBy7Not5.add(numbers[i]);
			} else if (numbers[i] % 7 != 0 && numbers[i] % 5 == 0) {
				divisibleBy5Not7.add(numbers[i]);
			} else if (numbers[i] % 7 == 0 && numbers[i] % 5 == 0) {
				divisibleBy5and7.add(numbers[i]);
			} else
				notDivisibleBy5and7.add(numbers[i]);
		}

		List<Integer> resList = new ArrayList<>();
		resList.addAll(divisibleBy7Not5);
		resList.addAll(notDivisibleBy5and7);
		resList.addAll(divisibleBy5Not7);

		int index = (int) Math.ceil(numbers.length / 2.f);
		resList.addAll(index, divisibleBy5and7);

		resList.forEach(item -> {
			System.out.print(item + " ");
		});
	}

}
