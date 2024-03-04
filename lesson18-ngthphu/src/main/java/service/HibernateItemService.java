package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import dto.ItemDto;

public class HibernateItemService implements ItemService {

	private ItemDao itemDao;

	public HibernateItemService() {
		itemDao = new HibernateItemDao();
	}

	public List<ItemDto> getAllByItemGroupId() {
		// TODO Auto-generated method stub
		return itemDao.getAllByItemGroupId();
	}

}
