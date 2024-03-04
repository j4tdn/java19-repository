package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

import static utils.CollectionUtils.*;

import java.util.stream.Collectors;

import persistence.Item;

public class Ex02ItemGroupView {
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		generate("Câu 1E: Liệt kê các mặt hàng", itemGroupService.getAll());
		generate("Cau 1B: Liệt kê mặt hàng theo mã", itemGroupService.getItemById(1));
		generate("Cau 1E: Liệt kê mặt hàng theo tên", itemGroupService.get("Thắt lưng"));
		generate("Cau 1G: Liệt kê tất cả các loại hàng(LoaiHang, Danh Sach MatHang) [theo danh sách MaLH] --> hasN", itemGroupService.getItemGroupWithItems());
		
		
		itemGroupService.getItemGroupWithItems()
		.forEach(
				group -> {
					String itemNames = group.getItems()
							.stream()
							.map(Item::getName)
							.collect(Collectors.joining(", "));
					System.out.println(group + " --> " + itemNames);
				}
				);
		
		generate("Cau 2: ", itemGroupService.countItemsByItemGroup());
	}
}
