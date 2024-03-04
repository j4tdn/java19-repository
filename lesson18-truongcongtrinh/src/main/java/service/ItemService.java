package service;

import java.time.LocalDate;
import java.util.List;

import persistence.dto.ItemDto;
import persistence.dto.ItemStatisticDto;
import persistence.entities.Item;
import persistence.entities.ItemGroup;

public interface ItemService {
	List<Item> getAll();
	
	List<ItemDto> getItemsBySalesDate(LocalDate salesDate);
	
	List<ItemStatisticDto> getItemForStatistic();
	
	List<String> getThreeBestSellerItems(int year);
	
	void save(ItemGroup itemGroup);
}
