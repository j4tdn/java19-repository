package datastructure.array;

import java.util.Arrays;

import datastructure.object.custom.Item;

public class Ex03ArrayItemDemo {
	public static void main(String[] args) {
		// tìm một class trong eclipse crtl+shitf +t
		Item[] items = fetchItems();
		// Viết chương trình, hàm tìm những mặt hàng có giá >300
		// input: items

		Item[] filteredItems = filter(items);
		System.out.println("Mặt hàng có giá trên 300 là:" + Arrays.toString(filteredItems));

	}

	private static Item[] fetchItems() {
		return new Item[] { new Item(1, 'A', 253f), new Item(2, 'B', 122f), new Item(3, 'C', 888f),
				new Item(4, 'D', 567f), new Item(5, 'E', 287f), new Item(6, 'F', 298f), new Item(7, 'G', 355f) };
	}

	private static Item[] filter(Item[] items) {
		Item[] result = new Item[items.length];
		int running = 0;
		for (int i = 0; i < items.length; i++) {
			Item curentItem = items[i];
			if (curentItem.price > 300) {
				result[running++] = curentItem;
			}
		}
		Item[] finalResult = Arrays.copyOfRange(result, 0, running);
		return finalResult;

	}
}
