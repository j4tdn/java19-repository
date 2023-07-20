package view;

import java.util.Arrays;

import functional.NumbersCondition;
import models.Item;
import utils.ArrayUtils;

public class Ex03 {
	public static void main(String[] args) {
		for(int i: getDistinctStoreId(EnterDB()))
			System.out.println(Arrays.toString(getItemsMaxPrice(getArrayItemByStoreId(EnterDB(), i))));
	}
	
	private static Item[] getArrayItemByStoreId(Item[] items,int value) {
		return getItem(items,1,value, (a,b)->{
			return a==b;
		});
	}
	
	private static int[] getDistinctStoreId(Item[] items) {
		int running = 0;
		int[] arrStoreId = new int[items.length];
		for(int i =0; i< items.length;i++) {
			if(!ArrayUtils.checkDuplicate(arrStoreId, items[i].getStoreId()))
				arrStoreId[running++] = items[i].getStoreId();
		}
		return Arrays.copyOfRange(arrStoreId, 0, running);
	}
	
	private static Item[] getItemsMaxPrice(Item[] items) {
		double maxPrice = items[0].getSalesPrice();
		for(Item item : items) {
			if(item.getSalesPrice() > maxPrice)
				maxPrice = item.getSalesPrice();
		}
		
		return getItem(items,2,maxPrice, (a,b)->{
			return a==b;
		});
	}
	
	private static Item[] getItem(Item[] items, int key,double value, NumbersCondition condition) {
		Item[] newItems = new Item[items.length];
		int running = 0;
		double valueItem;
		for(Item item : items) {
			if(key==1) valueItem = item.getStoreId();
			else valueItem = item.getSalesPrice();
			if(condition.check(value, valueItem))
				newItems[running++] = item;
		}
		return Arrays.copyOfRange(newItems, 0, running);
	}
	private static Item[] EnterDB() {
		Item[] itemArr = {
				new Item(1, "A", 25,101),
				new Item(2, "B", 90,102),
				new Item(3, "C", 88,102),
				new Item(4, "D", 40,101),
				new Item(5, "E", 70,102),
				new Item(6, "F", 18,101),
		};
		return itemArr;
	}
}
