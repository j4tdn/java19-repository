package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {
		Random rd = new Random();
		List<Integer> numbers = new ArrayList<>();
		for (int i = 20; i <= 30; i++) {
			numbers.add(i);
		}
		Collections.shuffle(numbers);
		System.out.println("5 random numbers from 20 to 30: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(numbers.get(i) + " ");
		}
	}

}
