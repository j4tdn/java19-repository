package service;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.dto.ItemGroupDto;
import persistence.entities.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private static ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}

	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public ItemGroup get(int id) {
		return itemGroupDao.get(id);
	}
	
	@Override
	public ItemGroup get(String name) {
		return itemGroupDao.get(name);
	}
	
	@Override
	public List<ItemGroupDto> countItemsByItemGroup() {
		return itemGroupDao.countItemsByItemGroup();
	}
	
	@Override
	public void save(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "Item group should be not null !");
		itemGroupDao.save(itemGroup);
	}
	
	@Override
	public void merge(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "Item group should be not null !");
		itemGroupDao.merge(itemGroup);
	}
	
	@Override
	public void save(Collection<ItemGroup> itemGroups) {
		Objects.requireNonNull(itemGroups, "ItemGroups group should be not null !");
		itemGroupDao.save(itemGroups);
	}

}
