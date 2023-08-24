package view.d.generic;

import java.util.List;

import bean.Item;

public class Ex04GenericWildCard_ListDemo {
	
	public static void main(String[] args) {
		List<Integer> intList = List.of(5, 7, 8, 2, 6);
		
		List<Double> douList = List.of(8d, 2d, 1d, 7d);
		
		List<String> strList = List.of("x", "b", "a", "z");
		
		List<Item> iteList = List.of(new Item(1), new Item(5), new Item(2), new Item(7));
		
		
		System.out.println("=================== *** use generic method - wild card ***  ========================");
		
		g_printf("intArray", intList);
		
		g_printf("douArray", douList);
		
		g_printf("strArray", strList);
		
		g_printf("iteArray", iteList);
		
		System.out.println("=================== *** use generic method - wild card - extends ***  ========================");
		
		gn_printf("intArray", intList);
		
		gn_printf("douArray", douList);
		
		// gn_printf("strArray", strList);
		
		// gn_printf("iteArray", iteList);
		
		System.out.println("=================== *** use generic method - wild card - super ***  ========================");
		
		// gs_printf("intArray", intList);
		
		// gs_printf("douArray", douList);
		
		gs_printf("strArray", strList);
		
		// gs_printf("iteArray", iteList);
	}
	
	/*
	 
	 Generic Type:
	    + Default: Object
	    + Extends: giới hạn trên
	    
	 Generic Wild Card
	    + Default: Object
	    + Extends: giới hạn trên
	    + Super  : giới hạn dưới
	 
	 */
	
	private static void g_printf(String prefix, List<?> elements) {
		System.out.println(prefix + " --> ");
		for (Object element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	
	// Là Number hoặc con của Number
	private static void gn_printf(String prefix, List<? extends Number> elements) {
		System.out.println(prefix + " --> ");
		for (Number element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	
	// Là String hoặc cha của String
	private static void gs_printf(String prefix, List<? super String> elements) {
		System.out.println(prefix + " --> ");
		for (Object element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}
}