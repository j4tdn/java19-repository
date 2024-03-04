package dao;


import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.type.StringType;

import persistence.entities.ItemGroup;

public class HibernateItemGroupDao extends BaseHibernateDao implements ItemGroupDao {

	
	private static final String Q_GET_ITEM_GROUP_BY_NAME = ""
			+ "SELECT * FROM item_group WHERE NAME = :pName";
	
	@Override
	public List<ItemGroup> getAll() {
		return openSession()
					.createNamedQuery(ItemGroup.Q_GET_ALL, ItemGroup.class)
					.getResultList();
	}
	
	@Override
	public ItemGroup get(int id) {
		return openSession().get(ItemGroup.class, id);
	}
	
	@Override
	public ItemGroup get(String name) {
		return openSession().createNativeQuery(Q_GET_ITEM_GROUP_BY_NAME, getEntityClass())
					.setParameter("pName", name, StringType.INSTANCE)
					.uniqueResult(); 
	}
	
	private Class<ItemGroup> getEntityClass() {
		return ItemGroup.class;
	}
	
}
