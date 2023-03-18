package datastructure.array;

import java.util.Arrays;

import datastructure.object.custom.Item;

public class Ex03ArrayItemDemo {
public static void main(String[] args) {
	// tìm kiếm nhanh 1 class trong Esclispe -> ctrl shift t
	// BT: tìm price > 300 trong mảng
	Item[] Items = fetchItems();
	System.out.println(Arrays.toString(Items));
}

private static Item[] fetchItems() {
	return new Item[] {

		new Item(1, 'A', 253f),
		new Item(2, 'B', 122f),
		new Item(3, 'C', 888f),
		new Item(4, 'D', 462f),
		new Item(5, 'E', 513f),
		new Item(6, 'F', 236f),
		new Item(7, 'G', 420f)
	};
}
private static Item[] fliter(Item[] items) {
	// Khi không biết chính xác mảng có mấy phần tử
	// Nghĩ đến số phần tử tối đa có thể lưu
	Item[] result = new Item[items.length];
	int running = 0;
	for (int i = 0; i < items.length; i++) {
		Item currentItem = items[i];
		if (currentItem.price > 300) {
			result[running++] = currentItem;
		}
	}
	Item[] finalResult = Arrays.copyOfRange(result, 0, running);
	return finalResult;
}
}

