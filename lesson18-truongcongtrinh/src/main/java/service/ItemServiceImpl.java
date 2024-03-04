package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import dao.HibenateItemDao;
import dao.HibernateItemGroupDao;
import dao.ItemDao;
import dao.ItemGroupDao;
import persistence.dto.ItemDto;
import persistence.dto.ItemStatisticDto;
import persistence.entities.Item;
import persistence.entities.ItemGroup;

public class ItemServiceImpl implements ItemService {

	private ItemDao itemDao;
	private ItemGroupDao itemGroupDao;
	
	public ItemServiceImpl() {
		itemDao = new HibenateItemDao();
		itemGroupDao = new HibernateItemGroupDao();
	}
	
	@Override
	public List<Item> getAll() {
		return itemDao.getAll();
	}

	@Override
	public void save(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "item group should not be null");
	}

	@Override
	public List<ItemDto> getItemsBySalesDate(LocalDate salesDate) {
		return itemDao.getItemsBySalesDate(salesDate);
	}

	@Override
	public List<ItemStatisticDto> getItemForStatistic() {
		return itemDao.getItemsForStatistic();
	}
	
	public List<String> getThreeBestSellerItems(int year) {
		return itemDao.getThreeBestSellerItems(year);
	}

}
