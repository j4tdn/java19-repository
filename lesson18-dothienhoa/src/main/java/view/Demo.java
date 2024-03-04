package view;

import static utils.CollectionUtils.generate;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class Demo {

	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupServiceImpl();
	}

	public static void main(String[] args) {

		generate("Câu 1: Liệt kê các mặt hàng được bán trong ngày bất kỳ.",
				itemGroupService.getItemByDate("15/02/2023"));

		generate("Câu 2: Thống kê số lượng mặt hàng đang tồn kho của mỗi loại hàng",
				itemGroupService.getCountItemByItemGroup());
		
		generate("Câu 3: 3. Liệt kê top 3 mặt hàng được bán nhiều nhất năm bất kỳ.",
				itemGroupService.getTopThreeItem("2023"));

		generate("Câu 4: Liệt kê danh sách các mặt hàng của mỗi loại hàng hàng",
				itemGroupService.getAllItemByItemGroup());

	}

}
