package model;

import bean.ItemDetail;

public class DataModel {
	private DataModel() {

	}

	public static ItemDetail[] getItemDetails() {
		return new ItemDetail[] { new ItemDetail(1, "A", 25, 101), new ItemDetail(2, "B", 90, 102),
				new ItemDetail(3, "C", 88, 102), new ItemDetail(4, "D", 40, 101), new ItemDetail(5, "E", 60, 102),
				new ItemDetail(6, "F", 18, 101) };

	}
}
