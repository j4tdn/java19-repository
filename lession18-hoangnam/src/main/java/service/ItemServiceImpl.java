package service;

import java.util.List;

import dao.ItemDao;

public class ItemServiceImpl implements ItemService {

	private ItemDao itemDao = new ItemDao();

	@Override
	public List<Object[]> getItemsStock() {
		return itemDao.getItemsStock();
	}
}
