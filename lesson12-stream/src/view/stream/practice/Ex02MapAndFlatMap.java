package view.stream.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import utils.CollectionUtils;

public class Ex02MapAndFlatMap {
	
	public static void main(String[] args) {
		
		// Stream<T>#map(Function<T, R>) --> Stream<R>
		
		// Colection<Collection<T>> # stream --> Stream<Collection<E>>
		
		// # flatMap(Function<C, Stream<E>) --> Stream<E>
		
		var sequences = List.of(
				List.of(1, 3, 5),
				List.of(2, 4, 6),
				List.of(3, 7, 9)
		);
		
		// list -> list.stream() --> Collection::stream
		// item -> item.getId()  --> Item::getId
		
		var elements = sequences.stream() 					// Stream<List<Integer>>
							.flatMap(Collection::stream) // Stream<Integer>
							.collect(Collectors.toSet());   // Set<Integer>
		
		CollectionUtils.generate(
				"Demo FlatMap with Collection", 
				elements
		);
		
		// Collection<T> stream ---> Stream<T>
		
		// Array: Object || Primitive Type
		
		// Integer[] --> Stream<Integer>
		// Item[]    --> Stream<Item>
		
		
		// primitive, numeric stream --> sum, sub, min, max, avg
		// int[]     --> IntStream  
		// long[]    --> LongStream
		
		int[][] numbers = {{1,2}, {2,3}, {3,4}};
		
		int[] primitiveArray = Arrays.stream(numbers) // Stream<int[]>
			  .flatMapToInt(a -> Arrays.stream(a)) // IntStream
			  .toArray();
			  
		System.out.println("primitiveArray --> " + Arrays.toString(primitiveArray));	
		
	}
}
