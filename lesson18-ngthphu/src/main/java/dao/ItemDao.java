package dao;


import java.time.LocalDateTime;
import java.util.List;

import dto.ItemDto;
import persistence.Item;

public interface ItemDao {

	List<ItemDto> getAllByItemGroupId();
	
	Item getItem(LocalDateTime createAt);

}
