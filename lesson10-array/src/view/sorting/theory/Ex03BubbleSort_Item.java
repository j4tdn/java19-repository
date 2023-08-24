package view.sorting.theory;

import java.util.Arrays;

import bean.Item;
import functional.IntComparator;
import utils.ArrayUtils;

public class Ex03BubbleSort_Item {
	public static void main(String[] args) {
		Item[] items = mockData();

		bubbleSortBySalasPriceAsc(items);
		ArrayUtils.printf(items);
	}
	
	public static void bubbleSortBySalasPriceAsc(Item[] items) {
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				if (items[j].getSalesPrice() > items[j + 1].getSalesPrice()) {
					ArrayUtils.swap(items, j, j+1);
				}
			}
		}
	}
	
	public static void bubbleSortBySalasPriceAsc(Item[] items, IntComparator comparator) {
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				if (items[j].getSalesPrice() > items[j + 1].getSalesPrice()) {
					ArrayUtils.swap(items, j, j+1);
				}
			}
		}
	}
	
	
	public static Item[] mockData() {
		return new Item[] { new Item(1, "item 1", 224, 101), new Item(2, "item 2", 324, 101),
				new Item(3, "item 3", 4534, 102), new Item(4, "item 4", 346, 103), new Item(5, "item 5", 765, 103),
				new Item(6, "item 6", 457, 104), new Item(7, "item 7", 654, 105), new Item(8, "item 8", 967, 105) };
	}
}
