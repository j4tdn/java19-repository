package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Item;
import persistence.ItemGroup;
import persistence.dto.ItemDetailDto;
import utils.DateUtils;
import utils.SqlUtils;

public class JdbcItemDao implements ItemDao{

	private static final String GET_ALL_ITEMS = " "
			+ "SELECT it.*,\n"
			+ "		  ig.ID IG_ID,"
			+ "		  ig.NAME IG_NAME\n"
			+ "	FROM  ITEM it\n"
			+ "	JOIN  ITEM_GROUP ig\n"
			+ "	 ON   it.ITEM_GROUP_ID = ig.ID";
	
	private static final String GET_ITEMS_BY_SALES_DATE = ""
			+ "SELECT it.*\n"
			+ "FROM ITEM it\n" 
			+ "JOIN ITEM_DETAIL id\n" 
			+ "ON it.ID = id.ITEM_ID\n"
			+ "JOIN ORDER_DETAIL odd\n" 
			+ "ON odd.ITEM_DETAIL_ID = id.ID\n"
			+ "JOIN `order` od\n"
			+ "ON odd.ORDER_ID = od.ID\n"
			+ "WHERE CAST(od.CREATED_AT AS DATE) = ?";
	
	private static final String GET_ITEM_DETAILS = ""
			+ " WITH CTE_ITEM_GROUP_DETAIL AS\n"
			+ "(\n"
			+ "	SELECT itg.ID        ITEM_GROUP_ID,\n"
			+ "           itg.NAME      ITEM_GROUP_NAME,\n"
			+ "           it.ID         ITEM_ID,\n"
			+ "           it.NAME       ITEM_NAME,\n"
			+ "           itd.ID        ITEM_DETAIL_ID,\n"
			+ "           itd.SIZE_ID   SIZE,\n"
			+ "           itd.AMOUNT    AMOUNT\n"
			+ "	  FROM item_group itg\n"
			+ "	  JOIN item it\n"
			+ "		ON itg.ID = it.ITEM_GROUP_ID\n"
			+ "	  JOIN item_detail itd\n"
			+ "		ON it.ID = itd.ITEM_ID\n"
			+ "),\n"
			+ "CTE_ITEM_GROUP_MAX_AMOUNT AS \n"
			+ "(\n"
			+ "	SELECT ITEM_GROUP_ID,\n"
			+ "		   ITEM_GROUP_NAME,\n"
			+ "		   MAX(AMOUNT) MAX_REMAINNING_ITEM_AMOUNT\n"
			+ "	  FROM CTE_ITEM_GROUP_DETAIL\n"
			+ "	  GROUP BY ITEM_GROUP_ID, ITEM_GROUP_NAME\n"
			+ ")\n"
			+ "SELECT itg_d.ITEM_ID,\n"
			+ "	   itg_d.ITEM_NAME,\n"
			+ "       itg_d.SIZE,\n"
			+ "       itg_d.AMOUNT,\n"
			+ "       itg_d.ITEM_GROUP_ID,\n"
			+ "       itg_d.ITEM_GROUP_NAME\n"
			+ "  FROM CTE_ITEM_GROUP_DETAIL itg_d\n"
			+ "  JOIN CTE_ITEM_GROUP_MAX_AMOUNT itg_max\n"
			+ "    ON itg_d.ITEM_GROUP_ID = itg_max.ITEM_GROUP_ID\n"
			+ "   AND itg_d.AMOUNT = itg_max.MAX_REMAINNING_ITEM_AMOUNT";
	
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public JdbcItemDao() {
		connection = DbConnection.getConnection();
	}
	
	
	@Override
	public List<Item> getAll() {
		List<Item> result = new ArrayList<>();
		try {
			pst = connection.prepareStatement(GET_ALL_ITEMS);
			rs = pst.executeQuery();
			while(rs.next()) {
				Item item = new Item();
				item.setId(rs.getInt("ID"));
				item.setName(rs.getString("NAME"));
				item.setMaterial(rs.getString("MATERIAL"));
				item.setBuyPrice(rs.getBigDecimal("BUY_PRICE"));
				item.setColor(rs.getString("COLOR"));
				//Quan tâm đến tên column(alias) khi query trả về 
				ItemGroup group = new ItemGroup(rs.getInt("IG_ID"), rs.getString("IG_NAME"));
				item.setGroup(group);
				result.add(item);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,pst);
		}
		
		return result;
	}
	
	@Override
	public List<Item> getItemBySalesDate(LocalDate date) {
		List<Item> result = new ArrayList<>();
		try {
			pst = connection.prepareStatement(GET_ITEMS_BY_SALES_DATE);
			pst.setDate(1, DateUtils.toSqlDate(date));
			rs = pst.executeQuery();
			while(rs.next()) {
				Item item = new Item();
				item.setId(rs.getInt("ID"));
				item.setName(rs.getString("NAME"));
				item.setMaterial(rs.getString("MATERIAL"));
				item.setBuyPrice(rs.getBigDecimal("BUY_PRICE"));
				item.setColor(rs.getString("COLOR"));
				//Quan tâm đến tên column(alias) khi query trả về 
				result.add(item);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,pst);
		}
		
		return result;
		
	}
	
	@Override
	public List<ItemDetailDto> getITemDetails() {
			List<ItemDetailDto> result = new ArrayList<>();
			try {
				pst = connection.prepareStatement(GET_ITEM_DETAILS);
				rs = pst.executeQuery();
				while(rs.next()) {
					ItemDetailDto item = new ItemDetailDto();
					item.setItemId(rs.getInt("ITEM_ID"));
					item.setItemName(rs.getString("ITEM_NAME"));
					item.setSize(rs.getInt("SIZE"));
					item.setAmount(rs.getInt("Amount"));
					item.setGroup(new ItemGroup(rs.getInt("ITEM_GROUP_ID"), rs.getString("ITEM_GROUP_NAME")));
					//Quan tâm đến tên column(alias) khi query trả về 
					ItemGroup group = new ItemGroup(rs.getInt("ITEM_GROUP_ID"), rs.getString("ITEM_GROUP_NAME"));
					item.setGroup(group);
					result.add(item);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				SqlUtils.close(rs,pst);
			}
			
			return result;
		
	}
	
	@Override
	public void updateItemDetails() {
		
		final String sql1 = " UPDATE ITEM_DETAIL SET AMOUNT = 177 WHERE ID = 1;";
		final String sql2 = " UPDATE ITEM_DETAIL SET AMOUNT = 277 WHERE ID = 2";
		
		try {
			connection.setAutoCommit(false);
			
			// begin transaction
			pst = connection.prepareStatement(sql1);
			pst.executeUpdate();
			
			pst = connection.prepareStatement(sql2);
			pst.executeUpdate();
			// end transaction
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			rollback();
		} finally {
			SqlUtils.close(pst);
		}
		
	}
	
	private void rollback() {
		try {
			connection.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
