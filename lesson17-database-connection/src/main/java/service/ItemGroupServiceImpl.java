package service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
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
	private ItemGroupDao itemgroupDao;
	private ItemDao itemDao;
	
	
	public ItemGroupServiceImpl() {
		itemgroupDao = new JdbcItemGroupDao();
		itemDao = new JdbcItemDao();
	}
	@Override
	public List<ItemGroup> getAll(){
	return itemgroupDao.getAll();
	
	}
	
	@Override
	public List<ItemGroup> getItemGroupWithItems() {
		List<Item> items = itemDao.getAll(); 
		Map<ItemGroup, List<Item>> itemGroupItemMap = items.stream().collect(Collectors.groupingBy(Item::getGroup));
		
		return itemGroupItemMap.entrySet()
					.stream()
					.map(e -> {
						ItemGroup itemGroup = e.getKey();
						itemGroup.setItems(e.getValue());
						return itemGroup;
					})
					.collect(Collectors.toList());
		
			
	}
	
	@Override
	public List<ItemGroupDto> countItemByItemGroup() {
		return itemgroupDao.countItemByItemGroup();
	}
	
	
	@Override
	public ItemGroup get(int id) {
		return itemgroupDao.get(id);
	}
	
	@Override
	public ItemGroup get(String name) {
		Objects.requireNonNull(name , "itemGroup should not be null");
		return itemgroupDao.get(name);
	}
	
	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "itemGroup should not be null");
		Optional.ofNullable(get(itemGroup.getId())).ifPresentOrElse(val -> update(itemGroup), () -> save(itemGroup));
	}
	
	
	@Override
	public void save(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "itemGroup should not be null");
		itemgroupDao.save(itemGroup);
	}
	
	@Override
	public void save(Collection<ItemGroup> groups) {
		Objects.requireNonNull(groups);
		if(!groups.isEmpty()) {
			itemgroupDao.save(groups);
		}
	}
	
	@Override
	public void update(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "itemGroup should not be null");
		itemgroupDao.update(itemGroup);
	}
	
	@Override
	public void merge(ItemGroup itemgroup) {
		Objects.requireNonNull(itemgroup, "itemGroup should not be null");
		itemgroupDao.merge(itemgroup);
	}
}
