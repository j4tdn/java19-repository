package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Item;

public class Ex04ObjectDataManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Item> items = getItems();
		Item itemX = new Item(1, "Item1", 100, 1);
		// contains, remove
		boolean isExits = items.contains(itemX);
		items.remove(itemX);

		System.out.println("isExits: " + isExits);
		System.out.println("size: " + items.size());

	}

	private static List<Item> getItems() {
		
//		Item item1 = new Item(1, "Item1", 100, 1);
//		Item item2 = new Item(2, "Item2", 200, 2);
//		Item item3 = new Item(3, "Item3", 300, 3);
//		Item item4 = new Item(4, "Item4", 400, 4);
//		return Arrays.asList(item1, item2, item3, item4);

		List<Item> itemList = new ArrayList<>();
		Item item1 = new Item(1, "Item1", 100, 1);
		Item item2 = new Item(2, "Item2", 200, 2);
		Item item3 = new Item(3, "Item3", 300, 3);
		Item item4 = new Item(4, "Item4", 400, 4);
		itemList.add(item1);
		itemList.add(item2);
		itemList.add(item3);
		itemList.add(item4);
		return itemList;

	}

}
