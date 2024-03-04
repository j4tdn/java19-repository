package view;

import java.time.LocalDate;
import java.util.Collection;

import persistence.entities.Item;
import service.ItemService;
import service.ItemServiceImpl;
import static utils.CollectionUtils.*;
public class ExamView {
	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
		generate("1. Liệt kê các mặt hàng được bán trong ngày bất kỳ.", itemService.getItemsBySalesDate(LocalDate.of(2023,7,7)));
		generate("2. Thống kê số lượng mặt hàng đang tồn kho của mỗi loại hàng.", itemService.getItemForStatistic());
		generate("3. Liệt kê top 3 mặt hàng được bán nhiều nhất năm bất kỳ.", itemService.getThreeBestSellerItems(2023));
	}
}
