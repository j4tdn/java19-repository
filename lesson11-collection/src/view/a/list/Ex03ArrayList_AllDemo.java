package view.a.list;

import java.util.ArrayList;
import java.util.List;

public class Ex03ArrayList_AllDemo {
    public static void main(String[] args) {
		List<Integer> list1 = List.of(1,2,3,4,5);
		List<Integer> list2 = List.of(3,4,5,6,7,8);
		
		List<Integer> addAllList = new ArrayList<>();
		addAllList.addAll(list1);
		addAllList.addAll(list2);
		
		System.out.println("--add all list ---\n"); //hop
		addAllList.forEach(nber -> System.out.print(nber + " "));
		System.out.println("\n");
		
		List<Integer> removeAllList = new ArrayList<>();
		removeAllList.removeAll(list2);
		
		System.out.println("--remove all list ---\n");//hieu
		removeAllList.forEach(nber -> System.out.print(nber + " "));
		System.out.println("\n");
		
		List<Integer> retainAllList = new ArrayList<>();
		retainAllList.retainAll(list2);
		
		System.out.println("--retain all list ---\n");//giao
		removeAllList.forEach(nber -> System.out.print(nber + " "));
		System.out.println("\n");
	}
}
