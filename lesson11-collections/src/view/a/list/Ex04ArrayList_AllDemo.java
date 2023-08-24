package view.a.list;

import java.util.*;

public class Ex04ArrayList_AllDemo {
	public static void main(String[] args) {
		List<Integer> list1 = List.of(1, 2, 3, 4, 5);
		List<Integer> list2 = List.of(3, 4, 5, 6, 7, 8);
		List<Integer> addAllList = new ArrayList<>();
		addAllList.addAll(list1);
		addAllList.addAll(list2);
		System.out.println("----------ADD ALL LIST----------\n");
		addAllList.forEach(nber -> System.out.print(nber + " "));
		System.out.println("\n");
		System.out.println("----------REMOVE ALL LIST----------\n");
		List<Integer> removeAllList = new ArrayList<>(list1);
		removeAllList.removeAll(list2);
		removeAllList.forEach(nber -> System.out.print(nber + " "));
		System.out.println("\n");
		System.out.println("----------RETAIN ALL LIST----------\n");
		List<Integer> retainAllList = new ArrayList<>(list1);
		retainAllList.retainAll(list2);
		retainAllList.forEach(nber -> System.out.print(nber + " "));
		System.out.println("\n");
		
	}
}
