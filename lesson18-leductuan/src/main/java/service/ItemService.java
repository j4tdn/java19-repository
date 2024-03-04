package service;

import java.time.LocalDate;
import java.util.List;

import dto.ItemDetailDto;
import persistence.Item;

public interface ItemService {
	
	List<ItemDetailDto> getItemByCreateTime(String date);
	
	List<Item> getItem();
}
