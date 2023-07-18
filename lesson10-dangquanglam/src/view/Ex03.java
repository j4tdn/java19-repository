package view;

import java.util.Arrays;

import bean.ItemDetail;
import model.DataModel;

public class Ex03 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();
		Arrays.sort(items, (i1, i2) -> ((i2.getSalesPrice() - i1.getSalesPrice())));
		System.out.println(Arrays.toString(items));
		
		int currentStoreId = -1;
		for (ItemDetail item : items) {
			if (item.getStoreId() != currentStoreId) {
				System.out.println(item);
				currentStoreId = item.getStoreId();
			}
		}
	}
}
