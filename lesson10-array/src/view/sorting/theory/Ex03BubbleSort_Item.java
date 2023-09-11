package view.sorting.theory;

import bean.Item;
import functional.ItemComparator;
import utils.ArrayUtils;

public class Ex03BubbleSort_Item {

	public static void main(String[] args) {

		Item[] items = mockData();

		// sắp xếp mảng đối tượng theo thuộc tính

		// so sánh: so sánh thuộc tính của đối tượng
		// hoán vị: hoán vị vị trí của đối tượng trong mảng

		// demo bubble sort with array of items
		// sorting by which properties, order(asc/desc) ?

		// e.g 1: salesPrice(asc)
		// bubbleSortBySalesPriceAsc(items);
		bubbleSort(items, (i1, i2) -> {
			if (i1.getSalesPrice() > i2.getSalesPrice()) {
				return true;
			}
			return false;
		});
		ArrayUtils.printf("eg1 --> item sorted by salesPrice(ASC)", items);

		// e.g 2: salesPrice(desc)
		// bubbleSortBySalesPriceDesc(items);
		bubbleSort(items, (i1, i2) -> {
			return i1.getSalesPrice() < i2.getSalesPrice();
		});
		ArrayUtils.printf("eg2 --> item sorted by salesPrice(DESC)", items);
		
		// e.g 3: itemName(desc)
		// bubbleSortByItemNameDesc(items);
		bubbleSort(items, (i1, i2) -> {
			if (i1.getName().compareTo(i2.getName()) < 0) {
				return true;
			}
			return false;
		});
		ArrayUtils.printf("eg3 --> item sorted by itemName(DESC)", items);
		
		// e.g 4: storeId(asc)
		// bubbleSortByStoreIdAsc(items);
		bubbleSort(items, (i1, i2) -> {
			return i1.getStoreId() > i2.getStoreId();
		});
		ArrayUtils.printf("eg4 --> item sorted by storeId(ASC)", items);
		
		// e.g 5: storeId(asc), salesPrice(desc)
		// bubbleSortByStoreIdAscSalesPriceDesc(items);
		
		// e.g 5: storeId(desc), salesPrice(asc)
		bubbleSort(items, (i1, i2) -> {
			if (i1.getStoreId() != i2.getStoreId()) {
				return i1.getStoreId() < i2.getStoreId();
			}
			return i1.getSalesPrice() > i2.getSalesPrice();
		});
		ArrayUtils.printf("eg5 --> item sorted by storeId(DESC), salesPrice(ASC)", items);
		
		// e.g 6: storeId(asc), salesPrice(desc), itemId(asc)
		// bubbleSortByStoreIdAscSalesPriceDescItemIdAsc(items);
		bubbleSort(items, (i1, i2) -> {
			if (i1.getStoreId() != i2.getStoreId()) {
				return i1.getStoreId() > i2.getStoreId();
			}
			if (i1.getSalesPrice() != i2.getSalesPrice()) {
				return i1.getSalesPrice() < i2.getSalesPrice();
			}
			return i1.getItemId() > i2.getItemId();
		});
		ArrayUtils.printf("eg6 --> item sorted by storeId(ASC), salesPrice(DESC), itemId(ASC)", items);
	}
	
	// boolean strategy(Item i1, Item i2)
	/*
	 
	 if (items[j].getSalesPrice() > items[j + 1].getSalesPrice())
	 
	 if (items[j].getSalesPrice() < items[j + 1].getSalesPrice())
	 
	 if (items[j].getName().compareTo(items[j + 1].getName()) < 0)
	 
	 if (items[j].getStoreId() > items[j+1].getStoreId()) {
		} else if (items[j].getStoreId() == items[j+1].getStoreId()) {
			if (items[j].getSalesPrice() < items[j+1].getSalesPrice()) {
			}
		}
	 
	 if (items[j].getStoreId() > items[j+1].getStoreId()) {
	 } else if (items[j].getStoreId() == items[j+1].getStoreId()) {
	 	if (items[j].getSalesPrice() < items[j+1].getSalesPrice()) {
	 	} else if (items[j].getSalesPrice() == items[j+1].getSalesPrice()) {
			if (items[j].getItemId() > items[j+1].getItemId()) {
			}
		}
	}
	*/
	
	public static void bubbleSort(Item[] items, ItemComparator comparator) {
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				// nếu kết quả so sánh của item j, j+1 trả về true ==> hoán vị
				if (comparator.compare(items[j], items[j+1])) {
					ArrayUtils.swap(items, j, j + 1);
				}
			}
		}
	}

	public static void bubbleSortBySalesPriceAsc(Item[] items) {
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				if (items[j].getSalesPrice() > items[j + 1].getSalesPrice()) {
					ArrayUtils.swap(items, j, j + 1);
				}
			}
		}
	}
	
	public static void bubbleSortBySalesPriceDesc(Item[] items) {
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				if (items[j].getSalesPrice() < items[j + 1].getSalesPrice()) {
					ArrayUtils.swap(items, j, j + 1);
				}
			}
		}
	}
	
	public static void bubbleSortByItemNameDesc(Item[] items) {
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				if (items[j].getName().compareTo(items[j + 1].getName()) < 0) {
					ArrayUtils.swap(items, j, j + 1);
				}
			}
		}
	}
	
	public static void bubbleSortByStoreIdAsc(Item[] items) {
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				if (items[j].getStoreId() > items[j+1].getStoreId()) {
					ArrayUtils.swap(items, j, j + 1);
				}
			}
		}
	}
	
	public static void bubbleSortByStoreIdAscSalesPriceDesc(Item[] items) {
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				if (items[j].getStoreId() > items[j+1].getStoreId()) {
					ArrayUtils.swap(items, j, j + 1);
				} else if (items[j].getStoreId() == items[j+1].getStoreId()) {
					if (items[j].getSalesPrice() < items[j+1].getSalesPrice()) {
						ArrayUtils.swap(items, j, j + 1);
					}
				}
			}
		}
	}
	
	// Tìm điều kiện(thuộc tính sắp xếp và tăng/giảm dần) để hoán vị 2 phần tử kề nhau
	public static void bubbleSortByStoreIdAscSalesPriceDescItemIdAsc(Item[] items) {
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				boolean condition = false;
				if (items[j].getStoreId() > items[j+1].getStoreId()) {
					condition = true;
				} else if (items[j].getStoreId() == items[j+1].getStoreId()) {
					if (items[j].getSalesPrice() < items[j+1].getSalesPrice()) {
						condition = true;
					} else if (items[j].getSalesPrice() == items[j+1].getSalesPrice()) {
						if (items[j].getItemId() > items[j+1].getItemId()) {
							condition = true;
						}
					}
				}
				if (condition) {
					ArrayUtils.swap(items, j, j+1);
				}
			}
		}
	}

	
	
	
	public static Item[] mockData() {
		return new Item[] { 
				new Item(1,  "Item 1",  224, 101),
				new Item(2,  "Item 2",  280, 101),
				new Item(3,  "Item 3",  776, 103), 
				new Item(4,  "Item 4",  224, 103), 
				new Item(5,  "Item 5",  280, 104),
				new Item(6,  "Item 6",  224, 201), 
				new Item(7,  "Item 7",  110, 101), 
				new Item(8,  "Item 8",  518, 102),
				new Item(9,  "Item 9",  280, 101),
				new Item(10, "Item 10", 712, 201),
				new Item(11, "Item 11", 224, 201),
				new Item(12, "Item 12", 278, 201),
		};
	}
}