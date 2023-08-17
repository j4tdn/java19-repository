package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex03DataMainpulation {

	public static void main(String[] args) {
		//add, remove, get, set, contains, size, iterate
		List<String> elements = new ArrayList<>();
		elements.add("A");
		elements.add("B");
		elements.add("C");
		elements.add("D");
		// remove
//		elements.remove(1);
//		elements.remove("C");
//		elements.removeIf(new Predicate<String>() {
//
//			@Override
//			public boolean test(String element) {
//				// TODO Auto-generated method stub
//				return element.compareTo("D") > 0;
//			}
//			
//		});
		
		elements.removeIf(element -> element.compareTo("C") > 0);
		System.out.println(elements.get(2));
		System.out.println(elements.contains("X"));
		
		System.out.println("Array elements:" + elements.size());
		System.out.println(elements);

	}
	
	//hàm iterate giống hàm for nhưng kiểm tra trc khi duyệt qua
	private static void iterate(List<String> elements) {
		Iterator<String> each = elements.iterator();
		while(each.hasNext()) {
			String element = each.next();
			System.out.println(element);
		}
	}

}
