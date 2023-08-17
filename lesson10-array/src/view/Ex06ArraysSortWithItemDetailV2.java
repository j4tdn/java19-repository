package view;

import java.util.Arrays;
import static java.util.Comparator.*;

import bean.ItemDetail;
import model.DataModel;

public class Ex06ArraysSortWithItemDetailV2 {

	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();

//		Arrays.sort(items, new Comparator<ItemDetail>() {
//
//			@Override
//			public int compare(ItemDetail o1, ItemDetail o2) {
//				return o1.getStoreId() - o2.getStoreId();
//			}
//		});
//		System.out.println(Arrays.toString(items));

		// xắp sếp theo StoreId ASC
		Arrays.sort(items, (i1, i2) -> (i1.getStoreId() - i2.getStoreId()));
		System.out.println(Arrays.toString(items));

//		itemDetail -> itemDetail.getPrice() ==> ItemDetail::getPrice
//		Comparator<ItemDetail> comparator = Comparator.comparing(itemDetail -> itemDetail.getPrice());
//		
//		//xắp sếp theo getPrice ASC
//		Arrays.sort(items, comparator);
//		System.out.println(Arrays.toString(items));

		// xắp sếp theo storeId DESC, itemId ASC
//		Arrays.sort(items,
//				nullsFirst(comparing(ItemDetail::getStoreId, reverseOrder()).thenComparing(ItemDetail::getItemId)));
//
//		System.out.println(Arrays.toString(items));

	}

}
