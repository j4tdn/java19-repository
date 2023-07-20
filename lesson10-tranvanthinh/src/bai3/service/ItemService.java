package bai3.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import bai3.model.Item;

public class ItemService {
	public static int[] getAllStoreId(Item[] items) {
		Set<Integer> storeIdsSet = new HashSet<>();
		for(Item item: items) {
			storeIdsSet.add(item.getStoreId());
		}
		
		int index = 0;
		int[] storeIds = new int[storeIdsSet.size()];
		for(int storeId: storeIdsSet) {
			storeIds[index++] = storeId;
		}
		return storeIds;
	}
	
	public static Item[] getMaxSalesPriceByStoreId(Item[] items) {
		int[] storeIds =  getAllStoreId(items);
		int index = 0;
		Item[] rsItem = new Item[storeIds.length];
		for(int storeId: getAllStoreId(items)) {
			int maxSalesPriceByStoreId = Integer.MIN_VALUE;
			for(Item item: items) {
				if(item.getStoreId() == storeId) {
					if(maxSalesPriceByStoreId <= item.getSalesPrice()) {
						maxSalesPriceByStoreId = item.getSalesPrice();
						rsItem[index] = item;
					}
				}
			}
			index++;
		}
		return rsItem;
	}
}
