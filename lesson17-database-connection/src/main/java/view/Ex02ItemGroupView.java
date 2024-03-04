package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import static utils.CollectionUtils.*;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import persistence.Item;
import persistence.ItemGroup;

public class Ex02ItemGroupView {
	
private static ItemGroupService itemGroupService;
	
static {
	itemGroupService = new ItemGroupServiceImpl();
}
	
	
	
public static void main(String[] args) {
	var itemGroupToBeTested = new ItemGroup(15, "Loại hàng 2023 - cập nhật");
	//itemGroupService.saveOrUpdate(itemGroupToBeTested);
	itemGroupService.merge(itemGroupToBeTested);
	
	var itemGroupsToBeSaved1 = new ItemGroup(16, "Loại hàng 16");
	var itemGroupsToBeSaved2 = new ItemGroup(17, "Loại hàng 17");
	//var groupsToBeSaved = List.of(itemGroupsToBeSaved1, itemGroupsToBeSaved2);
	//itemGroupService.save(groupsToBeSaved);
	
	// Kiểm tra xem ID '16' đã tồn tại trong cơ sở dữ liệu trước khi lưu trữ
	ItemGroup existingItemGroup16 = itemGroupService.get(16);
	if (existingItemGroup16 == null) {
	    // Nếu ID '16' chưa tồn tại, thì lưu trữ bản ghi mới
	    itemGroupService.save(itemGroupsToBeSaved1);
	} else {
	    // Nếu ID '16' đã tồn tại, thì cập nhật bản ghi hiện tại
	    existingItemGroup16.setName("Loại hàng 16");
	    itemGroupService.saveOrUpdate(existingItemGroup16);
	}

	// Tương tự, bạn có thể làm tương tự cho ID '17'
	ItemGroup existingItemGroup17 = itemGroupService.get(17);
	if (existingItemGroup17 == null) {
	    itemGroupService.save(itemGroupsToBeSaved2);
	} else {
	    existingItemGroup17.setName("Loại hàng 17");
	    itemGroupService.saveOrUpdate(existingItemGroup17);
	}


	generate("Câu 1A: liệt kê tất cả các loại hàng", itemGroupService.getAll()); 
	generate("Câu 1B: liệt kê tất cả các loại hàng có mã loại bằng 2", itemGroupService.get(2)); 
	generate("Câu 1E: Liệt kê loại hàng có tên loại bằng 'Thắt lưng'", itemGroupService.get("Thắt lưng"));
	generate("Câu 2:  Đếm số lượng các mặt hàng theo từng loại hàng", itemGroupService.countItemByItemGroup()); 
	System.out.println("Câu 1G: Liệt kê tất cả các loại hàng(Loại hàng, Danh sách mặt hàng)"); 
			itemGroupService.getItemGroupWithItems().forEach(group -> {
				String itemNames = group.getItems()
						.stream().map(Item::getName)
						.collect(Collectors.joining(", "));
				System.out.println(group + " -> " + itemNames);
			});
}
}
