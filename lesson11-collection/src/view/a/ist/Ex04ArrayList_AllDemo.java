package view.a.ist;

import java.util.ArrayList;
import java.util.List;

public class Ex04ArrayList_AllDemo {
public static void main(String[] args) {
	List<Integer> list1 = List.of(1, 2, 3, 4, 5);
	List<Integer> list2 = List.of(3, 4, 5, 6, 7, 8);
	
	List<Integer> addAddList = new ArrayList<>();
	addAddList.addAll(list1);
	addAddList.addAll(list2);
	
	
	System.out.println("------------ADD ALl List--------------\n");
	addAddList.forEach(nber -> System.out.println(nber + " "));
	System.out.println("\n");
	
	System.out.println("------------Remove ALl List--------------\n");
	List<Integer> removeAddList = new ArrayList<>(list1);
	removeAddList.removeAll(list2);
	removeAddList.forEach(nber -> System.out.println(nber + " "));
	
}
}
