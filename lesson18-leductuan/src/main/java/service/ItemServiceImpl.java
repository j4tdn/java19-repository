package service;

import java.time.LocalDate;
import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import dto.ItemDetailDto;
import persistence.Item;

public class ItemServiceImpl implements ItemService {
	private ItemDao itemDao;

	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}

	@Override
	public List<Item> getItem() {
		return itemDao.getItem();
	}

	@Override
	public List<ItemDetailDto> getItemByCreateTime(String date) {
		return itemDao.getItemByCreateTime(date);
	}

	


}
