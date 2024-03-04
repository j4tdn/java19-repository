package view;

import static utils.CollectionUtils.generate;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class ItemGroupView {
	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupServiceImpl();
	}

	public static void main(String[] args) {
		generate("Count Item of ItemGroup", itemGroupService.countAmountOfItems());
	}
}
