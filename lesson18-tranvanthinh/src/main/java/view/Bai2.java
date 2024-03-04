package view;

import static utils.CollectionUtils.generate;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class Bai2 {
	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		generate("Câu 2: Thống kê số lượng mặt hàng đang tồn kho của mỗi loại hàng.", itemGroupService.thongke());

	}
}
