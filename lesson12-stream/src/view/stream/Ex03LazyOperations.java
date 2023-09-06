package view.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Dish;
import utils.CollectionUtils;

public class Ex03LazyOperations {
	
	public static void main(String[] args) {
		
		// lazy processing for intermediate operations
		// những intermediate operations sẽ ko được thực thi cho đến khi termial operations được gọi
		
		// khi chuyển stream, chấm gọi các hàm nào đi nữa, cuối cùng phải gọi terminal operation để thực thi
		// stream pipeline và return data
		
		List<Dish> menu = Ex01StreamBasicDemo.mockData();
		
		Set<String> set = menu.stream()
			.filter(d -> {
				System.out.println("filter --> " + d.getId());
				return d.getCalories() > 220;
			})
			.map(d -> {
				System.out.println("map --> " + d.getId());
				return d.getName();
			})
			.limit(3)
			.collect(Collectors.toSet());
		
		System.out.println();
		
		CollectionUtils.generate("set result", set);
		
		System.out.println("Ex03LazyOperations --> finished");
		
	}
}
