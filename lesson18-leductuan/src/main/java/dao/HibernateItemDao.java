package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;
import dto.ItemDetailDto;
import persistence.Item;

public class HibernateItemDao extends BaseHibernateDao implements ItemDao {
	private static final String GET_ITEMS = ""
			+ "SELECT *\n"
			+ "  FROM item it\n"
			+ "  JOIN item_group ig\n"
			+ "    ON it.ITEM_GROUP_ID = ig.ID\n"
			+ "  ORDER BY it.ITEM_GROUP_ID";
	
	private static final String GET_ITEMS_BY_CREATED_AT = ""
			+ "SELECT it.ID " + ItemDetailDto.PROP_IT_ID + ",\n"
			+ "       it.`NAME` " + ItemDetailDto.PROP_IT_NAME + ",\n"
			+ "       od.CREATED_AT " + ItemDetailDto.PROP_DATE + "\n"
			+ "  FROM item it\n"
			+ "  JOIN item_detail itd ON it.ID = itd.ITEM_ID\n"
			+ "  JOIN order_detail odd ON itd.ID = odd.ITEM_DETAIL_ID\n"
			+ "  JOIN `order` od ON odd.ORDER_ID = od.ID\n"
			+ " WHERE CAST(od.CREATED_AT AS DATE) = :pCreatedAt";

	@Override
	public List<Item> getItem() {
		return openSession()
				.createNativeQuery(GET_ITEMS, Item.class)
				.getResultList();
	}

	@Override
	public List<ItemDetailDto> getItemByCreateTime(String date) {
		NativeQuery<?> query = openSession()
				.createNativeQuery(GET_ITEMS_BY_CREATED_AT).setParameter("pCreatedAt", date);
		query.addScalar(ItemDetailDto.PROP_IT_ID, IntegerType.INSTANCE)
			.addScalar(ItemDetailDto.PROP_IT_NAME, StringType.INSTANCE)
			.addScalar(ItemDetailDto.PROP_DATE, StringType.INSTANCE)
			.setResultTransformer(Transformers.aliasToBean(ItemDetailDto.class));
		
		return (List<ItemDetailDto>)query.getResultList();
	}
}
