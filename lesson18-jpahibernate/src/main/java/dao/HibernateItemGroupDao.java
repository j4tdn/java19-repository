package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.xml.transform.Transformer;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;

import persistence.dto.ItemGroupDto;
import persistence.entities.ItemGroup;

public class HibernateItemGroupDao extends BaseHibernateDao implements ItemGroupDao{
	
	private static final String Q_GET_ITEM_GROUP_BY_NAME = ""
			+ "SELECT * FROM item_group WHERE NAME = :pName";
	
//	private static final String Q_GET_ALL_ITEM_GROUP = "" 
//			+ "SELECT * FROM ITEM_GROUP ";
	
	// native query
//@Override
//public List<ItemGroup> getAll() {
//	// từng dòng trả về từ SQL sẽ được mapping vào entiry
//	// Muốn mapping được, entiry phải mapping với column của sql result
//	return openSession().createNativeQuery(Q_GET_ALL_ITEM_GROUP, ItemGroup.class).getResultList();
//}
	
	// jpql/hql
//	private static final String Q_GET_ALL_ITEM_GROUP = "" 
//			+ "FROM ItemGroup";
//	
//	@Override
//	public List<ItemGroup> getAll() {
//		return openSession().createQuery(Q_GET_ALL_ITEM_GROUP, ItemGroup.class).getResultList();
//}
	
	
	
	@Override
	public List<ItemGroup> getAll() {
		return openSession().createNamedQuery(ItemGroup.Q_GET_ALL, ItemGroup.class).getResultList();
	}
	
	private static final String Q_COUNT_ITEMS_BY_ITEM_GROUP = ""
			+ " SELECT itg.ID,\n" + ItemGroupDto.PROP_IG_ID + " ,\n"
			+ "		   itg.NAME " + ItemGroupDto.PROP_IG_NAME + ",\n"
			+ "	       sum(itd.AMOUNT) " + ItemGroupDto.PROP_TOTAL_OF_ITEMS + ",\n"
			+ "	       group_concat(concat(it.ID, '-', it.NAME, '-', itd.SIZE_ID, '-', itd.AMOUNT) SEPARATOR ', ') ITEM_DETAILS_INFO\n"
			+ " FROM item_group itg\n"
			+ "	JOIN item it\n"
			+ "		ON itg.ID = it.ITEM_GROUP_ID\n"
			+ " JOIN item_detail itd\n"
			+ "		ON itd.ITEM_ID = it.ID\n"
			+ " GROUP BY itg.ID, itg.NAME";
	
	@SuppressWarnings({"unchecked", "deprecation"})
	@Override
	public List<ItemGroupDto> countItemsByItemGroup() {
		
		return openSession().createNativeQuery(Q_COUNT_ITEMS_BY_ITEM_GROUP)
				.addScalar(ItemGroupDto.PROP_IG_ID, IntegerType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_IG_NAME, StringType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_TOTAL_OF_ITEMS, LongType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_IG_ITEMS, StringType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class))
				.getResultList();
				
	}
	
	@Override
		public ItemGroup get(int id) {
		// hỗ trợ khi entity instance theo id 
		// truy vấn theo thuộc tính 
			return openSession().get(ItemGroup.class, id);
		}
	
	@Override
		public ItemGroup get(String name) {
			return openSession().createNativeQuery(Q_GET_ITEM_GROUP_BY_NAME, getEntityClass() )
					.setParameter("pName", name, org.hibernate.type.StringType.INSTANCE)
					.uniqueResult(); //  get 1 phần tử -> trả về null nếu not found
					
					//.getSingleResult(); ném ra exception
					
					
		}
	
	private  Class<ItemGroup> getEntityClass(){
		return ItemGroup.class;
	}
	
	
	}


	
	
