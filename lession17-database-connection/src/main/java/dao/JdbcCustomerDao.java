package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DbConnection;
import persistence.Customer;
import persistence.ItemGroup;
import utils.SqlUtils;

public class JdbcCustomerDao implements CustomerDao {
	
	private final String Q_INSERT_CUSTOMER = ""
			+ "INSERT INTO customer(ID, NAME, EMAIL, ADDRESS, PHONE, PASSWORD)"
			+ "VALUES(?, ?, ?, ?, ?, ?)";
	private final String Q_GET_CUSTOMER_BY_EMAIL_AND_PASSWORD = ""
			+ "SELECT * "
			+ "FROM customer "
			+ "WHERE email = ? AND password = ?";
	
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public JdbcCustomerDao() {
		connection = DbConnection.getConnection();
	}

	@Override
	public void save(Customer customer) {
		try {
			pst = connection.prepareStatement(Q_INSERT_CUSTOMER);
			pst.setInt(1, customer.getId());
			pst.setString(2, customer.getName());
			pst.setString(3, customer.getEmail());
			pst.setString(4, customer.getAddress());
			pst.setString(5, customer.getPhone());
			// Chuyển đổi mk của người dùng sang md5, lưu mã hóa mk vào csdl
			pst.setString(6, SqlUtils.md5(customer.getPasswork()));
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public Customer login(String email, String password) {
		Customer result = null;
		try {
			pst = connection.prepareStatement(Q_GET_CUSTOMER_BY_EMAIL_AND_PASSWORD);
			pst.setString(1, email);
			pst.setString(2, SqlUtils.md5(password));
			rs = pst.executeQuery();
			while (rs.next()) {
				result = new Customer();
				result.setId(rs.getInt("ID"));
				result.setName(rs.getString("NAME"));
				result.setAddress(rs.getString("ADDRESS"));
				result.setEmail(rs.getString("EMAIL"));
				result.setPhone(rs.getString("PHONE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}
	
}
