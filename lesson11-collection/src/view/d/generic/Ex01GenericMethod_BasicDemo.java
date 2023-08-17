package view.d.generic;

import java.util.Arrays;

import bean.Item;

public class Ex01GenericMethod_BasicDemo {

	// Viết chương trình in ra danh sách các phần tử trong mảng: Interger, Double, String, Item
	
	// Sắp xếp với Arrays.sort(elements) --> Yêu cầu từng element phải là con của Comparable<?>
	// Nếu ko --> bắt lỗi tại runtime
	
	// Làm lại bài này nhưng bắt lỗi tại compile

	public static void main(String[] args) {

		Integer[] intArray = {5, 7, 8, 2, 6};
		
		Double[] douArray = {8d, 2d, 1d, 7d};
		
		String[] strArray = {"x", "b", "a", "z"};
		
		Item[] iteArray = {new Item(1), new Item(5), new Item(2), new Item(7)};
		
		System.out.println("=================== *** unused generic method  *** ========================");
		
		// sort(iteArray); runtime error
		
		printf("intArray", intArray);
		
		printf("douArray", douArray);
		
		printf("strArray", strArray);
		
		printf("iteArray", iteArray);

		
		System.out.println("=================== *** use generic method ***  ========================");
		
		// g_sort(iteArray); compile error
		
		g_printf("intArray", intArray);
		
		g_printf("douArray", douArray);
		
		g_printf("strArray", strArray);
		
		g_printf("iteArray", iteArray);

	}
	
	// lúc compile Object[] = Element[]
	
	private static void sort(Object[] objects) {
		// có thể bị lỗi tại runtime nếu, Object lúc runtime ko phải là Comparable
		Arrays.sort(objects);
	}
	
	private static <Element extends Comparable<Element>> void g_sort(Element[] elements) {
		// bắt lỗi tại compile, yêu cầu Element phải là Comparable hoặc con của Comparable
		Arrays.sort(elements);
	}

	// c1 --> sử dụng lợi ích của t/c thừa kế, đa hình(trong đối tượng)
	private static void printf(String prefix, Object[] objects) {
		System.out.println(prefix + " --> ");
		for (Object object : objects) {
			System.out.println(object);
		}
		System.out.println();
	}
	
	// c2 --> sử dụng generic method, là method có tham số là generic type
	// Element: generic type, nhận giá trị là kiểu dữ liệu đối tượng
	private static <Element> void g_printf(String prefix, Element[] elements) {
		System.out.println(prefix + " --> ");
		for (Element element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}
}
