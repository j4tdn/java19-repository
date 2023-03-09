package datastructure.array;

import java.util.Arrays;

import datastructure.object.custom.Item;

public class Ex03ArrayItemDemo {
	public static void main(String[] args) {
		//viet ham tim nhung mat hang co gia > 300
		Item[] items = fetchItems();
		System.out.println(Arrays.toString(filter(items)));
	}
	private static Item[] fetchItems() {
		return new Item[] {
				new Item(1, 'A', 123f),
				new Item(2, 'B', 224f),
				new Item(3, 'C', 325f),
				new Item(4, 'D', 526f),
				new Item(5, 'E', 127f),
				new Item(6, 'F', 428f),
				new Item(7, 'G', 329f)
				
		};
	}
	private static Item[] filter(Item[] items) {
		Item[] result = new Item[items.length];
		int running = 0;
		for(int i = 0; i < items.length; i++) {
			if(items[i].price > 300) {
				result[running] = items[i];
				running++;
			}
		}
		
//		Item[] finalResult = new Item[running];
//		for(int i = 0; i < running; i++) {
//			finalResult[i] = result[i];
//		}
		return Arrays.copyOfRange(result, 0, running);
	}
}
