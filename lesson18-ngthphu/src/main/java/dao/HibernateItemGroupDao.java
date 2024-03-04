package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;


import dto.ItemGroupDto;

public class HibernateItemGroupDao extends BaseHibernateDao implements ItemGroupDao {

	private static final String Q_GET_ITEM_GROUP_STOCK = "" + "SELECT ig.ID " + ItemGroupDto.PROP_IG_ID + ", ig.NAME "
			+ ItemGroupDto.PROP_IG_NAME + ", sum(itd.AMOUNT) " + ItemGroupDto.PROP_AMOUNT_OF_ITEMS + "\r\n"
			+ "  FROM item it\r\n" + "  JOIN item_group ig\r\n" + "    ON ig.ID = it.ITEM_GROUP_ID\r\n"
			+ "  JOIN item_detail itd\r\n" + "    ON it.ID = itd.ITEM_ID\r\n" + " GROUP BY ig.ID;";

	public List<ItemGroupDto> getItemStock() {

		NativeQuery<?> query = openSession().createNativeQuery(Q_GET_ITEM_GROUP_STOCK);

		query.addScalar(ItemGroupDto.PROP_IG_ID, IntegerType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_IG_NAME, StringType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_AMOUNT_OF_ITEMS, LongType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));

		return safeList(query);
	}

}
