package dao;

import java.util.function.Consumer;

import javax.persistence.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import connection.DbConnection;

public class BaseHibernateDao {
	private SessionFactory sessionFactory;
	
	BaseHibernateDao() {
		sessionFactory = DbConnection.getSessionFactory();
	}
	
	Session openSession() {
		return sessionFactory.openSession();
	}
	
	Session getCurrSession() {
		return sessionFactory.getCurrentSession();
	}
	
	void executeWithTransaction(Consumer<Session> consumer) {
		Session session= openSession();
		Transaction transaction = session.beginTransaction();
		try{
			consumer.accept(session);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}
	
	void clear2ndCache() {
		Cache cache = sessionFactory.getCache();
		cache.evictAll();
	}
}
