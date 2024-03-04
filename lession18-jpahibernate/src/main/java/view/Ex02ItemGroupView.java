package view;

import java.util.Collection;
import java.util.List;

import persistence.entities.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class Ex02ItemGroupView {

	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupServiceImpl();
	}

	public static void main(String[] args) {
//		selfGenerate("Câu 1E: Liệt kê các Loại hàng", itemGroupService.getAll());
//		generate("Cau 1B: Liệt kê mặt hàng theo mã", itemGroupService.get(1));
//		generate("Cau 1E: Liệt kê mặt hàng theo tên", itemGroupService.get("Thắt lưng"));

//		generate("count ", itemGroupService.countItemsByItemGroup());

//		ItemGroup itemGroupNew = new ItemGroup(20, "Loại hàng 20 - 23/02/2024");
//		itemGroupService.save(itemGroupNew);
//		System.out.println("After saving ...");
		
		
		var groups = List.of(
					new ItemGroup(22, null),
					new ItemGroup(23, "Loại hàng 23")
				);
		
		itemGroupService.save(groups);
	}

	public static void selfGenerate(String prefix, Collection<ItemGroup> items) {
		System.out.println(prefix + " --> {");
		items.forEach(e -> {
			System.out.println("     " + e);
			System.out.println("     -- item -->  " + e.getItems().size() + "\n");
		});

		System.out.println("}");
	}
}
