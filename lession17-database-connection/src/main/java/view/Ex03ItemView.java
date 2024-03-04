package view;

import service.ItemService;
import service.ItemServiceImpl;

import static utils.CollectionUtils.*;

import java.time.LocalDate;
import java.util.Date;

public class Ex03ItemView {
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		generate("Cau 1F: Liệt kê các mặt hàng(MatHang, LoaiHang) --> hasA", itemService.getAll());
		generate("Cau 1H: Liệt kê các mặt hàng(MatHang) được bán trong ngày bất kì", itemService.getItemBySaleDate(LocalDate.of(2023, 9, 7)));
	
		itemService.updateItemDetail();
	}
}
