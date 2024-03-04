package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import dao.HibenateItemDao;
import dao.HibernateItemGroupDao;
import dao.ItemDao;
import dao.ItemGroupDao;
import persistence.dto.ItemByDateDto;
import persistence.entities.Item;
import persistence.entities.ItemGroup;

public class ItemServiceImpl implements ItemService {

	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibenateItemDao();
	}
	
	@Override
	public List<ItemByDateDto> getItemsByDate(LocalDate localDate) {
		return itemDao.getItemByDate(localDate);
	}

	@Override
	public List<String> bai3(String year) {
		// TODO Auto-generated method stub
		return itemDao.bai3(year);
	}

}
