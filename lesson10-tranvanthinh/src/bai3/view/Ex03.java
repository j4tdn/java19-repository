package bai3.view;

import bai3.model.Item;
import bai3.service.ItemService;
import bai3.storage.ItemStorage;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = ItemStorage.getAllItem();
		Item[] maxSalesPriceItemByIds = ItemService.getMaxSalesPriceByStoreId(items);
		for(Item item : maxSalesPriceItemByIds) {
			System.out.println(item);
		}
		
		
		
		
		
		
		
	}
}
