package service;

import java.util.List;

import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public interface ItemGroupService {
	List<ItemGroup> getAll();
	
	List<ItemGroup> getItemGroupWithItems();
	
	List<ItemGroupDto> countItemsByItemGroup();
	
	ItemGroup getItemById(int id);
	
	ItemGroup get(String name);
}
