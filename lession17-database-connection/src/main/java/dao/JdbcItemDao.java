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
import utils.DateUtils;
import utils.SqlUtils;

public class JdbcItemDao implements ItemDao {

	private static final String GET_ALL_ITEMS = "" + "SELECT it.*, " + "ig.ID IG_ID, " + "ig.NAME IG_NAME "
			+ "FROM item it " + "JOIN item_group ig " + "WHERE it.ITEM_GROUP_ID = ig.ID";

	private static final String GET_ITEMS_BY_SALES_DATE = "" 
			+ "SELECT it.*, " 
			+ "\"2023-09-07\" SALES_DATE "
			+ "from item it " 
			+ "join item_detail id " 
			+ "on id.ITEM_ID = it.ID " 
			+ "join order_detail odd "
			+ "on odd.ITEM_DETAIL_ID = id.ID " 
			+ "join `order` od " 
			+ "on od.ID = odd.ORDER_ID "
			+ "WHERE CAST(od.CREATED_AT AS DATE) = ?";

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
			while (rs.next()) {
				Item item = new Item();
				item.setId(rs.getInt("ID"));
				item.setName(rs.getString("NAME"));
				item.setMaterial(rs.getString("MATERIAL"));
				item.setBuyPrice(rs.getBigDecimal("BUY_PRICE"));
				item.setColor(rs.getString("COLOR"));

				// Quan tâm đến tên alias khi dữ liệu trả về
				ItemGroup group = new ItemGroup(rs.getInt("IG_ID"), rs.getString("IG_NAME"));
				item.setGroup(group);

				result.add(item);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	/*
	 * MySql : DATE, TIME, DATETIME
	 * 
	 * --> JDBC : pst.setDate (java.sql.Date), pst.setTime (java.sql.Time), setDateTime, setTimeStamp
	 * 
	 * 
	 * 
	 * */

	@Override
	public List<Item> getItemsBySaleDate(LocalDate date) {
		List<Item> result = new ArrayList<>();
		try {
			pst = connection.prepareStatement(GET_ITEMS_BY_SALES_DATE);
			pst.setDate(1,  DateUtils.toSqlDate(date));
			rs = pst.executeQuery();

			while (rs.next()) {
				Item item = new Item();
				item.setId(rs.getInt("ID"));
				item.setName(rs.getString("NAME"));
				item.setMaterial(rs.getString("MATERIAL"));
				item.setBuyPrice(rs.getBigDecimal("BUY_PRICE"));
				item.setColor(rs.getString("COLOR"));

				result.add(item);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	@Override
	public void updateItemDetail() {
		final String sql1 = "Update item_detail set AMOUNT = 137 WHERe ID = 1";
		final String sql2 = "Update item_detail set AMOUNT = 227 WHERe ID = 2";
		try {
			connection.setAutoCommit(false);
			
			pst = connection.prepareStatement(sql1);
			pst.executeUpdate();
			
			pst = connection.prepareStatement(sql2);
			pst.executeUpdate();
			
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			SqlUtils.close(pst);
		}
	}

}
