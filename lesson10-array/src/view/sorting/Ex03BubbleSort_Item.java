package view.sorting;

import java.util.Arrays;

import Utils.ArrayUtils;
import bean.Item;

public class Ex03BubbleSort_Item {
public static void main(String[] args) {
	Item[] items = mockData();
	bubbleSortBySalePriceAsc(items);

}
private static void bubbleSortBySalePriceAsc(Item[] items) {
	for(int i = 0; i < items.length; i++) {
		for(int j = 0; j < items.length - i -1; j++) {
			if(items[j].getSalesPrice() > items[j + 1].getSalesPrice()) {
				ArrayUtils.swap(items, j, j + 1);
			}
		}
	}
	ArrayUtils.printf("item sorted by salesPrice(ASC)", items);
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
