package view;

import static utils.CollectionUtils.generate;

import java.time.LocalDate;

import service.ItemService;
import service.ItemServiceImpl;

public class Bai1 {
	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2023, 9, 7);
		generate("Câu 1: Liệt kê các mặt hàng được bán trong ngày bất kỳ.", itemService.getItemsByDate(date));

	}
}
