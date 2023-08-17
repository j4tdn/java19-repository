package view.d.generic;

import java.util.List;

import bean.Item;

public class Ex04GenericWildCard_ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = List.of(5, 7, 6, 9, 10);
		List<Double> douList = List.of(5d, 7d, 6d, 9d, 10d);
		List<String> strList = List.of("x", "y", "z");
		List<Item> iteList = List.of(new Item(1), new Item(2), new Item(4));

		// =================== use generic method - wild card ===================

		g_printf("intArray", intList);
		g_printf("douArray", douList);
		g_printf("strArray", strList);
		g_printf("iteArray", iteList);

		// =================== use generic method - wild card - extend ===================

		gn_printf("intArray", intList);
		gn_printf("douArray", douList);
//		gn_printf("strArray", strList);
//		gn_printf("iteArray", iteList);
		
		// =================== use generic method - wild card - super ===================

		gnf_printf("intArray", intList);
		gnf_printf("douArray", douList);
		gnf_printf("strArray", strList);
		gnf_printf("iteArray", iteList);

	}
	/*
	 * Generic Type 
	 * + Default : Object 
	 * + Extends : Giới hạn trên
	 * 
	 * Generic Wild Card 
	 * + Default : Object 
	 * + Extends : Giới hạn trên
	 * + Super : Giới hạn dưới
	 */

	private static <Element> void g_printf(String prefix, List<?> elements) {
		System.out.println(prefix + " -->");
		for (Object element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	
	//Là Number hoặc con của Number
	private static void gn_printf(String prefix, List<? extends Number> elements) {
		System.out.println(prefix + " -->");
		for (Number element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	
	//Là String hoặc cha của String
	private static void gnf_printf(String prefix, List<? super String> elements) {
		System.out.println(prefix + " -->");
		for (Object element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}
}
