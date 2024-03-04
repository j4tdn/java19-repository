package view;

import java.util.List;

import dto.ItemDto;
import dto.ItemGroupDto;
import service.HibernateItemGroupService;
import service.HibernateItemService;
import service.ItemGroupService;
import service.ItemService;
import static utils.CollectionUtils.generate;

public class MainView {

	private static ItemGroupService itemGroupService;
	private static ItemService itemService;

	static {
		itemGroupService = new HibernateItemGroupService();
		itemService = new HibernateItemService();
	}

	public static void main(String[] args) {

		List<ItemGroupDto> Q2 = itemGroupService.getItemStock();
		generate("Số lượng mặt hàng đang tồn kho của mỗi loại hàng", Q2);

		List<ItemDto> Q4 = itemService.getAllByItemGroupId();
		generate("Danh sách các mặt hàng của mỗi loại hàng.", Q4);
		
	}

}
