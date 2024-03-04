package dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;

import persistence.dto.ItemGroupDto;
import persistence.entities.ItemGroup;

public class HibernateItemGroupDao extends BaseHibernateDao implements ItemGroupDao {
	
	// native query: viết query ở ngôn ngữ mysql/oracle
	
	// jpql/hql: viết query ở dạng/theo tên của entities/attribute
	//         : jpq/hibernate tự chuyển đổi sang native db mà mình đang kết nối đến
	//
	
	// name query: native/jpql/hql
	// thay vì truyền native/jpql/hql vào
	// khai báo cho sql nớ 1 cái name --> truyền name vào là xong
	// khai báo ở chỗ Entity 
	
//	private static final String Q_GET_ALL_ITEM_GROUPS = ""
//			+ "SELECT * FROM item_group";
	
//	private static final String Q_GET_ALL_ITEM_GROUPS = ""
//			+ "FROM ItemGroup";
	
	private static final String Q_GET_ITEM_GROUP_BY_NAME = ""
			+ "SELECT * FROM item_group WHERE NAME = :pName";
	
	
//  --> native query	
//	@Override
//	public List<ItemGroup> getAll() {
//		// Từng dòng trả về từ SQL sẽ được mapping vào entity
//		// Muốn map được, entity phải mapping với columns của sql result
//		return openSession()
//					.createNativeQuery(Q_GET_ALL_ITEM_GROUPS, ItemGroup.class)
//					.getResultList();
//	}

//  jpql/hql	
//	@Override
//	public List<ItemGroup> getAll() {
//		return openSession()
//					.createQuery(Q_GET_ALL_ITEM_GROUPS, ItemGroup.class)
//					.getResultList();
//	}
	
	@Override
	public List<ItemGroup> getAll() {
		return openSession()
					.createNamedQuery(ItemGroup.Q_GET_ALL, ItemGroup.class)
					.getResultList();
	}
	
	@Override
	public ItemGroup get(int id) {
		// hỗ trợ khi entity instance theo id
		// truy vấn theo thuộc tính bất kỳ thì phải tự viết query, truyền tham số
		return openSession().get(ItemGroup.class, id);
	}
	
	@Override
	public ItemGroup get(String name) {
		return openSession().createNativeQuery(Q_GET_ITEM_GROUP_BY_NAME, getEntityClass())
					.setParameter("pName", name, StringType.INSTANCE)
					.uniqueResult(); // null if not found
					// .getSingleResult(); javax.persistence.NoResultException: No entity found for query
	}
	
	@Override
	public void save(ItemGroup itemGroup) {
		executeWithTransaction(session -> session.save(itemGroup));
	}
	
	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		executeWithTransaction(session -> session.saveOrUpdate(itemGroup));
	}
	
	private static final String Q_COUNT_ITEMS_BY_ITEM_GROUP = ""
			+ "SELECT itg.ID " + ItemGroupDto.PROP_IG_ID + ",\n"
			+ "	   	  itg.NAME " + ItemGroupDto.PROP_IG_NAME + ",\n"
			+ "       sum(itd.AMOUNT) " + ItemGroupDto.PROP_TOTAL_OF_ITEMS + ",\n"
			+ "	      group_concat(concat(it.ID, '-', it.NAME, '-', itd.SIZE_ID, '-', itd.AMOUNT) SEPARATOR ', ') " + ItemGroupDto.PROP_ITEMS + "\n"
			+ "FROM item_group itg\n"
			+ "JOIN item it\n"
			+ "  ON itg.ID = it.ITEM_GROUP_ID\n"
			+ "JOIN item_detail itd\n"
			+ "  ON itd.ITEM_ID = it.ID\n"
			+ "GROUP BY itg.ID, itg.NAME";
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ItemGroupDto> countItemsByItemGroup() {
		return openSession().createNativeQuery(Q_COUNT_ITEMS_BY_ITEM_GROUP)
				.addScalar(ItemGroupDto.PROP_IG_ID, IntegerType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_IG_NAME, StringType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_TOTAL_OF_ITEMS, LongType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_ITEMS, StringType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class))
				.getResultList();
	} 
	
	private Class<ItemGroup> getEntityClass() {
		return ItemGroup.class;
	}
}