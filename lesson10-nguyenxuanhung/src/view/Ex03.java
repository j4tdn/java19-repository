package view;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import model.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = mockData();
		System.out.println(Arrays.toString(getItemMaxSalePricesOfEachStore(items)));
	}
	
	private static Item[] mockData() {
		return new Item[]{
				new Item(1, "A", 25, 101),
				new Item(2, "B", 90, 102),
				new Item(3, "C", 88, 102),
				new Item(4, "D", 40, 101),
				new Item(5, "E", 60, 102),
				new Item(6, "F", 18, 101),
			};
	}
	
	private static int[] getAllStoreId(Item[] items) {
		Set<Integer> storeIds = new HashSet<Integer>();
		for(Item item: items) {
			storeIds.add(item.getStoreId());
		}
		
		int[] result = new int[storeIds.size()];
		int index = 0;
		for(Integer id: storeIds) {
			result[index++] = id;
		}
		return result;
	}
	
	private static Item[] getItemMaxSalePricesOfEachStore(Item[] items) {
		int [] storeIds = getAllStoreId(items);
		Item[] result = new Item[storeIds.length];
		
		int index = 0;
		for(int storeId : storeIds) {
			int maxPriceSale = Integer.MIN_VALUE;
			for(Item item: items) {
				if(item.getStoreId() == storeId) {
					if(maxPriceSale < item.getSalesPrice()) {
						maxPriceSale = item.getSalesPrice();
						result[index] = item;
					}
				}
			}
			index++;
		}
		return result;
		
	}
}
