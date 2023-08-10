package view.list;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import static java.util.Comparator.*;

import bean.Item;

public class Ex05ArrayList_CustomType {
	public static void main(String[] args) {
		List<Item> items = mockData();
		
		Item itemToBeRemove = new Item(2);
		
		/*
			Object o = itemToBeRemove;
			for (; i < size; i++)
			if (o.equals(es[i])) --> Object#equals --> compare this == obj (address)
			break found;
		*/
		
		// Duyệt từng phần tử trong items, xem có phần tử ‘equals' với itemToBeRemoved
		// nếu có phần tử 'equals' --> remove phần tử đó khỏi items

		// Duyệt từng phần tử trong items, xem có phần tử có 'id' trùng với id của itemToBeRemoved
		// nếu có phần tử 'equals' --> remove phần tử đó khỏi items
		
		items.remove(itemToBeRemove);
		items. forEach(System.out::println) ;
		items.remove(itemToBeRemove);
		items.forEach(System.out::println);
		// contains --> iterate element by element, if has element ‘equals’ with checkedElement --> return true
		// OVERRIDE EQUALS METHOD
		
		items.forEach(System.out::println) ;

		System.out.println("\n Test contains(item 2) --> " + items.contains(itemToBeRemove));
		System.out.println("\n Test Sorting StoreId ASC, SalesPrice DESC ... \n");
		// item -> item.getStoreId() <==> Itpm::getStoreId

		items.sort(comparing(Item::getStoreId).thenComparing(Item::getSalesPrice, reverseOrder()));

		items. forEach(System.out::println) ;
		
		
	}

	private static List<Item> mockData() {
		List<Item> items = new ArrayList<>();

		items.add(new Item(1, "Item A1", bd(228), 101));
		items.add(new Item(2, "Item A2", bd(712), 102));
		items.add(new Item(3, "Item A3", bd(555), 102));
		items.add(new Item(4, "Item A4", bd(430), 101));
		items.add(new Item(5, "Item A5", bd(980), 102));
		items.add(new Item(6, "Item A6", bd(102), 101));

		return items;
	}

	private static BigDecimal bd(double val) {
		return BigDecimal.valueOf(val);
	}

}
