package view.a.list;

import java.math.BigDecimal;
import java.util.ArrayList;

import java.util.List;

import bean.Item;

import static java.util.Comparator.*;

public class Ex05ArrayList_CustomType {
	
	public static void main(String[] args) {
		List<Item> items = mockData();
		
		// ALL methods such as(add, addAll, get, set) are similar to SOT
		// We need to know internal build of contains(Object), remove(Object) method
		
		// sorting --> which property spends for sort --> Comparable/Comparator
		
		// remove  --> remove if exist item in list equals with item to be removed
		//         --> equals: default compare object address
		//         --> which property defines 2 objects are equals
		//             OVERRIDE EQUALS METHOD
		
		// contains --> iterate element by element, if has element 'equals' with checkedElement --> return true
		//              OVERRIDE EQUALS METHOD
		
		Item itemToBeRemoved = new Item(2); // H99
		
		/*
		 
		 Object o = itemToBeRemove;
		 
		 for (; i < size; i++)
            if (o.equals(es[i])) --> Object#equals --> compare this == obj (address)
                break found;
		 
		 */
		
		// duyá»‡t tá»«ng pháº§n tá»­ trong items, xem cÃ³ pháº§n tá»­ nÃ o 'equals' vá»›i itemToBeRemoved
		// náº¿u cÃ³ pháº§n tá»­ 'equals' --> remove pháº§n tá»­ Ä‘Ã³ khá»?i items
		
		// --> duyá»‡t tá»«ng pháº§n tá»­ trong items, xem cÃ³ pháº§n tá»­ nÃ o cÃ³ 'id' trÃ¹ng vá»›i id cá»§a itemToBeRemoved
		// náº¿u cÃ³ --> remove pháº§n tá»­ Ä‘Ã³ khá»?i items
		// items.remove(itemToBeRemoved);
		
		items.forEach(System.out::println);
		
		System.out.println("\n Test contains(item 2) --> " + items.contains(itemToBeRemoved));
		
		System.out.println("\n Test Sorting StoreId ASC, SalesPrice DESC ... \n");
		
		// item -> item.getStoreId() <==> Item::getStoreId
		
		items.sort(comparing(Item::getStoreId).thenComparing(Item::getSalesPrice, reverseOrder()));
		
		items.forEach(System.out::println);
	}
	
	private static List<Item> mockData() {
		// H0
		List<Item> items = new ArrayList<>();
		
		items.add(new Item(1, "Item A1", bd(228), 101)); // H1
		items.add(new Item(2, "Item A2", bd(712), 102)); // H2
		items.add(new Item(3, "Item A3", bd(555), 102)); // H3
		items.add(new Item(4, "Item A4", bd(430), 101)); // H4
		items.add(new Item(5, "Item A5", bd(980), 102)); // H5
		items.add(new Item(6, "Item A6", bd(102), 101)); // H6
		
		return items;
	}
	
	private static BigDecimal bd(double val) {
		return BigDecimal.valueOf(val);
	}
}