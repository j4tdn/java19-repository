package dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LocalDateType;
import org.hibernate.type.LocalTimeType;
import org.hibernate.type.StringType;

import persistence.dto.ItemByDateDto;

public class HibenateItemDao extends BaseHibernateDao implements ItemDao {

	private static final String Q_GET_ITEMS_BY_DATE = ""
			+ "select i.id " + ItemByDateDto.PROP_IG_ID + ",\n"
			+ "i.name " + ItemByDateDto.PROP_IG_NAME + ",\n"
			+ "TIME(o.created_at)  " + ItemByDateDto.PROP_CREATED_AT + "\n"
			+ "from \n"
			+ "	`order` o join `order_detail` od on o.id = od.order_id \n"
			+ "	join `item_detail` id on od.item_detail_id = id.id \n"
			+ "	join `item` i on id.item_id = i.id \n"
			+ "where DATE(o.created_at) = :pDate \n"
			+ "ORDER BY i.id ASC,  o.created_at DESC"; 

		@SuppressWarnings("unchecked")
		@Override
		public List<ItemByDateDto> getItemByDate(LocalDate localDate) {
			return openSession().createNativeQuery(Q_GET_ITEMS_BY_DATE)
					.addScalar(ItemByDateDto.PROP_IG_ID, IntegerType.INSTANCE)
					.addScalar(ItemByDateDto.PROP_IG_NAME, StringType.INSTANCE)
					.addScalar(ItemByDateDto.PROP_CREATED_AT, LocalTimeType.INSTANCE)
					.setParameter("pDate", localDate, LocalDateType.INSTANCE)
					.setResultTransformer(Transformers.aliasToBean(ItemByDateDto.class)).getResultList();
					
		}
		
		private static final String Q_bai3 = "SELECT i.name\n"
				+ "FROM `order` o\n"
				+ "JOIN `order_detail` od ON o.id = od.order_id\n"
				+ "JOIN `item_detail` id ON od.item_detail_id = id.id\n"
				+ "JOIN `item` i ON id.item_id = i.id\n"
				+ "WHERE DATE(o.created_at) = :pDate\n"
				+ "GROUP BY i.id, i.name\n"
				+ "ORDER BY SUM(od.amount) DESC, i.id DESC\n"
				+ "LIMIT 3" ;

		@Override
		public List<String> bai3(LocalDate localDate) {
			return openSession().createNativeQuery(Q_bai3)
					.setParameter("pDate", localDate, LocalDateType.INSTANCE)
					.getResultList();
		}

}
