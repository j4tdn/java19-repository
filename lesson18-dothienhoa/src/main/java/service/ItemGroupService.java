package service;

import java.util.List;

import persistence.dto.ItemByDate;
import persistence.dto.ItemCount;
import persistence.entities.Item;
import persistence.entities.ItemGroup;

public interface ItemGroupService {

	List<ItemGroup> getAll();

	List<ItemCount> getCountItemByItemGroup();

	List<ItemByDate> getItemByDate(String date);
	
	List<ItemByDate> getTopThreeItem(String year);

	List<Item> getAllItemByItemGroup();

}
