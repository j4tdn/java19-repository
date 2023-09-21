package view.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.Dish;
import common.Category;
import utils.CollectionUtils;

public class Ex01StreamBasicDemo {

	public static void main(String[] args) {
		List<Dish> menu = mockData();
		// ? Khi nào mình sẽ chuyển đổi sang stream
		// --> kinh nghiệm khi sử dụng các hàm, bài toán
		// --> thao tác xử lý với tập hợp các phần tử
		// Array, Collection(List, Set, Map)
		// ? Sử dụng hàm nào trong stream để xử lý
		// ? Cách truyền tham số cho hàm của stream

		// Nếu bài toán "phức tạp", các hàm trong stream ko hỗ trợ giải quyết
		// Tự dùng logic(problem solving, algorithm) để xử lý

		// Các bước khi dùng stream
		// B1: Convert current data structure(Array, Collection(List, Set, Map)) to
		// stream --> return stream
		// B2: Using available stream methods to process requirment --> return stream
		// B3: Convert stream to another data structure (Array, Collection(List, Set,
		// Map), #)
		// Root Cause: stream supports loop elements inside once (streaming)

		// 1. Liệt kê những đĩa thức ăn có lượng calo > 250
		Stream<Dish> dishStream = menu.stream();
		Stream<Dish> filterStream = dishStream.filter(d -> d.getCalories() > 250);
		List<Dish> collectStream = filterStream.collect(Collectors.toList());
		CollectionUtils.generate("Liệt kê những đĩa thức ăn có lượng calo > 250", collectStream);
		
		List<Dish> highCaloriesDishes = menu.stream() // Stream<Dish>
				.filter(d -> d.getCalories() > 1000)  // Stream<Dish>
				.collect(Collectors.toList());        // List<Dish>
		CollectionUtils.generate(
				"1. Liệt kê những đĩa thức ăn có lượng calo > 1000", 
				highCaloriesDishes
		);
		
		// 2. Liệt kê tên của những đĩa thức ăn: List<Dish> List<String>
		List<String> names = menu.stream()
				.map(d -> d.getName())
				.collect(Collectors.toList());
		CollectionUtils.generate(
				"2. Liệt kê tên của những đĩa thức ăn: List<Dish> List<String>", 
				names
		);
		
		// 3. Liệt kê tên của những đĩa thức ăn chay
		List<String> nameCategory = menu.stream()
				.filter(d -> Category.VEGGIE.equals(d.getCategory()))
				.map(d -> d.getName())
				.collect(Collectors.toList());
		CollectionUtils.generate(
				"3. Liệt kê tên của những đĩa thức ăn chay", 
				nameCategory
		);
	}

	private static List<Dish> mockData() {
		return List.of(new Dish("D01", "Dish A1", 220, Category.FISH), new Dish("D02", "Dish A2", 782, Category.MEAT),
				new Dish("D03", "Dish A3", 100, Category.VEGGIE), new Dish("D04", "Dish A4", 150, Category.EGG),
				new Dish("D05", "Dish B5", 220, Category.FISH), new Dish("D06", "Dish B6", 782, Category.MEAT),
				new Dish("D07", "Dish C7", 111, Category.VEGGIE), new Dish("D08", "Dish C8", 1020, Category.EGG),
				new Dish("D09", "Dish D9", 220, Category.FISH), new Dish("D10", "Dish D10", 777, Category.MEAT),
				new Dish("D11", "Dish E11", 111, Category.EGG), new Dish("D12", "Dish E12", 1500, Category.EGG));
	}

}
