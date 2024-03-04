package service;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import persistence.dto.ItemDetailDto;

public interface ItemService {

	List<Item> getAll();
	
	List<Item> getITemsWithSalesDate(LocalDate date);
	
	List<ItemDetailDto> getItemDetails();
	
	void updateItemDetails();
}
