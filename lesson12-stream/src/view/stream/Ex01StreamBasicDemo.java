package view.stream;

import static java.util.Comparator.comparing;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.Dish;
import common.Category;
import utils.CollectionUtils;
import utils.StreamUtils;

public class Ex01StreamBasicDemo {
	public static void main(String[] args) {
		List<Dish> menu = mockData();
		
		// ? Khi nào mình sẽ chuyển đổi sang stream
		//   --> kinh nghiệm khi sử dụng các hàm, bài toán
		//   --> thao tác xử lý với tập hợp các phần tử
		//       Array, Collection(List, Set, Map)
		// ? Sử dụng hàm nào trong stream để xử lý
		// ? Cách truyền tham số cho hàm của stream
		
		// Nếu bài toán "phức tạp", các hàm trong stream ko hỗ trợ giải quyết
		// Tự dùng logic(problem solving, algorithm) để xử lý
		
		// Các bước khi dùng stream
		// B1: Convert current data structure(Array, Collection(List, Set, Map)) to stream --> return stream
		// B2: Using available stream methods to process requirment --> return stream
		// B3: Convert stream to another data structure (Array, Collection(List, Set, Map), #)
		//     Root Cause: stream supports loop elements inside once (streaming)
		
		// 1. Liệt kê những đĩa thức ăn có lượng calo > 250
		Stream<Dish> dishStream = menu.stream();
		Stream<Dish> filteredDishStream = dishStream.filter(d -> d.getCalories() > 250);
		List<Dish> filteredDishList = filteredDishStream.collect(Collectors.toList());
		CollectionUtils.generate(
				"1. Liệt kê những đĩa thức ăn có lượng calo > 250", 
				filteredDishList
		);
		
		List<Dish> highCaloriesDishes = menu.stream() // Stream<Dish>
				.filter(d -> d.getCalories() > 1000)  // Stream<Dish>
				.collect(Collectors.toList());        // List<Dish>
		CollectionUtils.generate(
				"1. Liệt kê những đĩa thức ăn có lượng calo > 1000", 
				highCaloriesDishes
		);
		
		// 2. Liệt kê tên của những đĩa thức ăn: List<Dish> List<String>
		List<String> names = menu.stream() // Stream<Dish>
			.map(d -> d.getName())         // Stream<String>
		    .collect(Collectors.toList()); // List<String>
		CollectionUtils.generate(
				"2. Liệt kê tên của những đĩa thức ăn: List<Dish> List<String>", 
				names
		);
		
		// 3. Liệt kê tên của những đĩa thức ăn chay
		List<String> veggieDishNames = menu.stream()               // Stream<Dish>
			.filter(d -> Category.VEGGIE.equals(d.getCategory()))  // Stream<Dish>
			.map(d -> d.getName())                                 // Stream<String>
			.collect(Collectors.toList());                         // List<String>
		CollectionUtils.generate(
				"3. Liệt kê tên của những đĩa thức ăn chay", 
				veggieDishNames
		);
		
		
		// 4. Sắp xếp một weekday map
		// Opt1: map -> set -> list   -> -sort- -> linkedHashMap
		// Opt2: map -> set -> stream -> -sort- -> linkedHashMap
		
		// X A
		// Y B
		// X C
		
		// Stream<Entry<K, V>> --> Map<K, V>
		// Stream<T>           --> Map<K, V>
		
		// e -> e.getKey()   chuyển lấy key của entry trong stream đưa sang key của map  ==> Entry::getKey
		// e -> e.getValue() chuyển lấy val của entry trong stream đưa sang val của map  ==> Entry::getValue
		// (v1, v2) -> v1    nếu 2 phần tử từ stream đưa sang key trong map trùng nhau thì chọn val của key trước hay sau
		// () -> new LinkedHashMap<>() chọn cấu trúc dữ liệu map trả về ==> LinkedHashmap::new
		
		Map<String, Integer> weekdays = mockWeekdays();
		Map<String, Integer> sortedWeekdays = weekdays.entrySet() // Set<Entry<String, Integer>>
			.stream()                                             // Stream<Entry<String, Integer>>
			.sorted(comparing(Entry::getValue)) // Stream<Entry<String, Integer>>
			.collect(Collectors.toMap(Entry::getKey, Entry::getValue, StreamUtils::mergeF, LinkedHashMap::new));
			// .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (v1, v2) -> v1, () -> new LinkedHashMap<>()));
		CollectionUtils.generate(
				"4. Sắp xếp một weekday map",
				sortedWeekdays
		);
		
		// .stream
		
		// .filter
		// .sorted
		// .map
		
		// .collect
	}
	
	private static Map<String, Integer> mockWeekdays() {
		return Map.of(
				"Monday", 2, 
				"Friday", 6, 
				"Tuesday", 3,
				"Thursday", 5,
				"Wednesday", 4);
	}
	
	
	public static List<Dish> mockData() {
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