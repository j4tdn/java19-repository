package dao;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LocalDateTimeType;
import org.hibernate.type.StringType;

import persistence.dto.ItemDto;
import persistence.entities.Item;

public class HibernateItemDao extends BaseHibernateDao implements ItemDao {
	private static final String Q_GET_ITEM_BY_DATE = "" + 
			"SELECT it.id "+ItemDto.PROP_ID+", \n" 
			+"it.`NAME`"+ItemDto.PROP_NAME+", \n"
			+"od.CREATED_AT "+ItemDto.PROP_LOCAL_DATE+" \n"
			+ "from item it " + 
			"join item_detail id " + 
			"on id.ITEM_ID = it.ID " + 
			"join order_detail odd "
			+ "on odd.ITEM_DETAIL_ID = id.ID " + 
			"join `order` od " + "on od.ID = odd.ORDER_ID "
			+ "WHERE CAST(od.CREATED_AT AS DATE) = :pDate";
	
	private static final String Q_GET_ITEM_DETAILS_INFO = "" +
	        "SELECT it.`NAME` \n" +
	        "FROM item it " +
	        "JOIN item_detail id ON id.ITEM_ID = it.ID " +
	        "JOIN order_detail odd ON odd.ITEM_DETAIL_ID = id.ID " +
	        "JOIN `order` od ON od.ID = odd.ORDER_ID " +
	        "WHERE CAST(od.CREATED_AT AS DATE) = '2023-09-07' " +
	        "ORDER BY id.AMOUNT DESC " +
	        "LIMIT 3";
	
	private static final String Q_GET_ALL_ITEMS = ""
			+ "SELECT * FROM item";


	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ItemDto> getItemByDate(LocalDateTime lDateTime) {
		return openSession().createNativeQuery(Q_GET_ITEM_BY_DATE)
				.setParameter("pDate", lDateTime.toLocalDate())
				.addScalar(ItemDto.PROP_ID, IntegerType.INSTANCE)
				.addScalar(ItemDto.PROP_NAME, StringType.INSTANCE)
				.addScalar(ItemDto.PROP_LOCAL_DATE, LocalDateTimeType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemDto.class)).getResultList();
	}
	
	@Override
	public List<String> topThreeItemBestSeller() {
		return openSession().createNativeQuery(Q_GET_ITEM_DETAILS_INFO)
				.getResultList();
	}
	
	@Override
	public List<Item> getAll() {
		return openSession().createNativeQuery(Q_GET_ALL_ITEMS, Item.class)
				.getResultList();
	}
}
