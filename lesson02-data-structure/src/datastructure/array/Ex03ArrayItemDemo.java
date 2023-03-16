package datastructure.array;

import java.util.Arrays;

import datastructure.object.Item;

public class Ex03ArrayItemDemo {
	public static void main(String[] args) {
		// Tìm kiếm nhanh 1 class trong Eclipse --> Ctrl shift T
		Item[] Items = fetchItems();
		// Viết chương trình, hàm tìm những mặt hàng có giá > 300
		System.out.println();
		System.out.println(Arrays.toString(Items));
	}
	private static Item[] filter(Item[] items) {
		Item[] result = new Item[items.length];
		int running = 0;
		
		for(int i = 0; i < items.length; i++) {
			Item currentItem = items[i];
			if(currentItem.price > 300) {
				result[running++] = currentItem;
			}
		}
		Item[] finalResult = new Item[running];
		finalResult = Arrays.copyOfRange(result, 0, running);
		return finalResult;
	}
	private static Item[] fetchItems() {
		return new Item[] {
				new Item(1, 'A', 122),
				new Item(2, 'B', 564),
				new Item(3, 'C', 874),
				new Item(4, 'D', 145),
				new Item(5, 'E', 320),
				new Item(6, 'F', 402),
		};
	}
}	
