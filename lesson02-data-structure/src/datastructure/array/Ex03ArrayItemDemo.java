package datastructure.array;

import java.util.Arrays;

import datastructure.obiect.custom.Item;

public class Ex03ArrayItemDemo {
	public static void main(String[] args) {
		//tìm kiếm nhanh 1 class trong Eclipse --> ctrl shift t(type)
		Item[] items = fetchItems();
		
		
		//viết chương trình, hàm tìm những mặt hàng có giá > 300
		//input: items
		//--> condition: item's price > 300
		
		//output: Item[] --> price > 300
		Item[] filteredItems = filter(items);
		System.out.println("items --> " + Arrays.toString(filteredItems));
	}
	
	private static Item[] filter(Item[] items) {
		//khi không biết mảng lưu chính xác mấy phần tử
		//--> nghĩ đến số lượng phần tử tối đa có thể lưu
		Item[] result = new Item[items.length];
		int running = 0;
		
		for (int i = 0; i < items.length; i++) {
			Item currentItem = items[i];
			if (currentItem.price > 300) {
				result[running++] = currentItem;
			}
		}
		Item[] finaResult = Arrays.copyOfRange(result, 0, running);
		return finaResult;
	}
	
	private static Item[] fetchItems() {
		return new Item[] {
				new Item(1, 'A', 253f),
				new Item(2, 'B', 213f),
				new Item(3, 'C', 546f),
				new Item(4, 'D', 462f),
				new Item(5, 'E', 651f),
		};
	}

}
