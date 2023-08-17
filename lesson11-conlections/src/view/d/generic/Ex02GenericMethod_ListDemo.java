package view.d.generic;

import java.util.List;

import bean.Item;

public class Ex02GenericMethod_ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = List.of(5, 7, 6, 9, 10);
		List<Double> douList = List.of(5d, 7d, 6d, 9d, 10d);
		List<String> strList = List.of("x", "y", "z");
		List<Item> iteList = List.of(new Item(1), new Item(2), new Item(4));

		// =================== unused generic method ================
		// Object[] là KDL cha của Integer[], Double[]
		// List<Object> không phải là KDL cha của Integer[], Double[]
		// List<Object> hay List<Integer> là KDL List<T> , Integer hay Object là KDL truyền vào cho generic type trong list
		printf("intArray", intList);
		printf("douArray", douList);
		printf("strArray", strList);
		printf("iteArray", iteList);

		// =================== use generic method ===================

		g_printf("intArray", intList);
		g_printf("douArray", douList);
		g_printf("strArray", strList);
		g_printf("iteArray", iteList);
		
		gn_printf("intArray", intList);
		gn_printf("douArray", douList);
//		gn_printf("strArray", strList);
//		gn_printf("iteArray", iteList);
	}

	// c1: sử dụng lợi ích tính chất thừa kế, đa hình ( trong đối tương)
	private static void printf(String prefix, List<Object> objects) {
		System.out.println(prefix + " -->");
		for (Object object : objects) {
			System.out.println(object);
		}
		System.out.println();
	}

	// c2: sử dụng generic method , là method có tham số là generic type
	// Element: generic type, nhận giá trị là kiểu dữ liệu đối tượng
	private static <Element> void g_printf(String prefix, List<Element> elements) {
		System.out.println(prefix + " -->");
		for (Element element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	
	private static <Element extends Number> void gn_printf(String prefix, List<Element> elements) {
		System.out.println(prefix + " -->");
		for (Element element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}
}
