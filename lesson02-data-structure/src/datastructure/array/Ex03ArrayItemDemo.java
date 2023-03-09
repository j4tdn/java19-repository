package datastructure.array;

import java.util.Arrays;

import datastructure.object.custom.Item;

public class Ex03ArrayItemDemo {

	public static void main(String[] args) {
		// tìm nhanh 1 class trong Eclipse:
		//Ctrl + Shift + T
		
		
		Item[] items = fetchItems();
		Item[] filteredItems = filter(items);
		System.out.println(Arrays.toString(filteredItems));
	
		//Viết chương trính, hàm tìm những mặt hàng có giá > 300
		//input:	items
		//			price > 300
		//output:	Item[] --> price > 300
	}
	private static Item[] filter(Item[] items) {
		//khi không biết mảng có chính xác bao nhiêu phần tử 
		//--> nghĩ đến số lượng phần tử tối đa có thể lưu 
		Item[] result = new Item[items.length];
		int running = 0;
		
		for (int i = 0; i < items.length; i++) {
			Item currentItem = items[i];
			if (currentItem.price > 300) {
				result[running++] = currentItem;
			}
			
		}
	/*
	Item[] finalResult = new Item[running];
	for (int i = 0; i < running; i++) {
		finalResult[i] = result[i]
	}
	*/
	Item[] finalResult = Arrays.copyOfRange(result, 0, running);
			
	return finalResult;
	}
	
	private static Item[] fetchItems() {
		return new Item[] {
				new Item (1, 'A', 253f ),
				new Item (2, 'B', 123f ),
				new Item (3, 'C', 888f ),
				new Item (4, 'D', 462f ),
				new Item (5, 'E', 513f ),
				new Item (6, 'F', 236f ),
				new Item (7, 'G', 420f ),
		};
		
	}
}
