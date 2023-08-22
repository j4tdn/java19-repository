package view.d.generic;

import java.util.List;

import bean.Item;

public class Ex04Generic_WillCard_ListDemo {
public static void main(String[] args) {
	List<Integer> intList = List.of(5, 7, 8, 2, 6) ;
	List<Double> douList = List.of( 8d, 2d, 1d, 7d);
	List<Item> iteArray = List.of(new Item(1), new Item(5), new Item(2), new Item(7));
	List<String> strList = List.of("a", "b", "c", "d") ;
	g_printf("strList -> ", strList);
	gn_printf("douList -> ", douList);
}
private static void printf(String prefix, Object[] object) {
	System.out.println(prefix + " -> ");
	for(Object objects : object) {
		System.out.println(objects);
	}
	System.out.println();
}
private static<E> void g_printf(String prefix, List<?> elements) {
	System.out.println(prefix + " -> ");
	for(Object element : elements) {
		System.out.println(element);
	}
	System.out.println();
}
private static <Element extends Number> void gn_printf(String prefix, List<? extends Number> elements) {
	System.out.println(prefix + " -> ");
	for(Number element : elements) {
		System.out.println(element);
	}
	System.out.println();
}
private static void gs_printf(String prefix, List<? super String > elements) {
	System.out.println(prefix + " -> ");
	for(Object element : elements) {
		System.out.println(element);
	}
	System.out.println();
}
}
