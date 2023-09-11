package view.stream.practice;

import java.util.List;

import bean.Dish;
import model.DataModel;

public class Ex04Reduce {
	
	public static void main(String[] args) {
		
		// Calculate sum of numbers from the given list
		
		/*
		  T reduce(T identity, BinaryOperator<T> accumulator);
		  --------------------------------------------------
		  T result = identity;
          for (T element : this stream)
              result = accumulator.apply(result, element);
          return result;
		 */
		
		var numbers = List.of(2, 4, 7);
		
		int sum = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println("sum --> " + sum);
		
		var menu = DataModel.mockData();
		
		// Calculate sum of calories from the given menu
		int sumOfCalories = menu.stream()
			.map(Dish::getCalories) // Stream<Integer>
			.reduce(0, Integer::sum);
		System.out.println("sumOfCalories -> " + sumOfCalories);
		
		// Find dish with highest calories from the given menu
		
	}
}
