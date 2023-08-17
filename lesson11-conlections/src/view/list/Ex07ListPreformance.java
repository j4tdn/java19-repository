package view.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex07ListPreformance {
	 private static int COUNT = 50000;

	public static void main(String[] args) {
		List<String> alist = new ArrayList<>();
        List<String> llist = new LinkedList<>();

        // Add to the end --> 
        long start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            alist.add("element # " + i);
        }
        System.out.println("Add " + COUNT + " elements to the end: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            llist.add("element # " + i);
        }
        System.out.println("Add " + COUNT + " elements to the end: LikedList took "
                + (System.currentTimeMillis() - start) + "ms");

        System.out.println();
        
        // Add at index: n/2 5000
        for (int i = 0; i < COUNT; i++) {
            alist.add(alist.size()/2, "element # " + i);
        }
        System.out.println("Add at index 5000: " + COUNT
                + " elements: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            llist.add(llist.size()/2, "element # " + i);
        }
        System.out.println("Add at index 5000: " + COUNT
                + " elements: LinkedList took "
                + (System.currentTimeMillis() - start) + "ms");
        
        System.out.println();
        
        // Get
        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            alist.get(i);
        }
        System.out.println("Get element: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            llist.get(i);
        }
        System.out.println("Get element: LinkedList took "
                + (System.currentTimeMillis() - start) + "ms");

        System.out.println();
        
        // Set
        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            alist.set(i, "modified element # " + i);
        }
        System.out.println("Update element at i: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            llist.set(i, "modified element # " + i);
        }
        System.out.println("Update element at i: LinkedList took "
                + (System.currentTimeMillis() - start) + "ms");

        System.out.println();
        // Remove
        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            alist.remove(0);
        }
        System.out.println("Remove element at i = 0: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            llist.remove(0);
        }
        System.out.println("Remove element at i = 0: LinkedList took "
                + (System.currentTimeMillis() - start) + "ms");
    }

}
