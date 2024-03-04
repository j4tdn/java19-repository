package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.dto.ItemByDate;
import persistence.dto.ItemCount;
import persistence.entities.Item;
import persistence.entities.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService {

	private ItemGroupDao itemGroupDao;

	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}

	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}

	@Override
	public List<ItemCount> getCountItemByItemGroup() {
		return itemGroupDao.getCountItemByItemGroup();
	}

	@Override
	public List<ItemByDate> getItemByDate(String date) {
		return itemGroupDao.getItemByDate(date);
	}

	@Override
	public List<Item> getAllItemByItemGroup() {
		// TODO Auto-generated method stub
		return itemGroupDao.getAllItemByItemGroup();
	}

	@Override
	public List<ItemByDate> getTopThreeItem(String year) {
		return null;
	}

}
