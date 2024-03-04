package dao;

import java.util.List;

import persistence.dto.ItemByDate;
import persistence.dto.ItemCount;
import persistence.entities.Item;
import persistence.entities.ItemGroup;

public interface ItemGroupDao {
	List<ItemGroup> getAll();
	
	List<ItemCount> getCountItemByItemGroup();
	
	List<ItemByDate> getItemByDate(String date);
	
	List<Item> getAllItemByItemGroup();

}
