package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.dto.ItemDto;
import persistence.dto.ItemStatisticDto;
import persistence.entities.Item;

public interface ItemDao {
	List<Item> getAll();
	
	List<ItemDto> getItemsBySalesDate(LocalDate salesDate);
	
	List<ItemStatisticDto> getItemsForStatistic();
	
	List<String> getThreeBestSellerItems(int year);
}
