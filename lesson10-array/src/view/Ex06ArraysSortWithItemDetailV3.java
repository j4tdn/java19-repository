package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ItemDetail;
import model.DataModel;

public class Ex06ArraysSortWithItemDetailV3 {
	public static void main(String[] args) {
	    ItemDetail[] items = DataModel.getItemDetails();
		//Comparable
		Arrays.sort(items);
		System.out.println("1st array sort:" +Arrays.toString(items));
		
		//Comparator
		Arrays.sort(items, new Comparator<ItemDetail>() {

			@Override
			public int compare(ItemDetail o1, ItemDetail o2) {
				return o2.getItemId() - o1.getItemId();
			}
		});
		System.out.println("2st array sort:" +Arrays.toString(items));
		//Ưu tiên dùng comparator
		//Giảm code ở class ItemDetail
		//Comparable không báo lỗi tại runtime ngược lại Comparator bắt lỗi tại compile
		//Comparator có thể tạo nhiều hàm sort theo nhiều giá trị còn Comparable chỉ sort theo 1 lần duy nhất
	}
}
