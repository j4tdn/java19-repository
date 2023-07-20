package view.sorting;

import Utils.ArrayUtils;
import bean.Item;

public class Ex03BubbleSort_Item {
public static void main(String[] args) {
	Item[] items = mockData();
	
	
}
private static void bubbleSortBySalePriceAsc(Item[] item) {
	for(int i = 0; i < item.length; i++) {
		for(int j = 0; j < item.length - i -1; j++) {
			if(item[j].getSalesPrice() > item[j + 1].getSalesPrice()) {
				ArrayUtils.swap(item, j, j + 1);
			}
		}
	}
}

private static Item[] mockData() {
	return new Item[] {
			new Item(1, "Item 1", 224, 101),
			new Item(2, "Item 2", 280, 102),
			new Item(3, "Item 3", 290, 112),
			new Item(4, "Item 4", 340, 105),
			new Item(5, "Item 5", 300, 140),
			new Item(6, "Item 6", 360, 120),
			new Item(7, "Item 7", 370, 106),
			new Item(8, "Item 8", 260, 109),
	};
}
}
