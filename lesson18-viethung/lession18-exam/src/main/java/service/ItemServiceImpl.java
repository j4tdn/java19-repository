package service;

import java.time.LocalDateTime;
import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.dto.ItemDto;
import persistence.entities.Item;

public class ItemServiceImpl implements ItemService {

	private ItemDao itemDao;

	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}

	@Override
	public List<ItemDto> getItemByDate(LocalDateTime lDateTime) {
		return itemDao.getItemByDate(lDateTime);
	}

	@Override
	public List<String> topThreeItemBestSeller() {
		return itemDao.topThreeItemBestSeller();
	}

	@Override
	public List<Item> getAll() {
		return itemDao.getAll();
	}

}
