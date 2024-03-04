package dao;

import java.sql.PreparedStatement;
import java.util.Collection;
import java.util.List;

import javax.swing.GroupLayout.Group;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.StringType;

import com.mysql.cj.xdevapi.PreparableStatement;

import persistence.dto.ItemGroupDto;
import persistence.entities.ItemGroup;

public class HibernateItemGroupDao extends BaseHibernateDao implements ItemGroupDao {

	
	private static final int BATCH_SIZE = 50;
	// native query: viết query ở dạng ngôn ngữ sql/oracle
	// jpql/ hql : viết query ở djang entities/attributes
	// hibernate tự chuyển sang native db mà mình đang kết nối
//	private static final String Q_GET_ALL_ITEM_GROUPS = "" + "SELECT * FROM item_group";
	private static final String Q_GET_ALL_ITEM_GROUPS = "FROM ItemGroup";
	private static final String Q_GET_ITEM_GROUP_BY_NAME = "SELECT * FROM item_group WHERE NAME = :pName";

	private static final String Q_MERGE_ITEM_GROUP = ""
			+ "CALL P_MERGE_INTO_ITEM_GROUP(:pId, :pName)";
	
	private static final String Q_INSERT_ITEM_GROUP = ""
			+ "INSERT INTO item_group(ID, NAME)\n"
			+"VALUES(?,?)";
//	@Override
//	public List<ItemGroup> getAll() {
//		return openSession().createNativeQuery(Q_GET_ALL_ITEM_GROUPS, ItemGroup.class)
//				.getResultList();
//	}

	// jpql/ hql
	@Override
	public List<ItemGroup> getAll() {
		return openSession().createQuery(Q_GET_ALL_ITEM_GROUPS, ItemGroup.class).getResultList();
	}

//	@Override
//	public List<ItemGroup> getAll() {
//		return openSession().createNamedQuery(ItemGroup.Q_GET_ALL, ItemGroup.class)
//				.getResultList();
//	}

	@Override
	public ItemGroup get(int id) {
		return openSession().get(ItemGroup.class, id);
	}

	@Override
	public ItemGroup get(String name) {
		NativeQuery<ItemGroup> nativeQuery = openSession().createNativeQuery(Q_GET_ITEM_GROUP_BY_NAME, ItemGroup.class);
		nativeQuery.setParameter("pName", name, StringType.INSTANCE);

		return nativeQuery.uniqueResult();
	}

	private static final String Q_COUNT_ITEMS_BY_ITEM_GROUP = "" + "SELECT itg.ID " + ItemGroupDto.PROP_IG_ID + " ,\n"
			+ "	   itg.NAME " + ItemGroupDto.PROP_IG_NAME + " ,\n" + "       sum(itd.AMOUNT) "
			+ ItemGroupDto.PROP_TOTAL_OF_ITEMS + " ,\n"
			+ "	   group_concat(concat(it.ID, '-', it.NAME, '-', itd.SIZE_ID, '-', itd.AMOUNT) SEPARATOR ', ') "
			+ ItemGroupDto.PROP_ITEMS + "\n" + "  FROM item_group itg\n" + "  JOIN item it\n"
			+ "    ON itg.ID = it.ITEM_GROUP_ID\n" + "  JOIN item_detail itd\n" + "    ON itd.ITEM_ID = it.ID\n"
			+ " GROUP BY itg.ID, itg.NAME";

//	@Override
//	public List<ItemGroupDto> countItemsByItemGroup() {
//		@SuppressWarnings("unchecked")
//		List<Object[]> rows = openSession().createNativeQuery(Q_COUNT_ITEMS_BY_ITEM_GROUP)
//				.getResultList();
//		
//		List<ItemGroupDto> result = new ArrayList();
//		for(Object[] row : rows) {
//			ItemGroupDto itemGroupDto = new ItemGroupDto();
//			itemGroupDto.setIgId(Integer.parseInt(String.valueOf(row[0])));
//			itemGroupDto.setIgName(String.valueOf(row[1]));
//			itemGroupDto.setTotalOfItems(Long.parseLong(String.valueOf(row[2])));
//			itemGroupDto.setItems(String.valueOf(row[3]));
//			result.add(itemGroupDto);
//		}
//		return result;
//	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ItemGroupDto> countItemsByItemGroup() {

		return openSession().createNativeQuery(Q_COUNT_ITEMS_BY_ITEM_GROUP)
				.addScalar(ItemGroupDto.PROP_IG_ID, IntegerType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_IG_NAME, StringType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_TOTAL_OF_ITEMS, LongType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_ITEMS, StringType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class)).getResultList();
	}

	@Override
	public void save(ItemGroup itemGroup) {
		executeWithTransaction(session -> session.save(itemGroup));
	}

	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		executeWithTransaction(session -> session.saveOrUpdate(itemGroup));
	}

	@Override
	public void merge(ItemGroup itemGroup) {
		openSession().createNativeQuery(Q_MERGE_ITEM_GROUP)
		.setParameter("pId", itemGroup.getId(), StandardBasicTypes.INTEGER)
		.setParameter("pName", itemGroup.getName(), StandardBasicTypes.STRING)
		.executeUpdate();
	}
	
	@Override
	public void save(Collection<ItemGroup> itemGroups) {
		executeWithTransaction(session ->{
			session.doWork(connection ->{
				try(PreparedStatement pst = connection.prepareStatement(Q_INSERT_ITEM_GROUP)) {
					int batchCount = 0;
					for(ItemGroup itemGroup : itemGroups) {
						pst.setInt(1, itemGroup.getId());
						pst.setString(2, itemGroup.getName());
						pst.addBatch();
						if(batchCount %BATCH_SIZE == 0) {
							pst.executeBatch();
						}
						
						pst.executeBatch();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		});
	}
}














