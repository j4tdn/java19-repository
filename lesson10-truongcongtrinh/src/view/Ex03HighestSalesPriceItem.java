package view;

import java.util.Arrays;
import java.util.Comparator;

class Item {
	private Integer itemId;
	private String name;
	private Integer salesPrice;
	private Integer storeId;

	public Item() {
	}

	public Item(Integer itemId, String name, Integer salesPrice, Integer storeId) {
		this.itemId = itemId;
		this.name = name;
		this.salesPrice = salesPrice;
		this.storeId = storeId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Integer salesPrice) {
		this.salesPrice = salesPrice;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", salesPrice=" + salesPrice + ", storeId=" + storeId
				+ "]\n";
	}

}

public class Ex03HighestSalesPriceItem {
	public static void main(String[] args) {
		Item[] items = {
				new Item(1, "A" ,25 ,101),
				new Item(2 ,"B" ,90 ,102),
				new Item(3 ,"C" ,88 ,102),
				new Item(4 ,"D" ,40 ,101),
				new Item(5 ,"E" ,60 ,102),
				new Item(6 ,"F" ,18 ,101),
		};
		
		System.out.println("Origin Items --> " + Arrays.toString(items));

		

		System.out.println("Sorted Items --> " + Arrays.toString(getHighestSalesPriceByStore(items)));

	}
	
	private static Item[] getHighestSalesPriceByStore(Item[] items) {

		Item[] highestRes = new Item[items.length];
		Arrays.sort(items, Comparator.comparing(Item::getStoreId).thenComparing(Item::getSalesPrice));
		System.out.println("Sorted Items --> " + Arrays.toString(items));

		int highestPrice = Integer.MIN_VALUE;
		int prevStoreId = items[0].getStoreId();
		int count = 0;

		for (Item item : items) {
			if (prevStoreId != item.getStoreId()) {
				prevStoreId = item.getStoreId();
				count++;
			} else {
				if (highestPrice < item.getSalesPrice()) {
					highestPrice = item.getSalesPrice();
					highestRes[count] = item;
				}
			}

		}
		return Arrays.copyOfRange(highestRes, 0, count + 1);
	}
}
