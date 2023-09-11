package view.a.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04ArrayList_AllDemo {
	public static void main(String[] args) {
		List<Integer> list1 = List.of(1,2,3,4,5);
		List<Integer> list2 = List.of(3,4,5,6,7,8);
		
		List<Integer> addAddList = new ArrayList<>(list1);
		addAddList.addAll(list2);
		addAddList.forEach(nber -> System.out.print(nber + " "));
		System.out.println("\n");
		
		List<Integer> removeAddList = new ArrayList<>(list1);
		removeAddList.removeAll(list2);
		removeAddList.forEach(nber -> System.out.print(nber + " "));
		System.out.println("\n");
		
		List<Integer> retainAddList = new ArrayList<>(list1);
		retainAddList.retainAll(list2);
		retainAddList.forEach(nber -> System.out.print(nber + " "));
		System.out.println("\n");
	}
}
