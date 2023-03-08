package homedatastructure;

import java.util.Arrays;

import datastructure.object.custom.Item;

public class Ex04FilterObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item itemA = new Item(234, 'A', 220f);
		Item itemB = new Item(234, 'B', 22f);
		Item itemC = new Item(234, 'C', 300f);
		Item[] items = {itemA, itemB, itemC};
		Item[] itemresults = fitter(items);
//		System.out.println(Arrays.toString(fitter(items)));
		
		for(Item item: itemresults) {
			System.out.println(item);
		}

	}
	private static Item[] fitter(Item[] items) {
		Item[] result = new Item[items.length];
		int count = 0;
		
		for (Item item: items) {
			if(item.price > 200) {
				result[count] = item;
				count++;
			}
		}
		return Arrays.copyOfRange(result,0, count);
				
	}

}
