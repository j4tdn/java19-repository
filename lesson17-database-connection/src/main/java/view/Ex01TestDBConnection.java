package view;

import connection.DbConnection;

public class Ex01TestDBConnection {
public static void main(String[] args) {
	System.out.println("connection -> " + DbConnection.getConnection());
}
}
