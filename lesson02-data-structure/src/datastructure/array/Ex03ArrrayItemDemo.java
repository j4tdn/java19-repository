package datastructure.array;

import java.util.Arrays;

import datastructure.object.custom.Item;

public class Ex03ArrrayItemDemo {
	public static void main(String[] args) {
		Item [] items = fetchItems();
		
		// viết ct, hàm tìm những mặt hàng có giá trị >300
		//input : item
		// --> condition : item's price >300
		// output : item [] --> price >300
		Item [] filteredItems = filter(items);
		System.out.println("items--->"+Arrays.toString(filteredItems));
	}
	private static Item[] filter(Item[] items) {
		Item[] result = new Item [items.length];
		int running =0;
		for (int i = 0; i < result.length; i++) {
			Item crrentItem = items[i];
			if (crrentItem.price>300) {
				result[running++] = crrentItem;
			}
		}
		// copy non-null elements vào final result
		// running : số lượng phần tử != null trong result
		// *Item[] final result = new Item [running];
		for (int i = 0; i < result.length; i++) {
			Item[] finalResult = null;
			finalResult[i] = result[i];
		}
		return null;
	}
	
	
	
	
	private static Item [] fetchItems() {
		return new Item[] {
			new Item (1,'A',253f),	
			new Item (2,'B',122f),
			new Item (3,'C',888f),
			new Item (4,'D',462f),
			new Item (5,'E',513f),
			new Item (6,'F',236f),
			new Item (7,'G',420f),
		};
	}
}
