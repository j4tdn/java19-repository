package datastructure.array;

import java.util.Arrays;

import datastructure.object.custom.Item;

public class Ex03ArrayItemDemo {
	public static void main(String[] args) {
		// Search 1 class in Eclipse --> ctrl shift t(type)
		
		Item[] items = fetchItems();
		// Write program, method search goods have price > 300
		
		Item[] filteredItems = filter(items);
		System.out.println("items --> " + Arrays.toString(filteredItems));
		
	}
	
	private static Item[] filter(Item[] items) {
		Item[] result = new Item[items.length];
		int running = 0;
		
		for (int i = 0; i < items.length; i++) {
			Item currentItem = items[i];
			if(currentItem.price > 300) {
				result[running++] = currentItem;
			}
		}
		
		Item[] finalResult = Arrays.copyOfRange(result, 0, running);
		return finalResult;
	}
	
	private static Item[] fetchItems() {
		return new Item[] {
				new Item(1, 'A', 253f),
				new Item(2, 'B', 778f),
				new Item(3, 'C', 233f),
				new Item(4, 'D', 243f),
				new Item(5, 'E', 474f),
				new Item(6, 'F', 103f),
				new Item(7, 'G', 668f),
		};
	}
	
}
