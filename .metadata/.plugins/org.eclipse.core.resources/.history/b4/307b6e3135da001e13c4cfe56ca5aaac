package view;

import static utils.CollectionUtils.generate;

import java.time.LocalDate;

import service.ItemService;
import service.ItemServiceImpl;

public class Bai3 {
	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2023, 9, 7);
		generate("Câu 3: Liệt kê top 3 mặt hàng được bán nhiều nhất năm bất kỳ.", itemService.bai3(date));

	}
}
