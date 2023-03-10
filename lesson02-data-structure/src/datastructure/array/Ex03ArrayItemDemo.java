package datastructure.array;

import java.util.logging.Filter;

import datastructure.object.custom.Item;

public class Ex03ArrayItemDemo {
     public static void main(String[] args) {
    	//find item having price > 300
 		//input: items
 		//process: price > 300
 		//output: array item[] having price > 300
    	Item[] output = Filter(fetchItems());
 		System.out.println("item having price > 300: \n" + Arrays.toString(output));

	}
     private static Item[] filter(Item[] items) {
 		//when don't know exactly the quantity of elements
 		//--> thinking about max length
 		Item[] result = new Item[items.length];
 		int running = 0;
 		
 		for (int i = 0; i < result.length; i++) {
 			if (items[i].price > 300) {
 				result[running++] = items[i];
			i++
 			}
 		}	
     
     private static Item[] fetchItems() {
    	 return new Item[] {
 				new Item(1, 'A', 255f),
 				new Item(2, 'B', 122f),
 				new Item(3, 'C', 888f),
 				new Item(4, 'D', 462f),
 				new Item(5, 'E', 513f),
 				new Item(6, 'F', 236f),
 				new Item(7, 'G', 420f)
     }
     

    	 
     }
}
