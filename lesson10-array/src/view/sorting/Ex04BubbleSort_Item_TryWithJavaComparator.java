package view.sorting;

import java.util.Comparator;

import bean.Item;
import functional.ItemComparator;
import utils.ArrayUtils;

public class Ex04BubbleSort_Item_TryWithJavaComparator {

	public static void main(String[] args) {

		Item[] items = mockData();

		// e.g 1: salesPrice(asc)
		bubbleSort(items, (i1, i2) -> {
			if (i1.getSalesPrice() > i2.getSalesPrice()) {
				return 1; // > 0 ==> hoán vị 
			}
			// negative || zero
			return -1;
		});
		ArrayUtils.printf("eg1 --> item sorted by salesPrice(ASC)", items);

		// e.g 2: salesPrice(desc)
		bubbleSort(items, (i1, i2) -> {
			 if (i1.getSalesPrice() < i2.getSalesPrice()) {
			 	return 1;
			 }
			 // negative || zero
			 return -1;
		});
		ArrayUtils.printf("eg2 --> item sorted by salesPrice(DESC)", items);
		
		// e.g 3: itemName(asc)
		bubbleSort(items, (i1, i2) -> {
			// i1Name >  i2Name return >  0 ==> hv    ==> asc
			// i1Name <= i2Name return <= 0 ==> ko hv
			return i1.getName().compareTo(i2.getName());
		});
		ArrayUtils.printf("eg4 --> item sorted by itemName(ASC)", items);
		
		// e.g 4: itemName(desc)
		bubbleSort(items, (i1, i2) -> {
			// i1Name <  i2Name return >  0 ==> hv  ==> desc
			// i1Name >= i2Name return >= 0 ==> ko hv
			return i1.getName().compareTo(i2.getName()) * (-1);
		});
		ArrayUtils.printf("eg4 --> item sorted by itemName(DESC)", items);
	}
	
	/*
	 Integer(int) --> boxing, unboxing, autobox --> JDK 1.5
	 Ý tường: 
	 Sắp xếp là tìm cách để hoán vị lại vị trí của các phần tử tăng/giảm dần theo 1 điều kiện(yêu cầu)
	 Thực tế KDL dùng trong dự án thường sẽ làm KDL đối tượng
	 + Integer, Double, String
	 + Item, Employee, Store
	 --> So sánh các đối tượng thường sẽ dùng hàm compareTo có trong interface Comparable<T>
	     để so sánh 2 đối tượng nếu (true, false)boolean --> isEquals
	     muốn so sánh 2 đối tượng > < --> (negative, zero, postive)int --> is less, equal, greater
	 
	 --> int strategy(Item i1, Item i2)
	     < 0 --> i1 < i2
	     = 0 --> i1 = i2
	     > 0 --> i1 > i2
	     <=> theo thuộc tính gì trong đối tượng là do yêu cầu
	 
	 boolean strategy(Item i1, Item i2)
	 
	 Xử lý workaroud cho kiểu nguyên thủy
	 VD: if (items[j].getSalesPrice() > items[j + 1].getSalesPrice())     return true
	   : if (items[j].getSalesPrice() - items[j + 1].getSalesPrice() > 0) return true
	 
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
	
	public static void bubbleSort(Item[] items, Comparator<Item> comparator) {
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				// nếu kết quả so sánh item j và j+1 > 0 ==> hoán vị
				if (comparator.compare(items[j], items[j+1]) > 0) {
					ArrayUtils.swap(items, j, j + 1);
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