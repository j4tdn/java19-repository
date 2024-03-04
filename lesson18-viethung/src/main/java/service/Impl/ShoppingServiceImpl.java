package service.Impl;

import connection.DbConnection;
import org.hibernate.Session;
import org.hibernate.query.Query;
import persistence.entities.Sale;
import service.ShoppingService;

import java.util.Date;
import java.util.List;

public class ShoppingServiceImpl implements ShoppingService {
    @Override
    public List<Sale> findBySaleDateOrderByCreatedTimeDescIdAsc(Date saleDate) {
        Session session = DbConnection.getSessionFactory().openSession();
        try {
            String hql = "FROM Sale s WHERE s.saleDate = :saleDate ORDER BY s.createdTime DESC, s.id ASC";
            Query<Sale> query = session.createQuery(hql, Sale.class);
            query.setParameter("saleDate", saleDate);
            return query.getResultList();
        } finally {
            session.close();
        }
    }

    @Override
    public List<Object[]> getInventorySummary() {
        Session session = DbConnection.getSessionFactory().openSession();
        try {
            String hql = "SELECT i.item.id, i.item.name, SUM(i.quantity) " +
                    "FROM Inventory i " +
                    "GROUP BY i.item.id, i.item.name";
            Query<Object[]> query = session.createQuery(hql);
            return query.getResultList();
        } finally {
            session.close();
        }
    }

    @Override
    public List<String> getTop3BestSellingItems(int year) {
        Session session = DbConnection.getSessionFactory().openSession();
        try {
            String hql = "SELECT s.item.name " +
                    "FROM Sale s " +
                    "WHERE YEAR(s.saleDate) = :year " +
                    "GROUP BY s.item.id, s.item.name " +
                    "ORDER BY SUM(s.quantity) DESC, s.item.id DESC";
            Query<String> query = session.createQuery(hql, String.class);
            query.setParameter("year", year);
            query.setMaxResults(3);
            return query.getResultList();
        } finally {
            session.close();
        }
    }

    public List<Object[]> getItemDetails() {
        Session session = DbConnection.getSessionFactory().openSession();
        try {
            String hql = "SELECT i.id, i.name, i.color, i.material, i.image1, i.image2, i.lastUpdate, i.supplier.id, i.category.name " +
                    "FROM Item i " +
                    "ORDER BY i.category.name";
            Query<Object[]> query = session.createQuery(hql);
            return query.getResultList();
        } finally {
            session.close();
        }
    }
}
