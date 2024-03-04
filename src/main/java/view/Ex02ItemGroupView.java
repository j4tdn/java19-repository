package view;

import static utils.CollectionUtils.generate;

import java.time.LocalDate;
import java.util.List; 
import dao.ItemDao;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;
import service.OrderDetailService;
import service.OrderDetailServiceImpl;
import utils.CollectionUtils;
import utils.DateUtils;

public class Ex02ItemGroupView {

	private static OrderDetailService orderDetailService;
	private static ItemService itemService;

	static {
		orderDetailService = new OrderDetailServiceImpl();
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
		LocalDate queryDate = LocalDate.of(2023, 12, 25);
		java.sql.Date sqlQueryDate = DateUtils.toSqlDate(queryDate);

		generate("Câu 1: Liệt kê các mặt hàng bán trong ngày " + queryDate,
				orderDetailService.findOrderDetailsByDate(sqlQueryDate));
		CollectionUtils.generate("Câu 2: Thống kê số lượng mặt hàng đang tồn kho của mỗi loại hàng",
				itemService.getItemsStock());
		// 3.
		ItemDao itemDao = new ItemDao();
		int year = 2023;
		List<String> topSellingItems = itemDao.getTopSellingItems(year);

		System.out.println("Top 3 selling items in year " + year + ":");
		for (String itemName : topSellingItems) {
			System.out.println(itemName);
		}
	}

}
