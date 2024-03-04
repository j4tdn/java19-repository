package dao;

import java.util.Collection;
import java.util.List;

import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public interface ItemGroupDao {
	List<ItemGroup> getAll();
	
	List<ItemGroupDto> countItemByItemGroup();
	
	ItemGroup get(int id);
	
	ItemGroup get(String name);
	
	void save(ItemGroup itemGroup);
	
	
	// Insert list of group to database
	// -> Using batch update(INSERT/UPDATE/DELETE)
	void save(Collection<ItemGroup> groups);
	
	
	
	// update itemGroup -> 	update group name by id 
	void update(ItemGroup itemGroup);
	
	void merge(ItemGroup itemGroup);
}
