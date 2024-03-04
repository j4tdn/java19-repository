package dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LocalDateType;
import org.hibernate.type.LocalTimeType;
import org.hibernate.type.StringType;

import persistence.dto.ItemDto;
import persistence.dto.ItemStatisticDto;
import persistence.entities.Item;

public class HibenateItemDao extends BaseHibernateDao implements ItemDao {

	private static final String Q_GET_ALL_ITEMS = "SELECT * FROM item";
	
	private static final String Q_GET_ITEMS_BY_SALES_DATE = 
			"SELECT it.ID,\r\n"
			+ "	    it.NAME,\r\n"
			+ "        TIME(od.CREATED_AT) CREATED_TIME\r\n"
			+ "  FROM item it\r\n"
			+ "  JOIN item_detail itd\r\n"
			+ "    ON it.ID = itd.ITEM_ID\r\n"
			+ "  JOIN order_detail odd\r\n"
			+ "    ON odd.ITEM_DETAIL_ID = itd.ID\r\n"
			+ "  JOIN `order` od\r\n"
			+ "    ON od.ID = odd.ORDER_ID\r\n"
			+ " WHERE DATE(od.CREATED_AT) = :salesDate \r\n"
			+ " ORDER BY od.CREATED_AT DESC, it.ID ASC;";

	private static final String Q_STATISTIC_ITEM_IN_SHOPPING = 
			  "  SELECT IG.ID AS 'ID',\r\n"
			+ "         IG.NAME AS 'NAME',\r\n"
			+ "         SUM(ID.AMOUNT) AS 'AMOUNT_OF_ITEMS'\r\n"
			+ "    FROM ITEM_GROUP IG\r\n"
			+ "    JOIN ITEM I "
			+ "      ON IG.ID = I.ITEM_GROUP_ID\r\n"
			+ "    JOIN ITEM_DETAIL ID "
			+ "      ON I.ID = ID.ITEM_ID\r\n"
			+ "   GROUP BY IG.ID, IG.NAME;";
	
	private static final String Q_TOP_3_BEST_SELL_BY_YEAR = 
		    "SELECT i.name " +
		    "FROM `order` o " +
		    "JOIN order_detail od ON o.id = od.order_id " +
		    "JOIN item_detail id ON od.item_detail_id = id.id " +
		    "JOIN item i ON id.item_id = i.id " +
		    "WHERE YEAR(o.created_at) = :year " +
		    "GROUP BY i.id, i.name " +
		    "ORDER BY SUM(od.amount) DESC, i.id DESC " +
		    "LIMIT 3";
	
	@Override
	public List<Item> getAll() {
		return openSession().createNativeQuery(Q_GET_ALL_ITEMS, getEntityClass()).getResultList();
	}

	private Class<Item> getEntityClass() {
		return Item.class;
	}

	@Override
	public List<ItemDto> getItemsBySalesDate(LocalDate salesDate) {
		return openSession().createNativeQuery(Q_GET_ITEMS_BY_SALES_DATE)
		.addScalar(ItemDto.PROP_IG_ID, IntegerType.INSTANCE)
		.addScalar(ItemDto.PROP_IG_NAME, StringType.INSTANCE)
		.addScalar(ItemDto.PROP_CREATED_AT, LocalTimeType.INSTANCE)
		.setParameter("salesDate", salesDate, LocalDateType.INSTANCE)
		.setResultTransformer(Transformers.aliasToBean(ItemDto.class)).getResultList();
	}

	@Override
	public List<ItemStatisticDto> getItemsForStatistic() {
		return openSession().createNativeQuery(Q_STATISTIC_ITEM_IN_SHOPPING)
				.addScalar(ItemStatisticDto.PROP_IT_ID, IntegerType.INSTANCE)
				.addScalar(ItemStatisticDto.PROP_IT_NAME, StringType.INSTANCE)
				.addScalar(ItemStatisticDto.PROP_AMOUNT_OF_ITEMS, IntegerType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemStatisticDto.class)).getResultList();
	}

	@Override
	public List<String> getThreeBestSellerItems(int year) {
	    return openSession()
	        .createNativeQuery(Q_TOP_3_BEST_SELL_BY_YEAR)
	        .setParameter("year", year)
	        .getResultList();
	}

}
