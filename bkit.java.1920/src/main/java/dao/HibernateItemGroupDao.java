package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistence.dto.bai2DTO;

public class HibernateItemGroupDao extends BaseHibernateDao implements ItemGroupDao {
	
	private static String Q_THONG_KE = "select it.id ID, it.name NAME, sum(id.amount) amount_of_items \n"
			+ "from \n"
			+ "item_group it join item i \n"
			+ "on it.id = i.item_group_id\n"
			+ "join item_detail id on i.id = id.item_id\n"
			+ "group by it.id";
	
	public List<bai2DTO> thongke(){
		return openSession().createNativeQuery(Q_THONG_KE)
				.addScalar(bai2DTO.PROP_IG_ID, IntegerType.INSTANCE)
				.addScalar(bai2DTO.PROP_IG_NAME, StringType.INSTANCE)
				.addScalar(bai2DTO.PROP_AMOUNT_OF_ITEMS, IntegerType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(bai2DTO.class)).getResultList();
	
	}
}