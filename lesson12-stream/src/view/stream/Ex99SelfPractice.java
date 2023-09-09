package view.stream;

import java.util.ArrayList;
import java.util.List;

public class Ex99SelfPractice {
	public static void main(String[] args) {
		List<Integer> numbers = generate();

		System.out.println("\n1. Print out each number in the list.");
		numbers.stream().forEach(t -> System.out.print(t + " "));

		System.out.println("\n\n2. Filter the list to only contain even numbers, and print out the filtered list.");
		numbers.stream().filter(n -> (n % 2) == 0).forEach(t -> System.out.print(t + " "));

		System.out.println("\n\n3. Add 3 to each number in the original list, and print out the new list.");
		numbers.stream().forEach(t -> System.out.print(t + 3 + " "));

		System.out.println("\n\n4. Sort the original list, and print the sorted list.");
		numbers.stream().sorted().forEach(t -> System.out.print(t + " "));

		System.out.println("\n\n5. Calculate the sum of all numbers in the original list.");
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.print("Sum: " + sum);

		System.out.println("\n\n6. Calculate the average of all numbers in the original list.");
		double average = numbers.stream().mapToDouble(Double::valueOf).average().orElse(0.0);
		System.out.print("Average: " + average);

		System.out.println("\n\n7. Find the max value in the original list using Math.max().");
		int max = numbers.stream().max(Integer::compare).orElse(0);
		System.out.print("Max: " + max);
		
		System.out.println("\n\n8. See if the list contains the number 3.");
		boolean has3 = numbers.contains(3);
	    System.out.print("Contains 3: " + has3);
	    
	    System.out.println("\n\n9. Filter the list to only contain numbers greater than 3, and print the filtered list.");
	    numbers.stream().filter(n -> n>3).forEach(t -> System.out.print(t + " "));

	    System.out.println("\n\n10.Remove the first number in the list, and print the remaining list.");
	    numbers.stream().skip(1).forEach(t -> System.out.print(t + " "));
	}

	private static List<Integer> generate() {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(4);
		numbers.add(3);
		numbers.add(5);
		numbers.add(2);
		return numbers;
	}

}
