package datastruture.array;

import java.util.Arrays;

import datastructure.object.custom.Item;

public class Ex03ArrayItemDemo {
public static void main(String[] args) {
	//Tìm kiếm nhanh 1 class trong Esclipse -> ctrl shift t
	Item[] items = fetchItems(); 
	//Viết chương trình,hàm tìm kiếm những mặt hàng có giá > 300
	Item[] filteredItems = filter(items);
	System.out.println("items -> " + Arrays.toString(filteredItems));
}
private static Item[] filter(Item[] items) {
	//Khi không biết mảng lưu chính xác bao nhiêu phần tử 
	// -> Nghĩ đến số lượng phần tử tối đa có thể lưu 
	Item[] result = new Item[items.length];
	int running = 0;
	for(int i = 0; i < items.length; i++ ) {
		if(items[i].price > 300) {
			result[running++] = items[i];
		}
	}
	// copy non-null elements vào final result
	// running: số lượng phần tử != null trong result
//	Item[] finalResult = new Item[running];
//	for(int i = 0; i < running; i++) {
//		finalResult[i] = result[i];
//	}
//	return finalResult;
	Item[] finalResult =  Arrays.copyOfRange(result, 0, running);
	return finalResult;
} 
private static Item[] fetchItems() {
	return new Item[] {
			new Item(1, 'A', 253f),
			new Item(1, 'B', 122f),
			new Item(1, 'C', 888f),
			new Item(1, 'D', 462f),
			new Item(1, 'E', 513f),
			new Item(1, 'F', 236f),
			new Item(1, 'G', 420f)
	};
}
}
