package view;

import org.hibernate.Session;

import connection.DbConnection;

public class Ex01TestConnection {
	public static void main(String[] args) {
		// factory is used to produce sessions 
		
		// session: hiểu đơn giản là 1 thread giúp mình truy cập - thực hiện truy vấn database 
		
		
		final var sessionFactory = DbConnection.getSessionFactory();
		
		System.out.println("sessionFactory -> " + sessionFactory + "\n");
		
		// có 2 loại session
		
		// openSession: luôn tạo session mới
		Session session1 = sessionFactory.openSession();
		Session session2 = sessionFactory.openSession();
		
		System.out.println("session 1 -> " + session1);
		System.out.println("session 2 -> " + session2);
		
		// currentSession: tạo ra duy nhất 1 session từ sessionFactory 
		Session session3 = sessionFactory.getCurrentSession();
		Session session4 = sessionFactory.getCurrentSession();
		
		System.out.println("session 3 -> " + session3);
		System.out.println("session 4 -> " + session4);
		
	}
}
