package view;

import connection.DbConnection;
import connection.DbProvider;

public class Ex01TestDnConnection {
	public static void main(String[] args) {
		System.out.println("connection --> " + DbConnection.getConnection());
	}
}
