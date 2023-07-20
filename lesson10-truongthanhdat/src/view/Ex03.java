package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Item;

public class Ex03 {
	public static void main(String[] args) {
		List<Item> items = initData();
		
		Map<Integer, Item> item = findItemByPrice(items);
		for (Map.Entry<Integer, Item> entry : item.entrySet()) {
            System.out.println("Cửa hàng " + entry.getKey() + 
            		": Mặt hàng có giá bán cao nhất = " + entry.getValue().getName() + 
            		", Giá của mặt hàng = " + entry.getValue().getSalesPrice() );
        }
	}
	
	public static Map<Integer, Item> findItemByPrice(List<Item> items) {
        Map<Integer, Item> itemResult = new HashMap<>();

        for (Item item : items) {
            int storeId = item.getStoreId();
            double salesPrice = item.getSalesPrice();
        
            if (itemResult.containsKey(storeId)) {
                Item itemTemp = itemResult.get(storeId);
                if (salesPrice > itemTemp.getSalesPrice()) {
                	itemResult.put(storeId, item);
                }
            } else {
            	itemResult.put(storeId, item);
            }
        }
            
        return itemResult;
    }
	
	
	private static List<Item> initData() {
		List<Item> items = new ArrayList<>();
		items.add(new Item(1, "A", 25,101));
		items.add(new Item(2, "B", 90,102));
		items.add(new Item(3, "C", 88,102));
		items.add(new Item(4, "D", 40,101));
		items.add(new Item(5, "E", 60,102));
		items.add(new Item(6, "F", 18,101));

		return items;
	}
}
