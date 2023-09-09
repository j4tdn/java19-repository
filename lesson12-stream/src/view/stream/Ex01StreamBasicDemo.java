package view.stream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import bean.Dish;
import common.Category;
import utils.CollectionUtils;
import utils.StreamUtils;

import static java.util.Comparator.*;

public class Ex01StreamBasicDemo {
	public static void main(String[] args) {
		List<Dish> menu = mockData();
		
		// ? When should use stream
		// 	--> Kinh nghiệm khi sử dụng các hàm, bài toán
		//	--> thao tác xử lý với tập hợp các phần tử
		// 			Array, Collection(List, Set, Map)
		
		// ? Which method should use to process
		// ? How to pass parameters into method of stream
		
		// Step to use stream:
		// 1. Convert current data structure to stream
		// 2. Using available stream methods to process requirements -> return stream
		// 3. Convert stream to other data structure
		// * Root cause: stream supports loop elements inside once (streaming)
		
		// 1. List all dishes have calories > 250
		List<Dish> highCaloriesdishes = menu.stream() 		//Stream<Dish>
				.filter(dish -> dish.getCalories()>1000) 	//Stream<Dish>
				.collect(Collectors.toList());				//List<Dish>
		CollectionUtils.generate("1. List all dish have calories > 1000", highCaloriesdishes);
		
		
		// 2. List name of all dishes
		
		List<String> nameDishes = menu.stream()	//Stream<Dish>
				.map(dish -> dish.getName())	//Stream<String>
				.collect(Collectors.toList());	//List<String>
		CollectionUtils.generate("2. List name of all dishes", nameDishes);
		
		
		// 3. List name of all veggies
		
		List<String> nameVeggieDishes = menu.stream()						//Stream<Dish>
				.filter(dish -> Category.VEGGIE.equals(dish.getCategory()))	//Stream<Dish>
				.map(dish -> dish.getName())								//Stream<String>
				.collect(Collectors.toList());								//List<String>
		CollectionUtils.generate("3. List name of all veggies", nameVeggieDishes);
		
		// 4. Sort a weekDays Map
		
		// Option 1: map -> set -> list -sort -> linkedHashMap
		// Option 2: map -> set -> stream -sort -> linkedHashMap
		Map<String,Integer> weekdays = mockWeekdays();
		
		Map<String,Integer> sortedWeekdays = weekdays.entrySet()			//Set<Entry<String,Integer>>
			.stream()														//Stream<Entry<String,Integer>>
			.sorted(comparing(entry -> entry.getValue()))	//Stream<Entry<String,Integer>>
			.collect(Collectors.toMap(Entry::getKey, Entry::getValue, StreamUtils::mergeF, LinkedHashMap::new));
//			.collect(Collectors.toMap(k -> k.getKey(), e -> e.getValue(), (k1,k2) -> k1, () -> new LinkedHashMap<>()));
		CollectionUtils.generate("4. Sort a weekDays Map", sortedWeekdays);
	}
	
	
	private static Map<String,Integer> mockWeekdays() {
		return Map.of(
				"Monday", 2,
				"Friday", 6,
				"Tuesday", 3,
				"Thursday", 5,
				"Sunday", 8,
				"Wednesday", 4,
				"Saturday", 7
				);
	}
	
	private static List<Dish> mockData() {
		return List.of(
					new Dish("D01", "Dish A1", 220, Category.FISH),
					new Dish("D02", "Dish A2", 782, Category.MEAT),
					new Dish("D03", "Dish A3", 100, Category.VEGGIE),
					new Dish("D04", "Dish A4", 150, Category.EGG),
					new Dish("D05", "Dish B5", 220, Category.FISH),
					new Dish("D06", "Dish B6", 782, Category.MEAT),
					new Dish("D07", "Dish C7", 111, Category.VEGGIE),
					new Dish("D08", "Dish C8", 1020, Category.EGG),
					new Dish("D09", "Dish D9", 220, Category.FISH),
					new Dish("D10", "Dish D10", 777, Category.MEAT),
					new Dish("D11", "Dish E11", 111, Category.EGG),
					new Dish("D12", "Dish E12", 1500, Category.EGG)
				);
	}
} 
