package datastructure.arrays;

import java.util.Arrays;

import datastructure.object.custom.Item;

public class Ex03ArrayItemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item[] items = fetchItems();
		//vIẾT chương trình hàm tìm những mặt hàng có giá > 30
		//input: items
		//--> condition: item's 
		Item[] fitterItems = fitter(items);
		System.out.println("finalResult-->" + Arrays.toString(fitterItems));

	}
	private static Item[] fitter(Item[] items) {
		//khi ko pk mảng lưu chính xác mấy phần tử
		//--> nghĩ đến số lượng phần tử tối đa có thể lưu
		
		Item[] result = new Item[items.length];
		int count = 0;
		for (int i = 0; i < items.length; i++) {
			Item currentItem = items[i];
			if(currentItem.price > 30);
			result[count] = currentItem;
			count++;
		}
		//copy non-null elements vào final result
		//count : số lượng phần tử != null trong result
		//C1:
//		Item[] finalResult = new Item[count];
//		for (int i = 0; i < count; i++) {
//			finalResult[i] =result[i];
//		}
//		return finalResult;
		
		Item[] finalResult = Arrays.copyOfRange(result, 0, count);
		return finalResult;
	}
	private static Item[] fetchItems() {
		return new Item[] {
				new Item(1, 'A', 10f),
				new Item(2, 'B', 20f),
				new Item(3, 'C', 30f),
				new Item(4, 'D', 40f),
				new Item(5, 'E', 50f),
				new Item(6, 'F', 60f),
				new Item(7, 'G', 70f),
		};
		
	}

}
