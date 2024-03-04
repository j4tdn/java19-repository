package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import persistence.dto.ItemDetailDto;

public interface ItemDao {
	List<Item> getAll();
	
	List<Item> getItemBySalesDate(LocalDate date);
	
	List<ItemDetailDto> getITemDetails();
	
	
	// using transaction
	void updateItemDetails();
}
