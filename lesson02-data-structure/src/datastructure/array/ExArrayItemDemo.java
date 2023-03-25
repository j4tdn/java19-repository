package datastructure.array;

import java.util.Arrays;

import datastructure.object.custom.Item;

public class ExArrayItemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tìm kiếm nhanh 1 class trong eclipse --> ctrl shift t
		Item[] items = fetchItems();
		
		// Viết chương trình, hàm tìm những mặt hàng có giá > 300
		// input: items
		// --> condition: item's price > 300
		
		// out: Item[] --> price > 300
		Item[] filteredItems = filter(items);
		System.out.println("items --> " + Arrays.toString(filter(filteredItems)));
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
		
		return Arrays.copyOfRange(result, 0, running);
	}
	
	private static Item[] fetchItems() {
		return new Item[] {
			new Item(1, 'a', 11f),
			new Item(2, 'b', 1321f),
			new Item(3, 'c', 110f),
			new Item(4, 'd', 439f)
		};
	}
}
