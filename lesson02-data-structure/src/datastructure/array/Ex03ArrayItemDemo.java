package datastructure.array;

import java.util.Arrays;

import datastructure.object.custom.Item;

public class Ex03ArrayItemDemo {
	public static void main(String[] args) {
		//tìm kiếm nhanh 1 class trong Eclipse --> ctrl shift t(type)
		Item[] items = fetchItems();
		
		
		//viet chương trình, hàm tìm những mặt hàng có giá > 300
		//input : items
		// --> condition: item's price > 300
		
		//output: Item[] --> price > 300
		Item[] filterItems = filter(items);
		System.out.println("result -->" + Arrays.toString(filterItems));
	}
	private static Item[] filter(Item[] items) {
		//khi không biết mảng lưu chính xác bao nhiêu phần tử
		// --> nghĩ đến số lượng phần tử tối đa có thể lưu
		
		
		Item[] result = new Item[items.length];
		int running = 0;
		
		for(int i = 0 ; i < items.length; i++) {
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
			new Item(1,'A',253f),
			new Item(2,'B',456f),
			new Item(3,'A',253f),
			new Item(4,'A',753f),
			new Item(5,'A',253f),
			new Item(6,'A',253f),
			new Item(7,'A',253f)
		};
	}
}
