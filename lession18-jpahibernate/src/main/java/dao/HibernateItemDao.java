package dao;

import java.util.List;

import persistence.entities.Item;

public class HibernateItemDao extends BaseHibernateDao implements ItemDao {
	private static final String Q_GET_ALL_ITEMS = ""
			+ "SELECT * FROM item";
	
	@Override
	public List<Item> getAll() {
		return openSession().createNativeQuery(Q_GET_ALL_ITEMS, getEntitiesClass())
				.getResultList();
	}
	
	private Class<Item> getEntitiesClass(){
		return Item.class;
	}
}
