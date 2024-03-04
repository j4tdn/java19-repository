package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import dto.ItemGroupDto;

public class HibernateItemGroupService implements ItemGroupService {
	private ItemGroupDao itemGroupDao;

	public HibernateItemGroupService() {
		itemGroupDao = new HibernateItemGroupDao();
	}

	public List<ItemGroupDto> getItemStock() {
		// TODO Auto-generated method stub
		return itemGroupDao.getItemStock();
	}
}
