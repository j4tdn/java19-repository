package view;

import service.ItemService;
import service.ItemServiceImpl;
import static utils.CollectionUtils.*;

import java.time.LocalDate;



public class Ex03ItemView {
	
	private static ItemService itemservice;
	
	static {
		itemservice = new  ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		generate("1F. Liệt kê các mặt hàng", itemservice.getAll());
		generate("1H. Liệt kê các mặt hàng được bán trong ngày 07.09.2023", itemservice.getITemsWithSalesDate(LocalDate.of(2023, 9, 7)));
		generate("3. Liệt kê các mặt hàng có số lượng nhiều nhất trong mỗi loại hàng", itemservice.getItemDetails());
		itemservice.updateItemDetails();
	}
}
