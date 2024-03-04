package service;

import java.time.LocalDate;
import java.util.List;

import dao.ItemDao;
import dao.JdbcItemDao;
import persistence.Item;
import persistence.dto.ItemDetailDto;

public class ItemServiceImpl implements ItemService{

	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new JdbcItemDao(); 
		
	}
	
	@Override
	public List<Item> getAll() {
		return itemDao.getAll();
	}
	
	@Override
	public List<Item> getITemsWithSalesDate(LocalDate date) {
		if(date == null) {
			return List.of();
		}
		return itemDao.getItemBySalesDate(date);
	}
	
	@Override
	public List<ItemDetailDto> getItemDetails() {
		return itemDao.getITemDetails();
	}
	
	@Override
	public void updateItemDetails() {
		itemDao.updateItemDetails();
	}
}
