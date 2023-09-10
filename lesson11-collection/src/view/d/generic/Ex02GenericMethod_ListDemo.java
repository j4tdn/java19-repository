package view.d.generic;

import java.util.List;

import bean.Item;

public class Ex02GenericMethod_ListDemo {
	
	public static void main(String[] args) {
		List<Integer> intList = List.of(5, 7, 8, 2, 6);
		
		List<Double> douList = List.of(8d, 2d, 1d, 7d);
		
		List<String> strList = List.of("x", "b", "a", "z");
		
		List<Item> iteList = List.of(new Item(1), new Item(5), new Item(2), new Item(7));
		
		System.out.println("=================== *** unused generic method  *** ========================");
		
		// Object[] là KDL cha của Integer[], Double[]
		
		// List<Object> không phải là KDL cha của List<Integer>, List<Double> ...
		
		// List<Object> hay List<Integer> là KDL List<T>, Integer hay Object là KDL truyền vào cho generic type trong list
		
		// printf("intArray", intList);
		
		// printf("douArray", douList);
		
		// printf("strArray", strList);
		
		// printf("iteArray", iteList);

		
		System.out.println("=================== *** use generic method ***  ========================");
		
		// g_sort(iteArray); compile error
		
		g_printf("intArray", intList);
		
		g_printf("douArray", douList);
		
		g_printf("strArray", strList);
		
		g_printf("iteArray", iteList);
		
		
		// upper bounder with extends keyword
		
		gn_printf("intArray", intList);
		
		gn_printf("douArray", douList);
		
		// gn_printf("strArray", strList);
		
		// gn_printf("iteArray", iteList);
	}
	
	// c1 --> sử dụng lợi ích của t/c thừa kế, đa hình(trong đối tượng)
	private static void printf(String prefix, List<Object> objects) {
		System.out.println(prefix + " --> ");
		for (Object object : objects) {
			System.out.println(object);
		}
		System.out.println();
	}
	
	// c2 --> sử dụng generic method, là method có tham số là generic type
	// Element: generic type, nhận giá trị là kiểu dữ liệu đối tượng
	private static <Element> void g_printf(String prefix, List<Element> elements) {
		System.out.println(prefix + " --> ");
		for (Element element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	
	private static <Element extends Number> void gn_printf(String prefix, List<Element> elements) {
		System.out.println(prefix + " --> ");
		for (Element element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}
}