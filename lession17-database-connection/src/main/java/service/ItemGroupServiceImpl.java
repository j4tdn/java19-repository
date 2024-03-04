package service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import dao.ItemDao;
import dao.ItemGroupDao;
import dao.JdbcItemDao;
import dao.JdbcItemGroupDao;
import persistence.Item;
import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService{

	private ItemGroupDao itemGroupDao;
	private ItemDao itemDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
		itemDao = new JdbcItemDao();
	}

	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public List<ItemGroup> getItemGroupWithItems() {
		List<Item> items = itemDao.getAll();
		Map<ItemGroup, List<Item>> itemGroupItemsMap=items.stream().collect(Collectors.groupingBy(Item::getGroup));
		return itemGroupItemsMap.entrySet()
		.stream()
		.map(
				e -> {
					ItemGroup itemGroup  = e.getKey();
					itemGroup.setItems(e.getValue());
					return itemGroup;
				})
		.collect(Collectors.toList());
	}

	@Override
	public ItemGroup getItemById(int id) {
		return itemGroupDao.get(id);
	}
	
	@Override
	public List<ItemGroupDto> countItemsByItemGroup() {
		return itemGroupDao.countItemsByItemGroup();
	}
	
	@Override
	public ItemGroup get(String name) {
		return itemGroupDao.get(name);
	}
}
