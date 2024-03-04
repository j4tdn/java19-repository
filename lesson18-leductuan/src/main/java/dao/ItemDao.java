package dao;

import java.util.List;

import dto.ItemDetailDto;
import persistence.Item;

public interface ItemDao {
	List<Item> getItem();
	
	List<ItemDetailDto> getItemByCreateTime(String date);

}
