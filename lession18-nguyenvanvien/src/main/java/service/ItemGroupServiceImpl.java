package service;

import java.util.List;

import dao.HibernateItemGroupImpl;
import dao.ItemGroupDao;
import persistence.dto.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupImpl();
	}
	
	@Override
	public List<ItemGroupDto> countAmountOfItems() {
		// TODO Auto-generated method stub
		return itemGroupDao.countAmountOfItems();
	}
}
