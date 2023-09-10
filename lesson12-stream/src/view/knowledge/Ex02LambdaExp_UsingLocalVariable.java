package view.stream.practice;

import static utils.CollectionUtils.generate;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import utils.StreamUtils;

public class Ex01FilterAndSlice {
	
	// Stream#filter(Predicate<T> predicate)
	// T: Data Type of each element in Stream
	
	public static void main(String[] args) {
	
		// demo with available object type
		
		/*
		 -- var --
		 
		 js: function scope 
		   : dynamic(loosely type)
		 
		 java: block scope
		     : static type
		     : short version of code
		     : restriction
		 */
		
		// itemId, name, storeId
		//  1       1A     101
		//  2       2B     101
		//  3       3c     101
		//  4       4A     102
		//  5       5B     102
		//  6       6c     103
		
		// Stream<Item>#groupBy(storeId) --> Map<StoreId, List<Item>> --> 3 phần tử
		
		var letters = List.of("a", "b", "c", "f", "g", "g", "a", "a", "b");
		
		// 1. Distinct elements from numbers
		//    Expected: a b c f g
		var noneDupElements = letters.stream()
			.distinct()
			.collect(Collectors.toList());
		
		// noneDupElements = numbers.stream().collect(Collectors.toSet());
		
		generate(
			"1. Distinct elements from numbers",
			noneDupElements
		);
		
		// 2. Select unique elements from input list of numbers
		//    Expected: 2, 18, 15
		
		// Map<Integer, Integer>: {a, 3}, {b, 2}, {c, 1}, {f, 1}, {g, 2}
		// K: từng phần tử
		// V: số lần xuất hiện của number
		
		/*
		
		Do not use Stream<?>
		
		Map<String, Integer> statistics = new HashMap<>();
		letters.forEach(letter -> {
			var newAmount = statistics.containsKey(letter) ? statistics.get(letter) + 1 : 1;
			statistics.put(letter, newAmount);
		});
		
		Set<String> uniqueElements = new HashSet<>();
		statistics.forEach((k, v) -> {
			if (v == 1) {
				uniqueElements.add(k);
			}
		});
		*/
		
		// letter -> letter <==> Function.identitys
		var uniqueElements = letters.stream()     // Stream<T>
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Map<K, V>
				.entrySet() 					  // Set<Entry<K, V>>
				.stream()                         // Stream<Entry<K, V>> 
				.filter(e -> e.getValue() == 1L)  // Stream<Entry<K, V>>
				.map(Entry::getKey)               // Stream<K>
				.collect(Collectors.toSet());     // Set<K>
		
		uniqueElements = letters.stream()
				.filter(i -> Collections.frequency(letters, i) == 1)
				.collect(Collectors.toSet());
		
		generate(
				"2. Select unique elements from input list of numbers",
				uniqueElements
		);
		
		// demo with custom object type
		
		// 3. Distinct dish from menu by category
		var menu = DataModel.mockData();
		
		var nonDupElementsByCategory = menu.stream()
			.collect(Collectors.toMap(Dish::getCategory, Function.identity(), StreamUtils::mergeF, LinkedHashMap::new));
		
		generate(
				"3. Distinct dish from menu by category",
				nonDupElementsByCategory
		);
	}
	
}