package view.d.generic;

import java.util.Arrays;

import bean.Item;

public class Ex01GenericMethod_BasicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = {5, 7, 6, 9, 10};
		Double[] douArray = {5d, 7d, 6d, 9d, 10d};
		String[] strArray = {"x", "y", "z"};
		Item[] iteArray = {new Item(1), new Item(2), new Item(4)};
		
		//=================== unused generic method ================
		printf("intArray", intArray);
		printf("douArray", douArray);
		printf("strArray", strArray);
		printf("iteArray", iteArray);
		
//		sort(iteArray); // lỗi tại compile
		
		//=================== use generic method ===================
		g_sort(iteArray);
		
		g_printf("intArray", intArray);
		g_printf("douArray", douArray);
		g_printf("strArray", strArray);
		g_printf("iteArray", iteArray);
		
	
	}
	
	private static void sort(Object[] objects) {
		// có thể bị lỗi tại runtime nếu Object lúc runtime ko phải là Comparable
		Arrays.sort(objects);
	}
	
	private static <Element extends Comparable<Element>> void g_sort(Element[] elements) {
		// bắt lỗi tại compile, yêu cầu Element phải là Comparable hoặc là con của Comparable
		Arrays.sort(elements);
	}
	
	//c1: sử dụng lợi ích tính chất thừa kế, đa hình ( trong đối tương)
	private static void printf(String prefix, Object[] objects) {
		System.out.println(prefix + " -->");
		for (Object object : objects) {
			System.out.println(object);
		}
		System.out.println();
	}
	
	//c2: sử dụng generic method , là method có tham số là generic type
	// Element: generic type, nhận giá trị là kiểu dữ liệu đối tượng 
		private static <Element> void g_printf(String prefix, Element[] elements) {
			System.out.println(prefix + " -->");
			for (Element element : elements) {
				System.out.println(element);
			}
			System.out.println();
		}

}
