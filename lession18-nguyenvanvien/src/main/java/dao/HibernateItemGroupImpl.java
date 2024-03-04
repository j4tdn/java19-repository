package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistence.dto.ItemGroupDto;

public class HibernateItemGroupImpl extends BaseHibernateDao implements ItemGroupDao {

	private static final String Q_GET_TOTAL_AMOUNT_BY_ITEM_GROUP = "" +
	        "SELECT ig.ID AS " + ItemGroupDto.PROP_ID + ", " +
	        "ig.NAME AS " + ItemGroupDto.PROP_NAME + ", " +
	        "SUM(id.AMOUNT) AS " + ItemGroupDto.PROP_AMOUNT_OF_ITEM + " " +
	        "FROM item_group ig " +
	        "JOIN item it ON it.ITEM_GROUP_ID = ig.ID " +
	        "JOIN item_detail id ON id.ITEM_ID = it.ID " +
	        "GROUP BY ig.ID, ig.NAME";


	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ItemGroupDto> countAmountOfItems() {
		return openSession().createNativeQuery(Q_GET_TOTAL_AMOUNT_BY_ITEM_GROUP)
				.addScalar(ItemGroupDto.PROP_ID, IntegerType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_NAME, StringType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_AMOUNT_OF_ITEM, IntegerType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class)).getResultList();
	}
}
