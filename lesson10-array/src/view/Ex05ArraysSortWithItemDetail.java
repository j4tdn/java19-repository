package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ItemDetail;
import model.DataModel;

public class Ex05ArraysSortWithItemDetail {

	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();
		
		Arrays.sort(items, new Comparator<ItemDetail>() {

			@Override
			public int compare(ItemDetail o1, ItemDetail o2) {
				return o1.getStoreId() - o2.getStoreId();
			}
		});
		System.out.println(Arrays.toString(items));

	}

}
