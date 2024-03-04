package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.SqlUtils;

public class ItemGroup_View {
	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		SqlUtils.generate(
				"Câu 2: Thống kê số lượng mặt hàng đang tồn kho của mỗi loại hàng",
				itemGroupService.getItemGroupDetails()
		);
	}
}
