package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao {

	private Connection connection;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	private static final String Q_GET_ALL_ITEM_GROUPS = "" + "SELECT * FROM item_group";
//	private static final String Q_GET_ALL_ITEM_GROUP_BY_ID = "" + "SELECT * FROM item_group WHERE ID = ";
	private static final String Q_GET_ALL_ITEM_GROUP_BY_ID = "" + "SELECT * FROM item_group WHERE ID = ?";

	private static final String Q_COUNT_ITEMS_BY_ITEM_GROUP = ""
			+ "SELECT itg.ID,\n"
			+ "	   itg.NAME,\n"
			+ "       sum(itd.AMOUNT) TOTAL_OF_ITEMS,\n"
			+ "	   group_concat(concat(it.ID, '-', it.NAME, '-', itd.SIZE_ID, '-', itd.AMOUNT) SEPARATOR ', ') ITEM_DETAILS_INFO\n"
			+ "  FROM item_group itg\n"
			+ "  JOIN item it\n"
			+ "    ON itg.ID = it.ITEM_GROUP_ID\n"
			+ "  JOIN item_detail itd\n"
			+ "    ON itd.ITEM_ID = it.ID\n"
			+ " GROUP BY itg.ID, itg.NAME";
	/**
	 * Constructor
	 */
	public JdbcItemGroupDao() {
		connection = DbConnection.getConnection();
	}

	@Override
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList();
		try {
			st = connection.createStatement();
			rs = st.executeQuery(Q_GET_ALL_ITEM_GROUPS);

			while (rs.next()) {
				ItemGroup ig = new ItemGroup();
				ig.setId(rs.getInt("ID"));
				ig.setName(rs.getString("NAME"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	/*
	 * @Override public ItemGroup get(int id) { ItemGroup result = null; try { st =
	 * connection.createStatement(); rs = st.executeQuery(Q_GET_ALL_ITEM_GROUP_BY_ID
	 * + id);
	 * 
	 * if (rs.next()) { result = new ItemGroup(rs.getInt("ID"),
	 * rs.getString("NAME")); } } catch (SQLException e) { e.printStackTrace(); }
	 * finally { SqlUtils.close(rs, st); } return result; }
	 */

	@Override
	public ItemGroup get(int id) {
		ItemGroup result = null;
		try {
			pst = connection.prepareStatement(Q_GET_ALL_ITEM_GROUP_BY_ID);
			pst.setInt(1, id);
			rs = pst.executeQuery();

			if (rs.next()) {
				result = new ItemGroup(rs.getInt("ID"), rs.getString("NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

//	@Override
//	public ItemGroup get(String name) {
//		ItemGroup result = null;
//		String sql = "SELECT * FROM item_group WHERE NAME = '"+ name + "'";
//		try {
//			
//			st = connection.createStatement();
//			rs = st.executeQuery(sql);
//
//			if (rs.next()) {
//				result = new ItemGroup(rs.getInt("ID"), rs.getString("NAME"));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			SqlUtils.close(rs, st);
//		}
//		return result;
//	}

	@Override
	public ItemGroup get(String name) {
		ItemGroup result = null;
		String sql = "SELECT * FROM item_group WHERE NAME = ?";
		try {

			pst = connection.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();

			while (rs.next()) {
				result = new ItemGroup(rs.getInt("ID"), rs.getString("NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
	@Override
	public List<ItemGroupDto> countItemsByItemGroup() {
		List<ItemGroupDto> result = new ArrayList<>();
		String sql = "SELECT * FROM item_group WHERE NAME = ?";
		try {
			st = connection.createStatement();
			rs = st.executeQuery(Q_COUNT_ITEMS_BY_ITEM_GROUP);
			while (rs.next()) {
				ItemGroupDto ig = new ItemGroupDto();
				
				ig.setIgId(rs.getInt("ID"));
				ig.setIgName(rs.getString("NAME"));
				ig.setTotalOfItems(rs.getLong("TOTAL_OF_ITEMS"));
				ig.setItems(rs.getString("ITEM_DETAILS_INFO"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
}
