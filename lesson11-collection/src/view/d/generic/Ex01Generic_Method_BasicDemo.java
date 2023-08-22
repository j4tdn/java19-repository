package view.d.generic;

import java.util.Arrays;
import java.util.List;

import bean.Item;

public class Ex01Generic_Method_BasicDemo {
	
public static void main(String[] args) {
	Integer[] intArray = {5, 7, 8, 2, 6};
	Double[] douArray = {8d, 2d, 1d, 7d};
	Item[] iteArray = {new Item(1), new Item(5), new Item(2), new Item(7)};
	String[] strArray = {"a", "b", "c", "d"};
	
	g_sort(intArray);
	g_printf("intArray", intArray);
}
private static void sort(Object[] a) {
	Arrays.sort(a);
}
private static<Element> void g_sort(Element[] elements) {
	Arrays.sort(elements);
}
private static void printf(String prefix, Object[] object) {
	System.out.println(prefix + " -> ");
	for(Object objects : object) {
		System.out.println(objects);
	}
	System.out.println();
}

private static<E> void g_printf(String prefix, E[] elements) {
	System.out.println(prefix + " -> ");
	for(E element : elements) {
		System.out.println(element);
	}
	System.out.println();
}
}
