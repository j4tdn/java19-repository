package view.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex07ListPerformance {

	// Add, Get, Set, Remove
	private static int COUNT = 50000;

	public static void main(String[] args) {
		List<String> alist = new ArrayList<>();
		List<String> llist = new LinkedList<>();
		
		alist.forEach(null);

		// Add to the end --> expected "same"
		long start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			alist.add("element # " + i);
		}
		System.out.println("Add " + COUNT + " elements to the end: ArrayList took " + (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			llist.add("element # " + i);
		}
		System.out.println("Add " + COUNT + " elements to the end: LikedList took " + (System.currentTimeMillis() - start) + "ms");

		System.out.println();
		
		// Add at index: n/2(LinkedList)
		for (int i = 0; i < COUNT; i++) {
			alist.add(alist.size()/2, "element # " + i);
		}
		System.out.println("Add at index n/2: " + COUNT + " elements: ArrayList took " + (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			llist.add(llist.size()/2, "element # " + i);
		}
		System.out.println("Add at index n/2: " + COUNT + " elements: LinkedList took " + (System.currentTimeMillis() - start) + "ms");

		System.out.println();
		
		// Get --> ArrayList
		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			alist.get(i);
		}
		System.out.println("Get element at i: ArrayList took " + (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			llist.get(i);
		}
		System.out.println("Get element at i: LinkedList took " + (System.currentTimeMillis() - start) + "ms");

		System.out.println();
		
		// Set --> ArrayList
		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			alist.set(i, "modified element # " + i);
		}
		System.out.println("Update element at i: ArrayList took " + (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			llist.set(i, "modified element # " + i);
		}
		System.out.println("Update element at i: LinkedList took " + (System.currentTimeMillis() - start) + "ms");

		
		System.out.println();
		
		// Remove at index: 0(LinkedList)
		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			alist.remove(0);
		}
		System.out.println("Remove element at i 0: ArrayList took " + (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			llist.remove(0);
		}
		System.out.println("Remove element at i 0: LinkedList took " + (System.currentTimeMillis() - start) + "ms");
	}

}