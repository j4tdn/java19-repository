package dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LocalDateTimeType;
import org.hibernate.type.StringType;


import dto.ItemDto;
import persistence.Item;

public class HibernateItemDao extends BaseHibernateDao implements ItemDao {

	private static final String Q_GET_ITEMS = "" + "SELECT it.ID " + ItemDto.PROP_ID + ", it.NAME " + ItemDto.PROP_NAME
			+ ", it.COLOR " + ItemDto.PROP_COLOR + ", it.MATERIAL " + ItemDto.PROP_MATERIAL + ", \r\n" + "it.IMAGE_01 "
			+ ItemDto.PROP_IMAGE01 + ", it.IMAGE_02 " + ItemDto.PROP_IMAGE02 + ", it.LAST_UPDATED_AT "
			+ ItemDto.PROP_LAST_UPDATE_AT + ", it.ITEM_GROUP_ID " + ItemDto.PROP_ITEMGROUP_ID + "it.PROVIDER_ID "
			+ ItemDto.PROP_PROVIDER_ID + ", itg.NAME " + ItemDto.PROP_ITEMGROUP_NAME + "\r\n" + "FROM item it\r\n"
			+ "JOIN item_group itg\r\n" + "ON it.ITEM_GROUP_ID = itg.ID\r\n" + "order by it.ITEM_GROUP_ID";
	
	private static final String GET_ITEM_BY_CREATED_AT = ""
			+ "SELECT 	it.ID,\n"
			+ "		it.`NAME`,\n"
			+ "        od.CREATED_AT\n"
			+ "  FROM 	item it\n"
			+ "  JOIN 	order_detail odd\n"
			+ "  ON 	it.ID = odd.ITEM_ID\n"
			+ "  JOIN 	`order` od\n"
			+ "  ON 	odd.ORDER_ID = od.ID\n"
			+ "  WHERE od.CREATED_AT = ':pcreateAt'\n"
			+ "  GROUP BY it.ID;";

	public List<ItemDto> getAllByItemGroupId() {

		NativeQuery<?> query = openSession().createNativeQuery(Q_GET_ITEMS);

		query.addScalar(ItemDto.PROP_ID, IntegerType.INSTANCE).addScalar(ItemDto.PROP_NAME, StringType.INSTANCE)
				.addScalar(ItemDto.PROP_COLOR, StringType.INSTANCE)
				.addScalar(ItemDto.PROP_MATERIAL, StringType.INSTANCE)
				.addScalar(ItemDto.PROP_IMAGE01, StringType.INSTANCE)
				.addScalar(ItemDto.PROP_IMAGE02, StringType.INSTANCE)
				.addScalar(ItemDto.PROP_ITEMGROUP_ID, StringType.INSTANCE)
				.addScalar(ItemDto.PROP_LAST_UPDATE_AT, LocalDateTimeType.INSTANCE)
				.addScalar(ItemDto.PROP_PROVIDER_ID, IntegerType.INSTANCE)
				.addScalar(ItemDto.PROP_ITEMGROUP_NAME, StringType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemDao.class));

		return safeList(query);
	}
	
	@Override
	public Item getItem(LocalDateTime createAt) {
		// TODO Auto-generated method stub
		return null;
	}
}
