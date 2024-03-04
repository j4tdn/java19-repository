package view;

import service.ItemService;
import service.ItemServiceImpl;
import utils.SqlUtils;

public class Item_View {
	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		
		SqlUtils.generate(
				"Câu 1: Liệt kê các mặt hàng được bán trong ngày bất kỳ. Với ngày bán là tham số truyền vào.",
				itemService.getItemByCreateTime("2023,3,3")
		);
		SqlUtils.generate(
				"Câu 4: Liệt kê danh sách các mặt hàng của mỗi loại hàng",
				itemService.getItem()
		);
		
	}
	
	
}
