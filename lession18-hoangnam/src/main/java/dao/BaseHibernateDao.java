package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.DbConnection;

public class BaseHibernateDao {
	
	private SessionFactory sessionFactory;
	
	BaseHibernateDao() {
		sessionFactory = DbConnection.getSessionFactory();
	}
	
	Session openSession() {
		return sessionFactory.openSession();
	}
	
	Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
}
