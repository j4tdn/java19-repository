package service;

import java.time.LocalDateTime;
import java.util.List;

import persistence.dto.ItemDto;
import persistence.entities.Item;

public interface ItemService {
	List<Item> getAll();
	List<ItemDto> getItemByDate(LocalDateTime lDateTime);
	List<String> topThreeItemBestSeller();
}
