package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;

import persistence.dto.ItemByDate;
import persistence.dto.ItemCount;
import persistence.entities.Item;
import persistence.entities.ItemGroup;

public class HibernateItemGroupDao extends BaseHibernateDao implements ItemGroupDao {

	private static final String Q_GET_ALL_ITEM_GROUPS = "" + "SELECT * FROM item_group";

	private static final String Q_GET_ALL_ITEM = "" + "SELECT * FROM item";

	private static final String Q_COUNT_NUMBER_OF_ITEM_BY_ITEMGROUP = ""
			+ "SELECT ig.id as igId, ig.NAME AS igName, sum(Amount) AS totalOfItems\r\n" + "FROM ITEM_GROUP ig\r\n"
			+ "JOIN ITEM i ON ig.ID = i.ITEM_GROUP_ID\r\n" + "JOIN ITEM_DETAIL id ON i.ID = id.ITEM_ID\r\n"
			+ "GROUP BY ig.NAME;";

	private static final String Q_GET_ITEM_BY_DATE = "" + "SELECT item.ID as igId, item.NAME as igName,\r\n"
			+ "       cast(CREATED_AT AS DATE) createTime\r\n" + "  FROM `order`\r\n" + "  JOIN order_detail\r\n"
			+ "  ON `order`.ID = order_detail.ORDER_ID\r\n" + "  JOIN item_detail\r\n"
			+ "  ON item_detail.ID = order_detail.ITEM_DETAIL_ID\r\n" + "  JOIN item \r\n"
			+ "  ON item_detail.ITEM_ID = item.ID\r\n"
			+ "  WHERE cast(CREATED_AT AS DATE) = str_to_date(:pDate, '%d/%m/%Y');";

	@Override
	public List<ItemGroup> getAll() {
		return openSession().createNativeQuery(Q_GET_ALL_ITEM_GROUPS, ItemGroup.class).getResultList();
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ItemCount> getCountItemByItemGroup() {
		return openSession().createNativeQuery(Q_COUNT_NUMBER_OF_ITEM_BY_ITEMGROUP)
				.addScalar(ItemCount.PROP_IG_ID, IntegerType.INSTANCE)
				.addScalar(ItemCount.PROP_IG_NAME, StringType.INSTANCE)
				.addScalar(ItemCount.PROP_TOTAL_OF_ITEMS, LongType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemCount.class)).getResultList();
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ItemByDate> getItemByDate(String date) {
		return openSession().createNativeQuery(Q_GET_ITEM_BY_DATE).setParameter("pDate", date, StringType.INSTANCE)
				.addScalar(ItemByDate.PROP_IG_ID, IntegerType.INSTANCE)
				.addScalar(ItemByDate.PROP_IG_NAME, StringType.INSTANCE)
				.addScalar(ItemByDate.PROP_CREATE_DATE, LongType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemByDate.class)).getResultList();
	}

	@Override
	public List<Item> getAllItemByItemGroup() {
		return openSession().createNativeQuery(Q_GET_ALL_ITEM, Item.class).getResultList();
	}

}
